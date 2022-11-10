import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class App2 {
    public static void main(String[] args) {

        List<gato> meusGatos = new ArrayList<>(){{
            add(new gato("Jon", 18, "Preto"));
            add(new gato("Simba", 6, "Tigrado"));
            add(new gato("Jon", 12, "Amarelo"));
        }};

        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        
        System.out.println(meusGatos);

        Collections.sort(meusGatos);
        
        System.out.println(meusGatos);

        //Collections.sort(meusGatos, new ComparadorIdade());
        meusGatos.sort(new ComparadorIdade());
        System.out.println(meusGatos);

        meusGatos.sort(new comparadorCor());
        System.out.println(meusGatos);

        meusGatos.sort(new compadorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
