
import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args){

        HashMap<Integer, String> MapCores = new HashMap<>();
        System.out.println("Associate Key with Value");
        MapCores.put(1, "Vermelho");
        MapCores.put(2, "Azul");
        MapCores.put(3, "Amarelo");
        MapCores.put(4, "Verde");
        for(Map.Entry<Integer, String> entry : MapCores.entrySet()) {
            Integer Codigo = entry.getKey();
            String Cor = entry.getValue();
            System.out.println(Codigo + " -> " + Cor);
        }

        System.out.println("\nCount Key-Value Mappings");
        System.out.println("Quantidade de Pares chaver-valor = " + MapCores.size());

        System.out.println("\nCopy Mappings to Another Map");
        HashMap<Integer, String> Copia = new HashMap<>(MapCores);
        for(Map.Entry<Integer, String> entry : Copia.entrySet()) {
            Integer Codigo = entry.getKey();
            String Cor = entry.getValue();
            System.out.println(Codigo + " -> " + Cor);
        }

        System.out.println("\nRemove All Mappings");
        System.out.println("\nRemoving from Copia");
        Copia.clear();
        System.out.println(Copia);

         System.out.println("\nCheck If Map is Empty");
         boolean isEmpty = Copia.isEmpty();
         if(isEmpty){
            System.out.println("Mapa está vazio");
         } else {
            System.out.println("Mapa não está vazio");
         }

         System.out.println("\nGet Shallow Copy");
         HashMap<Integer, String> NewCopy = new HashMap<>(MapCores);
         //Copiando elementos da Original pra Nova;
         for(Map.Entry<Integer, String> entry : NewCopy.entrySet()) {
            Integer Codigo = entry.getKey();
            String Cor = entry.getValue();
            System.out.println(Codigo + " -> " + Cor);
        }

        System.out.println("\nCheck If Key Exists");
        System.out.println("\nChecando se a Chave 4 existe");
        boolean ContainsKey = MapCores.containsKey(4);
        if(ContainsKey){
            System.out.println("Contém a Chave");
        } else {
            System.out.println("Não contém a Chave");
        }

        System.out.println("\nCheck If Value Exists");
        boolean ContainsValue = MapCores.containsValue("Laranja");
        if(ContainsValue){
             System.out.println("Contém o Valor");
        } else {
            System.out.println("Não contém o Valor");
        }

        System.out.println("\nGet Entry Set View");
        System.out.println(MapCores.entrySet());

        System.out.println("\nGet Value by Key");
        System.out.println("Pegando o valor que está na chave 3");
        System.out.println(MapCores.get(3));

        System.out.println("\nGet Key Set");
        System.out.println(MapCores.keySet());

        System.out.println("\nGet Values Collection");
        System.out.println(MapCores.values());

    
    }
    
}

/*
1. **Associate Key with Value**: associe uma chave ao valor correspondente no `HashMap`.
2. **Count Key-Value Mappings**: informe a quantidade de pares chave-valor existentes.
3. **Copy Mappings to Another Map**: copie todas as associações para outro mapa e exiba o resultado.
4. **Remove All Mappings**: remova todos os pares do mapa.
5. **Check If Map is Empty**: verifique se o mapa está vazio.
6. **Get Shallow Copy**: gere uma cópia superficial do mapa e mostre seu conteúdo.
7. **Check If Key Exists**: verifique se uma chave específica está presente.
8. **Check If Value Exists**: verifique se um valor específico está presente.
9. **Get Entry Set View**: exiba a visão em `Set` dos pares (`entrySet`).
10. **Get Value by Key**: recupere o valor associado a uma chave.
11. **Get Key Set**: exiba o conjunto de chaves do mapa (`keySet`).
12. **Get Values Collection**: mostre a coleção de valores (`values`).
*/
