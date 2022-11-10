import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App10 {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265); 
        }};

        estados.put("RN", 3534165);

        System.out.println(estados.toString());

        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }

        System.out.println(estados.toString());

        System.out.println("Populacao de PE: " + estados.get("PE"));

        Map<String, Integer> estadosLinked = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265); 
        }};

        System.out.println("Ordem que foi inserida: " + estadosLinked);

        Map<String,Integer> estadosAlfa = new TreeMap<>(){{
            putAll(estados);
        }};

        System.out.println("Ordem alfabetica: " + estadosAlfa);

        int menorPopu = Collections.min(estados.values());

        System.out.println("Menor populacao: " + menorPopu);

        int maiorPopu = Collections.max(estados.values());

        System.out.println("Maior populacao: " + maiorPopu);

        Integer soma = 0;

        Iterator<Integer> iterator = estados.values().iterator();

        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Mostra a soma da populacao de todos os estados: " + soma);

        System.out.println("Media: " + soma / estados.size());

        Iterator<Integer> iterator2 = estados.values().iterator();

        while(iterator2.hasNext()){
            if(iterator2.next() < 4000000){
                iterator2.remove();
            }
        }

        System.out.println(estados);

        estados.clear();

        System.out.println(estados.isEmpty());
    }
}
