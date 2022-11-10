import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> lista = new ArrayList<>();
        lista.add(7.0);
        lista.add(8.5);
        lista.add(9.3);
        lista.add(5.0);
        lista.add(7.0);
        lista.add(0.0);
        lista.add(3.6);

        System.out.println(lista.toString());

        System.out.println(lista.indexOf(5.0));

        lista.add(4,8.0);

        System.out.println(lista.toString());

        lista.set(lista.indexOf(5.0), 6.0);

        System.out.println(lista.toString());

        System.out.println(lista.contains(5.0));

        //for(double nota : lista) System.out.println(nota);

        System.out.println(lista.get(2));

        System.out.println(Collections.min(lista));

        System.out.println(Collections.max(lista));

        Iterator<Double> iterator = lista.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        Double media = soma / lista.size();

        System.out.println(media);

        lista.remove(0.0);
        
        System.out.println(lista.toString());

        lista.remove(0);

        Iterator<Double> iterator1 = lista.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(lista.toString());

        lista.clear();

        System.out.println(lista.toString());

        System.out.println(lista.isEmpty());
    }
}
