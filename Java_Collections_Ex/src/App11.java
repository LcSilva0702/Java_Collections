import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;

public class App11{
    public static void main(String[] args){
        Map<Integer,Contato> contatos = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami",  1111));
            put(3, new Contato("Jon", 2222));
        }};

        for(Map.Entry<Integer, Contato> entry : contatos.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("=====================");
        Map<Integer, Contato> contatosIns = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami",  1111));
            put(3, new Contato("Jon", 2222));
        }};

        for (Map.Entry<Integer,Contato> entry2 : contatosIns.entrySet()) {
            System.out.println(entry2.getKey() + " - " + entry2.getValue().getNome());
        }
        System.out.println("=====================");

        Map<Integer, Contato> id = new TreeMap<>(contatos);
        
        for(Map.Entry<Integer, Contato> entry3 : id.entrySet()){
            System.out.println(entry3.getKey() + " - " + entry3.getValue().getNome());
        }
        System.out.println("=====================");

        Set<Map.Entry<Integer, Contato>> numero = new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {
            @Override
            public int compare(Entry<Integer, Contato> num1, Entry<Integer, Contato> num2) {
                return Integer.compare(num1.getValue().getNumero(), num2.getValue().getNumero());
            }
        });

        numero.addAll(contatosIns.entrySet());

        for (Map.Entry<Integer,Contato> entry4 : numero) {
            System.out.println(entry4.getKey() + " - " + entry4.getValue().getNumero());
        }
        
        System.out.println("=====================");

        Set<Map.Entry<Integer,Contato>> nome = new TreeSet<>(Comparator.comparing(num -> num.getValue().getNumero()));
        nome.addAll(contatos.entrySet());

        for (Map.Entry<Integer,Contato> entry5: nome){
            System.out.println(entry5.getKey() + " - " + entry5.getValue().getNome());
        }

        Set<Map.Entry<Integer, Contato>> numTest = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer,Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            } 
        }));

        Set<Map.Entry<Integer, Contato>> numTest2 = new TreeSet<>(Comparator.comparing(
            cont -> cont.getValue().getNumero()));
    };
}
