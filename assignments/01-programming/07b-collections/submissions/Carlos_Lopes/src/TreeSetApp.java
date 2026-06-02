import java.util.TreeSet;
import java.util.Collections;

public class TreeSetApp {
    public static void main(String[] args){
        
        TreeSet <Integer> ListaPares = new TreeSet<>();
        System.out.println("Create and Print TreeSet");
         System.out.println("inserindo Pares de 2 até 10");
        Collections.addAll(ListaPares, 2, 6, 4, 10, 8);
         System.out.println("Iterate TreeSet Elements");
        for(Integer Numbers : ListaPares){
            System.out.print(Numbers + " ");
        }

        System.out.println("\n\nAdd Elements to Another TreeSet");
        TreeSet <Integer> ListaNumeros = new TreeSet<>();
        Collections.addAll(ListaNumeros, 1, 3, 5, 7, 9);
        ListaNumeros.addAll(ListaPares);
        for(Integer Numbers : ListaNumeros){
            System.out.print(Numbers + " ");
        }

        System.out.println("\n\nReverse Order TreeSet");
        for(Integer Numbers : ListaNumeros.descendingSet()){
            System.out.print(Numbers + " ");
        }

        System.out.println("\n\nGet First and Last Elements");
        System.out.println(
        "Primeiro: " + ListaNumeros.getFirst() +
        "\nUltimo: " + ListaNumeros.getLast()
        );

        System.out.println("\nClone TreeSet");
        TreeSet<Integer> Clone = (TreeSet<Integer>) ListaNumeros.clone();
        System.out.println("Original: " + ListaNumeros);
        System.out.println("Clonado: " + Clone);

        System.out.println("\nTreeSet Size");
        System.out.println("Tamanho : " + ListaNumeros.size());

        System.out.println("\nCompare TreeSets");
        boolean compare = ListaNumeros.containsAll(ListaPares);
        if(compare){
            System.out.println("Possuem os mesmos elementos");
        } else {
            System.out.println("Não possuem os mesmos elementos");
        }

        System.out.println("\nElements Less Than 7");
        System.out.println(ListaNumeros.headSet(7));

        System.out.println("\nElements Greater Than 7");
        System.out.println(ListaNumeros.tailSet(7));

        System.out.println("\nCeiling Element");
        System.out.println("Número maior ou igual a 7 de ListaPres: " + ListaPares.ceiling(7));

        System.out.println("\nFloor Element");
        System.out.println("Número menor ou igual a 7 de ListaPares: " + ListaPares.floor(7));

        System.out.println("\nHigher Element");
        System.out.println("Número maior que 6: " + ListaPares.higher(6));

        System.out.println("\nLower Element");
        System.out.println("Número menor que 6: " + ListaPares.lower(6));

        System.out.println("\nPoll First Element && Poll Last Element");
        System.out.println(
        "Primeiro: " + Clone.pollFirst() +
        "\nUltimo: " + Clone.pollLast()
        );
        System.out.println(Clone);

        System.out.println("\nRemove Element");
        ListaNumeros.remove(5);
        System.out.println("Removendo o Quinto Elemento da Lista: " + ListaNumeros);

    }
}
/*
1. **Create and Print TreeSet**: crie um conjunto ordenado, adicione elementos e exiba o resultado.
2. **Iterate TreeSet Elements**: percorra todos os elementos do `TreeSet`.
3. **Add Elements to Another TreeSet**: adicione todos os elementos em outro `TreeSet` e exiba o novo conjunto.
4. **Reverse Order TreeSet**: apresente a visão dos elementos em ordem reversa.
5. **Get First and Last Elements**: informe o primeiro e o último elemento do conjunto.
6. **Clone TreeSet**: gere uma cópia do conjunto e exiba o resultado.
7. **TreeSet Size**: informe a quantidade de elementos no conjunto.
8. **Compare TreeSets**: compare dois conjuntos ordenados e indique se possuem os mesmos elementos.
9. **Elements Less Than 7**: a partir de um `TreeSet` de números, mostre os elementos menores que `7`.
10. **Ceiling Element**: recupere o elemento maior ou igual a um valor informado.
11. **Floor Element**: recupere o elemento menor ou igual a um valor informado.
12. **Higher Element**: recupere o elemento estritamente maior que um valor informado.
13. **Lower Element**: recupere o elemento estritamente menor que um valor informado.
14. **Poll First Element**: remova e retorne o primeiro elemento do conjunto.
15. **Poll Last Element**: remova e retorne o último elemento do conjunto.
16. **Remove Element**: remova um elemento específico do conjunto.
*/