import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int position = 0;
    String cor = "";
    
    System.out.println("Creating a Linked List");
    LinkedList<String> ListaCores = new LinkedList<>();
    Collections.addAll(ListaCores, "Vermelho", "Azul", "Verde", "Amarelo");
    System.out.println(ListaCores + "\n");

    System.out.println("Append Element");
    ListaCores.addLast("Laranja");
    System.out.println(ListaCores + "\n");

    System.out.println("Iterate LinkedList Elements");
    for(String C : ListaCores){
        System.out.println(C);
    }
    System.out.println("Segunda Forma de Mostrar");
    System.out.println(ListaCores +"\n");
    
    System.out.println("Iterate from Position");
    System.out.println("Digite a posição que você deseja começar pecorrendo de 0 até o Tamanho da Lista");
    position = scanner.nextInt();
    if(position < 0 || position >= ListaCores.size()){
        System.out.println("Posição Invalida");
    } else {
    System.out.println("\n");
    ListIterator<String> it = ListaCores.listIterator(position);
    while(it.hasNext()) {
        System.out.println(it.nextIndex() + " -> " + it.next());
     }
    }
    System.out.println("\n");

    System.out.println("Iterate in Reverse Order");
    while(it.hasPrevious()) {
        System.out.println(it.previousIndex() + " -> " + it.previous());
    }
    System.out.println("\n");

    System.out.println("Insert at Position");
    position = scanner.nextInt();
    ListaCores.add(position, "Roxo");
    int index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }

    System.out.println("Insert First and Last");
    ListaCores.addFirst("Branco");
    ListaCores.addLast("Preto");
    index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }
    System.out.println("\n");

    System.out.println("Insert at Front");
    ListaCores.addFirst("Prata");
    System.out.println(ListaCores + "\n");

    System.out.println("Insert at End");
    ListaCores.addLast("Dourado");
    System.out.println(ListaCores + "\n");

    System.out.println("Insert Multiple at Position");

    LinkedList<String> NovasCores = new LinkedList<>(Arrays.asList("Azul-Marinho", "Azul-Escuro", "Ciano", "Azul"));
    ListaCores.addAll(2, NovasCores);
    index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }

    System.out.println("First and Last Occurrence");
    System.out.println("Firts Occurrence de Azul: " + ListaCores.indexOf("Azul"));
    System.out.println("Last Occurrence de AZUL: " + ListaCores.lastIndexOf("Azul"));
    System.out.println("Print Elements with Positions");
    index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }

    System.out.println("Remove Element");
    System.out.println("Elemento da Posição 4 será Retirado");
    ListaCores.remove(4);
    index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }

    System.out.println("Remove First and Last");
    ListaCores.removeFirst();
    ListaCores.removeLast();
    index = 0;
    for(String C : ListaCores){
        System.out.println(index + " -> " + C);
        index++;
    }

    System.out.println("Clear LinkedList");
    ListaCores.removeAll(ListaCores);
    boolean isEmpty = ListaCores.isEmpty();
    if(isEmpty){
            System.out.println("Lista foi Limpada\n");
    } else {
            System.out.println("Lista nao foi Limpada\n");
    }
    
    System.out.println("Swap Elements");
    Collections.addAll(ListaCores, "Vermelho", "Azul", "Verde", "Amarelo");
    System.out.println(ListaCores);
    int last = ListaCores.size() - 1;
    Collections.swap(ListaCores, 0 , last);
    System.out.println(ListaCores + "\n");

    System.out.println("Shuffle LinkedList");
    Collections.shuffle(ListaCores);
    System.out.println(ListaCores + "\n");

    System.out.println("Join LinkedLists");
    LinkedList<String> ListaCores2 = new LinkedList<>();
    Collections.addAll(ListaCores2, "Laranja", "Roxo", "Marrom", "Preto", "Branco");
    System.out.println("Lista Cores 1: ");
    System.out.println(ListaCores);
    System.out.println("Lista Cores 2: ");
    System.out.println(ListaCores2);
    LinkedList<String> ListaMerge = new LinkedList<>();
    System.out.println("Lista Merge: ");
    ListaMerge.addAll(ListaCores);
    ListaMerge.addAll(ListaCores2);
    System.out.println(ListaMerge + "\n");

    System.out.println("Copy LinkedList");
    LinkedList<String> ListaClone = new LinkedList<>( (LinkedList<String>) ListaMerge.clone());
    System.out.println("Lista Principal: " + ListaMerge);
    System.out.println("Lista Clone:  " + ListaClone);

    System.out.println("Poll First Element");
    System.out.println(ListaMerge.pollFirst());
    System.out.println(ListaMerge + "\n");

    System.out.println("Peek First Element");
    System.out.println(ListaMerge.peekFirst() + "\n");

    System.out.println("Peek Last Element");
    System.out.println(ListaMerge.peekLast() + "\n");

    System.out.println("Contains Element");
    scanner.nextLine();
    cor = scanner.nextLine();
    boolean contem = ListaMerge.contains(cor);
    if(contem){
        System.out.println("Contem a cor: "+ cor);
    } else {
        System.out.println("Não Contém");
    }

    System.out.println("Convert to ArrayList");
    Object[] array = ListaMerge.toArray();
    System.out.println(Arrays.toString(array) + "\n");

    System.out.println("Compare LinkedLists");
    boolean igual = ListaMerge.equals(ListaClone);
    System.out.println("Lista 1: " + ListaMerge);
    System.out.println("lista 2: " + ListaClone);
    if(igual){
        System.out.println("Elas são iguais");
    } else {
        System.out.println("Elas Não são Iguais");
    }
    System.out.println("\n");

    System.out.println("Check if Empty");
    isEmpty = ListaMerge.isEmpty();
    if(isEmpty){
        System.out.println("Esta Vazia");
    } else {
        System.out.println("Não está Vazia");
    }
    System.out.println("\n");

    System.out.println("Replace Element");
    System.out.println("Substituindo o elemento 3 por Azul-Claro");
    ListaMerge.set(3, "Azul-Claro");
    index = 0;
    for(String C : ListaMerge){
        System.out.println(index + " -> " + C);
        index++;
    }
  }
}

