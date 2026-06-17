import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.io.BufferedWriter;

public class ActorExportApp {
    public static void main(String[] args){
        Properties props = new Properties();

        //Pegar a senha User e o banco
        try (var input = Files.newInputStream(Paths.get("db.properties"))) {
            props.load(input);
        } catch (IOException e) {
            System.err.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
            return;
        }

        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String password = props.getProperty("password");

        //Testando Conexão com DriveManager
        try (Connection conn = DriverManager.getConnection(url, user, password)){
            //definindo o Statement
            String selectSql = "SELECT actor_id, first_name, last_name from actor ORDER BY actor_id LIMIT 20";

            ArrayList<ActorExport> atores = new ArrayList<>();
            try(PreparedStatement selectps = conn.prepareStatement(selectSql);
            ResultSet rs = selectps.executeQuery()) {

                while (rs.next()) {
                    int id = rs.getInt("actor_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");

                    ActorExport actorExpert = new ActorExport(id, firstName, lastName);
                    atores.add(actorExpert);
                }
        
            }catch(SQLException e) {
                e.printStackTrace();
             }

            Path arquivoSaida = Path.of("actors_export.csv");
            try(BufferedWriter writer = Files.newBufferedWriter(arquivoSaida)){
                writer.write("Id,Nome,Sobrenome");

                writer.newLine();
                for(ActorExport actorExport : atores){
                    writer.write(actorExport.toCsvLine());
                    writer.newLine();
                }
                System.out.println(
                "CSV exportado com sucesso!");
            }catch(IOException e){
                e.printStackTrace();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
