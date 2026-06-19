import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//
public class main{
    public static void main(String[] args){

        String url = "jdbc:postgresql://localhost:5432/dvd_rental";
        String user = "postgres";
        String password = "password";

        //Armazenar o caminho TXT
        String filePath = "09-jdbc/17-jdbc/data/new_films.txt";
        //Converte Linhas do TXT em um Objeto
        List<Filme> FilmesImport = FileReaderFilmes.lerArquivo(filePath);

        //Testar conexao com o Banco de Dados
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            //Queru de Inserção
            String Insertsql = "INSERT INTO film (title, language_id, rental_duration, rental_rate, replacement_cost) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement Insertps = conn.prepareStatement(Insertsql)) {
                for(Filme film : FilmesImport) {
            Insertps.setString(1, film.getTitle());
            Insertps.setInt(2, film.getLanguageId());
            Insertps.setInt(3, film.getRentalDuration());
            Insertps.setDouble(4, film.getRentalRate());
            Insertps.setDouble(5, film.getReplacementCost());
            Insertps.addBatch();
                }
            Insertps.executeBatch();
            }

            //Query de UPDATE
            String Updatesql = "UPDATE film SET rental_rate = rental_rate * 1.1";
            try (PreparedStatement Updateps = conn.prepareStatement(Updatesql)) {
            int UpdateSet  = Updateps.executeUpdate();
             System.out.println( UpdateSet + " registros atualizados.");
            }
             

            //Query de Select
            String selectSql = "SELECT title, rental_rate FROM film WHERE rental_duration = 99";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                ResultSet rs = selectStmt.executeQuery()) {
                
                while (rs.next()) {
                    String Titulo = rs.getString("title");
                    double rentalRate = rs.getDouble("rental_rate");
                    System.out.printf("Título: %-30s | Nova Taxa: R$ %.2f%n", Titulo, rentalRate);
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro na execução das operações do Banco de Dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