/*
1. **Append Element**: adicione um elemento ao final da lista encadeada.
2. **Iterate LinkedList Elements**: percorra todos os elementos da lista.
3. **Iterate from Position**: percorra a lista iniciando de uma posição específica.
4. **Iterate in Reverse Order**: percorra a lista na ordem inversa.
5. **Insert at Position**: insira um elemento na posição informada.
6. **Insert First and Last**: insira elementos nas extremidades (primeiro e último).
7. **Insert at Front**: adicione um elemento no início da lista.
8. **Insert at End**: adicione um elemento no final da lista.
9. **Insert Multiple at Position**: insira vários elementos a partir de uma posição específica.
10. **First and Last Occurrence**: informe a primeira e a última ocorrência de um elemento específico.
11. **Print Elements with Positions**: exiba cada elemento junto com sua posição (`index -> element`).
12. **Remove Element**: remova um elemento específico da lista.
13. **Remove First and Last**: remova o primeiro e o último elemento da lista.
14. **Clear LinkedList**: remova todos os elementos da lista.
15. **Swap Elements**: troque os elementos de duas posições informadas.
16. **Shuffle LinkedList**: embaralhe os elementos da lista.
17. **Join LinkedLists**: una duas listas em uma nova `LinkedList`.
18. **Copy LinkedList**: crie uma nova lista cópia da lista original.
19. **Poll First Element**: remova e retorne o primeiro elemento da lista.
20. **Peek First Element**: recupere, sem remover, o primeiro elemento da lista.
21. **Peek Last Element**: recupere, sem remover, o último elemento da lista.
22. **Contains Element**: verifique se um elemento específico está presente na lista.
23. **Convert to ArrayList**: converta a `LinkedList` para uma `ArrayList`.
24. **Compare LinkedLists**: verifique se duas listas possuem os mesmos elementos na mesma ordem.
25. **Check if Empty**: informe se a lista está vazia.
26. **Replace Element**: substitua o valor de um elemento na posição informada.
*/

