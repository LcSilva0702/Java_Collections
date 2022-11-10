import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class App8 {
    public static void main(String[] args) {
        Map<String,Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carros.toString());

        carros.put("gol", 15.2);

        System.out.println(carros.toString());

        System.out.println("Contem o carro tucson na lista? " + carros.containsKey("tucson"));

        System.out.println("Qual o consumo da uno? " + carros.get("uno"));

        System.out.println(carros.keySet());

        System.out.println(carros.values());

        Double maisEconomia = Collections.max(carros.values());
        
        Set<Map.Entry<String, Double>> entries = carros.entrySet();

        String maisEconomico = "";

        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(maisEconomia)){
                maisEconomico = entry.getKey();
                System.out.println("Modelo mais economico: " + maisEconomico + " Consumo: " + maisEconomia);
            }      
        }

        double menosEconomia = Collections.min(carros.values());

        Set<Map.Entry<String,Double>> menos = carros.entrySet();

        String menosEconomico = "";

        for(Map.Entry<String,Double> entry : menos){
            if(entry.getValue().equals(menosEconomia)){
                menosEconomico = entry.getKey();
                System.out.println("Modelo menos economico " + menosEconomico + " Consumo " + menosEconomia);
            }
        }

        Iterator<Double> iterator = carros.values().iterator();

        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos consumos" + soma);

        System.out.println("Media de consumo: " + soma / carros.size());
        
        System.out.println(carros.toString());
        
        Iterator<Double> iterator2 = carros.values().iterator();

        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println(carros.toString());

        Map<String, Double> ordemInserida = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println("Ordem que foram inseridas: " + ordemInserida.toString());

        Map<String, Double> ordemAlfaounatu = new TreeMap<>(ordemInserida);

        System.out.println("Ordem alfabetica ou natural: " + ordemAlfaounatu.toString());
       
        carros.clear();

        System.out.println(carros);

        System.out.println("Esta vazia: " + carros.isEmpty());


    }    
}
