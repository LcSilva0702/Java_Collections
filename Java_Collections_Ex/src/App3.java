import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Marco");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        for(int i = 0;i <= 5;i++){
            System.out.print("Digite uma temperatura: ");
            Double temperatura = sc.nextDouble();
            temperaturas.add(i,temperatura);
        }
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }        

        Double media = soma / temperaturas.size();

        System.out.println(media);

        for(int i = 0 ;i <= 5;i++){
            if(temperaturas.get(i) > media){
                System.out.println(meses.get(i) + ": " + temperaturas.get(i));
            }
        }
    }
    
}
