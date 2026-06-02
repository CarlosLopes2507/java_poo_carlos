import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args){

        TreeMap<Integer, String> MapColor = new TreeMap<>();
        MapColor.put(1, "Vermelho");
        MapColor.put(2, "Azul");
        MapColor.put(3, "Amarelo");
        MapColor.put(4, "Verde");
        MapColor.put(7, "Laranja");
        MapColor.put(8, "Verde");
        MapColor.put(9, "Verde");
        MapColor.put(10, "Verde");
        System.out.println("Associate Value with Key");
        for(Map.Entry<Integer, String> entry : MapColor.entrySet()) {
            Integer Codigo = entry.getKey();
            String Cor = entry.getValue();
            System.out.println(Codigo + " -> " + Cor);
        }

        System.out.println("\nCopy TreeMap");
        TreeMap<Integer, String> MapCopia = new TreeMap<>(MapColor);
        for(Map.Entry<Integer, String> entry : MapCopia.entrySet()) {
            Integer Codigo = entry.getKey();
            String Cor = entry.getValue();
            System.out.println(Codigo + " -> " + Cor);
        }

        System.out.println("\nSearch Key");
        System.out.println("Procurando se a chave 5 existe");
        boolean SearchKey = MapColor.containsKey(5);
        if(SearchKey){
            System.out.println("A Chave existe");
        } else {
            System.out.println("A Chave não existe");
        }

        System.out.println("\nSearch Value");
        System.out.println("Procurando se o Valor 'Azul' existe");
        boolean SearchValue = MapColor.containsValue("Azul");
        if(SearchValue){
            System.out.println("O Valor existe");
        } else {
            System.out.println("O Valor não existe");
        }

        System.out.println("\nGet All Keys");
        System.out.println(MapColor.keySet());

        System.out.println("\nClear TreeMap");
        MapCopia.clear();
        System.out.println(MapCopia);

        System.out.println("\nSort Keys with Comparator");
        //MapColor.comparator(Integer key1, Integer key2) {
        
        //};

        System.out.println("\nGreatest and Least Mapping");
        System.out.println("Value na menor chave: " + MapColor.firstEntry());
        System.out.println("Value na maior chave: " + MapColor.lastEntry());

        System.out.println("\nGet First and Last Key");
        System.out.println("Menor Chave: " + MapColor.firstKey());
        System.out.println("Maior Chave: " + MapColor.lastKey());

        System.out.println("\nReverse Key View");
        System.out.println("Forma Uniforme: " + MapColor.keySet());
        System.out.println("Forma Reversa: " + MapColor.descendingKeySet());

        System.out.println("\nFloor Entry && Key");
        System.out.println("Floor de key 6: \n" + 
        "Key: " + MapColor.floorKey(6) + 
        "\nValue: " + MapColor.floorEntry(6));

        System.out.println("\nFloor Entry && Key");
        





        




        
    }
}
/*
1. **Associate Value with Key**: associe um valor à chave correspondente no `TreeMap`.
2. **Copy TreeMap**: copie todo o conteúdo para outro `TreeMap` e exiba o resultado.
3. **Search Key**: verifique se uma chave específica está presente no mapa.
4. **Search Value**: verifique se um valor específico está presente no mapa.
5. **Get All Keys**: exiba todas as chaves do mapa.
6. **Clear TreeMap**: remova todos os pares do mapa.
7. **Sort Keys with Comparator**: crie uma visão ordenada das chaves usando um `Comparator` personalizado e exiba o resultado.
8. **Greatest and Least Mapping**: mostre o par associado à maior chave e o par associado à menor chave.
9. **Get First and Last Key**: informe a menor e a maior chave do mapa.
10. **Reverse Key View**: apresente as chaves em ordem reversa.
11. **Floor Entry**: recupere o par com a maior chave menor ou igual à chave informada.
12. **Floor Key**: recupere a maior chave menor ou igual à chave informada.
13. **Head Map (Exclusive)**: exiba o trecho do mapa cujas chaves são estritamente menores que a chave informada.
14. **Head Map (Inclusive Option)**: exiba o trecho do mapa com chaves menores (ou menores/iguais, se indicado) à chave informada.
15. **Higher Key**: recupere a menor chave estritamente maior que a chave informada.
16. **Lower Entry**: recupere o par com a maior chave estritamente menor que a chave informada.
17. **Lower Key**: recupere a maior chave estritamente menor que a chave informada.
18. **NavigableSet View**: exiba a visão `NavigableSet` das chaves.
19. **Poll First Entry**: remova e retorne o primeiro par do mapa.
20. **Poll Last Entry**: remova e retorne o último par do mapa.
21. **SubMap (Inclusive to Exclusive)**: exiba o trecho do mapa com chaves de um valor (inclusivo) até outro (exclusivo).
22. **SubMap (Range)**: exiba o trecho do mapa com chaves dentro do intervalo informado.
23. **TailMap (Inclusive)**: exiba o trecho do mapa com chaves maiores ou iguais à chave informada.
24. **TailMap (Exclusive)**: exiba o trecho do mapa com chaves estritamente maiores que a chave informada.
25. **Ceiling Entry**: recupere o par com a menor chave maior ou igual à chave informada.
26. **Ceiling Key**: recupere a menor chave maior ou igual à chave informada.
*/
