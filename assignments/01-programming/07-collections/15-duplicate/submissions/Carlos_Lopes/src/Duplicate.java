import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Duplicate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> ListaNomes = new HashSet<>();
        String Nome = "";

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while(true){
            System.out.print("> ");
            Nome = scanner.nextLine();
            //PARTE 1 se digitar fim de qualquer jeito para o while
            if(Nome.equalsIgnoreCase("fim")){
                System.out.print("\n");
                break;
            } else {
            //PARTE 2 ver se string são iguais independente de Mainscula e minuscula
            boolean Igual = false;
            for(String Comparator : ListaNomes){
                if(Nome.equalsIgnoreCase(Comparator)){
                    Igual = true;
                    break;
                    }
                }
                if(Igual == false){
                ListaNomes.add(Nome);
                }
            }
        }
        //Parte 3 Mostrar os Nomes Cadastrados em Ordem Alfabetica
        System.out.println("Nomes Cadastrados");
        TreeSet <String> NomeOrdenado = new TreeSet<>(ListaNomes);
        System.out.println(NomeOrdenado + "\n");
        //PARTE 4 se digitar fim de qualquer jeito para o while
        System.out.println("Pesquisar nomes (digite 'sair' para encerrar): ");
        while(true) {
            System.out.print("> ");
            Nome = scanner.nextLine();
            if(Nome.equalsIgnoreCase("sair")){
                break;
            } else {
            //PARTE 5 Consultar o Nome
            boolean encontrado = false;
            for(String Comparator : NomeOrdenado){
                if(Nome.equalsIgnoreCase(Comparator)){
                    encontrado = true; 
                }
            }
            if(encontrado == true){
                System.out.println("Nome encontrado.");
            } else if(encontrado == false) {
                System.out.println("Nome não encontrado.");
            }
        }
    }
  }
}