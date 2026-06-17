import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List; 
    
public class FileReaderFilmes{
    public static List<Filme> lerArquivo(String caminho) {
    List<Filme> filmes = new ArrayList<>();
    //Encontrar a diretoria do Aruivo
    Path arquivo = Paths.get("data/new_films.txt");

    try{
        //Ler todas as linahs do arquivo.txt
        List<String> linhas = Files.readAllLines(arquivo);

        //Remover Cabeçalho da Leitura dos dados
        linhas.remove(0);
        for(String linha : linhas) {
            String[] dados = linha.split(";");

            //Converter os Dados
            String title = dados[0].trim();
            int languageId = Integer.parseInt(dados[1].trim()); 
            int rentalDuration = Integer.parseInt(dados[2].trim()); 
            double rentalRate = Double.parseDouble(dados[3].trim()); 
            double replacementCost = Double.parseDouble(dados[4].trim());

            Filme filme = new Filme(title, languageId, rentalDuration, rentalRate, replacementCost);
            filmes.add(filme);
        }

    //Capturar erros de exceção
    }catch(IOException e){
        System.out.println("Arquivo nao encontrado: " + e.getMessage());
    }catch(NumberFormatException e){
        System.out.println("Conversão dos dados Invalida " + e.getMessage());
    }

    return filmes;
 }
}
