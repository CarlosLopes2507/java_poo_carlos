import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class compras {
    public static void main(String[] args){
        ArrayList<String> Clientes = new ArrayList<>();
        ArrayList<Double> Total = new ArrayList<>();

        try{
            Path ArquivoEntrada = Path.of("..", "..", "..", "data", "compras.txt");;
            //Path ArquivoPath = Path.of(args[0]);
            List<String> Linhas = Files.readAllLines(ArquivoEntrada);
            for(String linha : Linhas){
            String[] campos = linha.split(",");
            if(campos.length < 3){
                //ignorar 
                continue;        
            }

            String cliente = campos[0].trim();
            double valor;
            try{
            valor = Double.parseDouble(campos[2].trim());
            }catch(NumberFormatException e){
                continue;
            }

            int position = -1;
            //evitar inserir nomes duplicados e somar preços;
            //Nome
            for(int i = 0; i < Clientes.size(); i++){
                if(Clientes.get(i).equals(cliente)){
                position = i;
                break;
                }
            } 
            //Preço +
            if(position != -1){
                Total.set(position, Total.get(position) + valor);
            } else {
                Clientes.add(cliente);
                Total.add(valor);
             }
            }

            ArrayList<String> relatorio = new ArrayList<>();
            //gerar relatorio
            for(int i = 0; i < Clientes.size(); i++){
                relatorio.add(Clientes.get(i) + ": " + Total.get(i));
            }
            Path ArquivoSaida = Path.of(args[1]);
            //Path.of(args[1]);
            Files.write(ArquivoSaida, relatorio);

        }catch (IOException e){
            System.out.println("Arquivo Nao Encontrado ou deu Erro");
        } 
    }
}
