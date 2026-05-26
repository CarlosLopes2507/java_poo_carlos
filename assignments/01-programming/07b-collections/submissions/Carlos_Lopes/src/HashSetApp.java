import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;

public class HashSetApp {

    public static void main(String[] args) {
        HashSet<String> ListaNomes = new HashSet<>();

        //Criando um HashSet
        System.out.println("Creating new HashSet with Names");
        Collections.addAll(ListaNomes, "Carlos", "Daniel", "Mateo", "Renan", "Gabriel");
        System.out.println(ListaNomes + "\n");

        //adicione um elemento ao conjunto.
        System.out.println("Append Element to HashSet");
        ListaNomes.add("Lucas");
        System.out.println(ListaNomes + "\n");

        //percorra todos os elementos do conjunto.
        System.out.println("Iterate HashSet Elements");
        for(String N : ListaNomes){
            System.out.println(N);
        }

        //informe a quantidade de elementos.
        System.out.println("Get HashSet Size");
        int Tamanho = ListaNomes.size();
        System.out.println("O Tamanho o HashSet é: " + Tamanho + "\n");

        //esvazie completamente o conjunto.
        System.out.println("Clear HashSet");
        HashSet<String> ListaLimpa = new HashSet<>();
        ListaLimpa.addAll(ListaNomes);
        ListaLimpa.clear();
        System.out.println(ListaLimpa);

        //verifique se o conjunto está vazio.
        System.out.println("Check if HashSet is Empty");
        boolean isEmpty = ListaLimpa.isEmpty();
        if(isEmpty){
             System.out.println("Está Limpa\n");
        } else {
             System.out.println("Não Está Limpa\n");
        }

        //gere uma cópia superficial do conjunto e exiba o resultado.
        System.out.println("Clone HashSet");
        HashSet<String> ListaClone = new HashSet<>(ListaNomes);
        System.out.println("Lista Original: " + ListaNomes);
        System.out.println("Lista Clone: " + ListaClone);

        //converta o conjunto para um array e exiba os elementos.
        System.out.println("Convert HashSet to Array");
        ArrayList<String> NomesArray = new ArrayList<>(ListaNomes);
        System.out.println(NomesArray + "\n");

        //crie um `TreeSet` com os mesmos elementos.
        System.out.println("Convert HashSet to TreeSet");
        TreeSet<String> NomesTree = new TreeSet<>(ListaNomes);
        System.out.println(NomesTree + "\n");

        System.out.println("Find Elements Less Than 7");
        TreeSet <Integer> NumberTree  = new TreeSet<>();
        Collections.addAll(NumberTree, 7, 6, 8, 10, 25, 78, 2, 3, 27, 4);
        for(int N : NumberTree){
            if(N < 7){
            System.out.println(N);
            }
        }
        System.out.println("Segunda Forma com HeadSet");
        System.out.println(NumberTree.headSet(7) + "\n");

        //Retain Common Elements
        System.out.println("Retain Common Elements");
        Collections.shuffle(NomesArray);
        System.out.println(ListaNomes);
        System.out.println(NomesArray);
        TreeSet<String> RetainCommon = new TreeSet<>(ListaNomes);
        RetainCommon.retainAll(NomesArray);
        System.out.println(RetainCommon + "\n");

        //Retain Common Elements
        System.out.println("Remove All from HashSet");
        ListaNomes.removeAll(NomesArray);
        System.out.println(ListaNomes + "\n");
    }   
}
/*
1. **Append Element to HashSet**: adicione um elemento ao conjunto.
2. **Iterate HashSet Elements**: percorra todos os elementos do conjunto.
3. **Get HashSet Size**: informe a quantidade de elementos.
4. **Clear HashSet**: esvazie completamente o conjunto.
5. **Check if HashSet is Empty**: verifique se o conjunto está vazio.
6. **Clone HashSet**: gere uma cópia superficial do conjunto e exiba o resultado.
7. **Convert HashSet to Array**: converta o conjunto para um array e exiba os elementos.
8. **Convert HashSet to TreeSet**: crie um `TreeSet` com os mesmos elementos.
9. **Find Elements Less Than 7**: dado um `TreeSet` de números, mostre os elementos menores que `7`.
10. **Compare Two HashSets**: verifique se dois conjuntos possuem os mesmos elementos.
11. **Retain Common Elements**: mantenha no conjunto apenas os elementos comuns a outro conjunto.
12. **Remove All from HashSet**: remova todos os elementos do conjunto.
*/
