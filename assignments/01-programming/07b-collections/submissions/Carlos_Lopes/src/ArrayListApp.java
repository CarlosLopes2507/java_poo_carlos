import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = 0;
        String cor;

        //Criar Lista e Adicionar Elementos
        System.out.println("Create and Print ArrayList");
        ArrayList<String> ListaCores = new ArrayList<>();
        System.out.println("Adicionando Verde, Amarelo, Azul e Branco ao ArrayList\n");
        ListaCores.add("Verde");
        ListaCores.add("Amarelo");
        ListaCores.add("Azul");
        ListaCores.add("Branco");
        //Printar a Lista Cores
        System.out.println("Iterate ArrayList Elements");
        System.out.println(ListaCores + "\n");

        //Adicionar Cor e Listar Nova Lista
        System.out.println("Insert at First Position");
        cor = scanner.nextLine();
        ListaCores.add(0, cor);
        System.out.println(ListaCores + "\n");

        //Pegar Valor em Posição Especifico
        System.out.println("Retrieve Element by Index");
        position = scanner.nextInt();
        scanner.nextLine();
        if(position >= 0 && position < ListaCores.size()){
        System.out.println(ListaCores.get(position) + "\n");
        }
  
        //Substituir Um elemento por Outro
        System.out.println("Replace ArrayList Element");
        System.out.println(ListaCores);
        System.out.println("escolha a Cor que deseja substituir: ");
        cor = scanner.nextLine();
        position = ListaCores.indexOf(cor);
        if(position >= 0 && position < ListaCores.size()){
            System.out.println("Qual sera a nova Cor: ");
            cor = scanner.nextLine();
            ListaCores.set(position, cor);
            System.out.println(ListaCores);
            System.out.println("Novo Elemento: "+ ListaCores.get(position) + "\n");
        }else{
            System.out.println("Cor não encontrada" + "\n");
        } 

        //Validar e Remover elemento
        System.out.println("Remove Third Element");
        ListaCores.remove(3);
        System.out.println(ListaCores + "\n");

        //Percorrer o ArrayList e ver se o elemento existe
        System.out.println("Search Element in ArrayList");
        System.out.println(ListaCores);
        boolean encontrado = false;
        System.out.println("Escreva a Cor que deseja encontra: ");
        cor = scanner.nextLine();
        if(ListaCores.contains(cor)){
            encontrado = true;
            System.out.println(encontrado + "\n");
        } else {
            System.out.println(encontrado + "\n");
        }
        
        //Organizar a Lista por Ordem sucessora( 1 pra frente e a até Z)
        System.out.println("Sort ArrayList");
        Collections.sort(ListaCores);
        for(String c : ListaCores){
            System.out.println(c);
        }

        //Copiar A Lista em outra ArrayList
        System.out.println("Copy ArrayList");
        ArrayList<String> ListaCoresV2 = new ArrayList(ListaCores);
        System.out.println("Lista 1: " + ListaCores);
        System.out.println("Lista 2: " + ListaCoresV2);
        System.out.print("\n");

        //Mudar ás posições dos elementos randomicamente(embaralhar)
        System.out.println("Shuffle ArrayList");
        Collections.shuffle(ListaCoresV2);
        System.out.println(ListaCoresV2 + "\n");

        //Organizar a Lista por ordem REVERSA de tras pra frente
        System.out.println("Reverse ArrayList");
        Collections.reverse(ListaCoresV2);
        System.out.println(ListaCoresV2 + "\n");

        //retorne uma sublista (`fromIndex` e `toIndex`). printar do index 0 até o 1
        //fromIndex -> começa toIndex -> Termina Antes
        System.out.println("Extract Sublist from ArrayList");
        System.out.println(ListaCoresV2.subList(1, 3) + "\n");

        System.out.println("Compare Two ArrayLists");
        System.out.println("Constando a Ordem e Elementos e Tamanho Iguais");
        System.out.println("Lista 1: " + ListaCores);
        System.out.println("Lista 2: " + ListaCoresV2);
        boolean iguais = ListaCores.equals(ListaCoresV2);
        System.out.println("Condition: " + iguais + "\n");

        System.out.println("Swap ArrayList Element");
        Collections.swap(ListaCoresV2, 0, 2);
        System.out.println(ListaCoresV2 + "\n");

        //Juntar Dois Arrays em um Só
        System.out.println("Join Two ArrayLists");
        ArrayList<String> ListaCoresV3 = new ArrayList();
        System.out.println("Lista 1: " + ListaCores);
        System.out.println("Lista 2: " + ListaCoresV2);
        ListaCoresV3.addAll(ListaCores);
        ListaCoresV3.addAll(ListaCoresV2);
        System.out.println("Lista 3: " + ListaCoresV3 + "\n");

        //Clonar um Array Existente
        System.out.println("Clone ArrayList");
        ArrayList<String> Clone = (ArrayList<String>) ListaCoresV2.clone();
        System.out.println("Original: " + ListaCoresV2);
        System.out.println("Clone: " + Clone + "\n");

        //Apagando tudo de um ArrayList
        System.out.println("Clear ArrayList");
        System.out.println(ListaCoresV3);
        System.out.println("Limpando Lista: ");
        ListaCoresV3.removeAll(ListaCoresV3);
        System.out.println(ListaCoresV3 + "\n");

        //Verificar se a Lista está Vazia
        System.out.println("Check if ArrayList is Empty");
        boolean isEmpty = ListaCoresV3.isEmpty();
        if(isEmpty == true){
            System.out.println("Lista esta Vazia\n");
        } else {
            System.out.println("Lista nao esta Vazia\n");
        }

        //liberar memoria excedente de uma lista que nao sofrera novas insercoes.
        System.out.println("Trim ArrayList Capacity");
        ListaCoresV2.trimToSize();
        System.out.println(ListaCoresV2 + "\n");

        //Definir um Tamanho pra Lista
        System.out.println("Increase ArrayList Capacity");
        ListaCores.ensureCapacity(8);
        Collections.addAll(ListaCores, "Roxo", "Rosa", "Dourado", "Marrom");
        System.out.println(ListaCores + "\n");

        //Substituir um Elemento do Indice por outro
        System.out.println("Replace Second Element");
        System.out.println("Escreva a cor que substituira o indice 1: ");
        cor = scanner.nextLine();
        ListaCores.set(1, cor);
        System.out.println(ListaCores + "\n");

        //Printar o Indice e seus Elementos
        System.out.println("Print Elements by Position");
        for(int index = 0; index < ListaCores.size(); index++){
            System.out.println( index + " -> " + ListaCores.get(index));
        }
    }
}

