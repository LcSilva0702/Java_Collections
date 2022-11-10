import java.util.*;

public class App7 {
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        for(String cor : cores) {
            System.out.println(cor);
        }
        
        int i = 0;
        for(String cor : cores){
            i++;
        }
        
        System.out.println("O arco iris tem: " + i +  " cores");

        Set<String> coresAlfa = new TreeSet<>();
        coresAlfa.add("Vermelho");
        coresAlfa.add("Laranja");
        coresAlfa.add("Amarelo");
        coresAlfa.add("Verde");
        coresAlfa.add("Azul");
        coresAlfa.add("Anil");
        coresAlfa.add("Violeta");

        System.out.println("Lista em ordem alfabetica: " + coresAlfa.toString());

        Set<String> cores1 = new TreeSet<>(Collections.reverseOrder());
        cores1.add("Vermelho");
        cores1.add("Laranja");
        cores1.add("Amarelo");
        cores1.add("Verde");
        cores1.add("Azul");
        cores1.add("Anil");
        cores1.add("Violeta");

        System.out.println(cores1.toString());

        for(String cor : cores){
            if(cor.startsWith("V")){
                System.out.println(cor);
            }   
        }

        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        
        System.out.println(cores);


        cores.clear();

        System.out.println("cores esta vazio?" + cores.isEmpty());
    }
}
