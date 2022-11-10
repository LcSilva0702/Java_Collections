import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App5 {
    public static void main(String[] args) {
        Set<Double> setList = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,3.6));
        
        System.out.println("Tem a nota 5 no set? " + setList.contains(5d));

        System.out.println("Todos os objetos do metodo Set: " + setList.toString());

        System.out.println("O menor valor de setList: " + Collections.min(setList));
           
        Double soma = 0.0;

        Iterator<Double> iterator1 = setList.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            soma += next;
        }

        System.out.println("A soma total e igual a: " + soma);

        System.out.println("Media: " + soma / setList.size());

        setList.remove(0d);

        System.out.println("Nota zero removida: " + setList.toString());

        Iterator<Double> iterator2 = setList.iterator();
        
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7)
            iterator2.remove();
        }

        System.out.println("Notas menores que 7 removidas: " + setList.toString());

        Set<Double> linked = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,3.6));

        System.out.println("Lista com LinkedHashSet: " + linked);

        Set<Double> linked2 = new TreeSet<>(linked);

        System.out.println("TreeSet bota em ordem crescente: " + linked2);

        setList.clear();

        System.out.println("Lista vazia: " + setList.isEmpty());
    }
}
