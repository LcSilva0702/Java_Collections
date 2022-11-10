import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int culpometro = 0;
        String positivo = "S";
        String positivo2 = "s";
        String status = "Inocente";

        List<String> perguntas = new ArrayList<>();
        
        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Ja trabalhou com a vitima?");
        
        for(int i = 0;i <= 4;i++){
            System.out.print(perguntas.get(i) + " Responda com S ou N: ");
            String resposta = sc.next();
            if(resposta.equals(positivo)){
                culpometro += 1;
             }else if (resposta.equals(positivo2)){
                culpometro += 1;
            }
        }
        
        
        if(culpometro == 2){
            status = "Suspeito";
        }else if (culpometro == 3){
            status = "Cumplice";
        }else if (culpometro == 4){
            status = "Cumplice";
        }else if (culpometro == 5){
            status = "Culpado";
        }
        
        System.out.println("Status do Culpometro: " + status);
    }
}

