import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.Arrays;

public class App12 {
    public static void main(String[] args){
        List<String> lista = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        lista.forEach(System.out::println);
        
        lista.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        
        //List<Integer> lista2 = lista.stream();
        //List<Integer>  lsInt = lista.stream()
         //   .map(Integer::parseInt)
            //.collect(Collectors.toList());
        
       // System.out.println(lsInt.toString());
        
        List<Integer> listaPares = lista.stream()
            .map(Integer::parseInt)
            .filter(i -> (i % 2 == 0 && i > 2))
            .collect(Collectors.toList());

        lista.stream()
            .mapToInt (Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
        
        List<Integer> lsInt = lista.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        lsInt.removeIf(i -> (i % 2 != 0));

        System.out.println(lsInt);
    } 
}