/*
1. **Create and Print ArrayList**: construa uma lista de cores (`ArrayList<String>`), adicione pelo menos quatro elementos ("Verde", "Amarelo", "Azul", "Branco").
2. **Iterate ArrayList Elements**: percorra todos os elementos, imprimindo-os um por linha.
3. **Insert at First Position**: insira um elemento na primeira posicao da lista (indice `0`).
4. **Retrieve Element by Index**: recupere o elemento de índice igual a 2 (valide o indice antes de acessar).
5. **Update ArrayList Element**: substitua um item existente pelo novo valor informado e retorne o elemento atualizado.
6. **Remove Third Element**: remova o terceiro elemento (indice `2`) caso exista.
7. **Search Element in ArrayList**: verifique se um elemento esta presente na lista e imprima `true` ou `false`.
8. **Sort ArrayList**: ordene a lista em ordem alfabetica utilizando `Collections.sort`.
9. **Copy ArrayList**: crie uma nova lista copiando todos os elementos da lista original.
10. **Shuffle ArrayList**: embaralhe os elementos da lista usando `Collections.shuffle`.
11. **Reverse ArrayList**: inverta a ordem dos elementos da lista com `Collections.reverse`.
12. **Extract Sublist from ArrayList**: retorne uma sublista (`fromIndex` e `toIndex`).
13. **Compare Two ArrayLists**: compare duas listas e retorne `true` se elas possuirem os mesmos elementos (mesmo tamanho e mesma ordem).
14. **Swap ArrayList Elements**: troque os elementos de duas posicoes informadas da lista.
15. **Join Two ArrayLists**: crie uma nova lista que una todos os elementos de duas listas.
16. **Clone ArrayList**: gere uma copia superficial (`clone`) da lista atual e exiba o resultado.
17. **Clear ArrayList**: esvazie completamente a lista.
18. **Check if ArrayList is Empty**: verifique se a lista está vazia.
19. **Trim ArrayList Capacity**: chame `trimToSize` para liberar memoria excedente de uma lista que nao sofrera novas insercoes.
20. **Increase ArrayList Capacity**: garanta capacidade minima chamando `ensureCapacity`.
21. **Replace Second Element**: substitua o segundo elemento (indice `1`) da lista por um novo valor.
22. **Print Elements by Position**: percorra a lista por indice e imprima cada posicao com seu respectivo valor (`index -> element`).
*/