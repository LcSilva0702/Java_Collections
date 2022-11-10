import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.Set;


public class App9 {
    public static void main(String[] args) {
        Map<String, Livro> livrosAle = new HashMap<>(){{
            put("Hawkins, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Duhigg, Charles", new Livro("Poder  do  Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes  para o  seculo 21", 432));
        }};

        for(Map.Entry<String,Livro> entries : livrosAle.entrySet()){
            System.out.println(entries.getKey() + " - " + entries.getValue().getNome());
        }

        Map<String, Livro> livroInser = new LinkedHashMap<>(){{
            put("Hawkins, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Duhigg, Charles", new Livro("Poder  do  Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes  para o  seculo 21", 432));
        }};

        for (Map.Entry<String,Livro> livroEntry : livroInser.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue().getNome());
        }

        Map<String,Livro> livroAlfa = new TreeMap<>(){{
            put("Hawkins, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Duhigg, Charles", new Livro("Poder  do  Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes  para o  seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livroAl : livroAlfa.entrySet()){
            System.out.println(livroAl.getKey() + " - " + livroAl.getValue().getNome());
        };

        Set<Map.Entry<String,Livro>> nomeOr = new TreeSet<>(new comparatorNome());
        
        nomeOr.addAll(livrosAle.entrySet());
        
        for (Map.Entry<String,Livro> entry1 : nomeOr) {
            System.out.println(entry1.getKey() + " - " + entry1.getValue().getNome());            
        }

        System.out.println("AQUI!!!!!!");

        Set<Map.Entry<String,Livro>> numeOr = new TreeSet<Map.Entry<String, Livro>>(new comparatorPagina());
        
        numeOr.addAll(livrosAle.entrySet());
        
        for (Map.Entry<String,Livro> entry2 : numeOr){
            System.out.println(entry2.getKey() + " - " + entry2.getValue().getPaginas());
        }

    }
}

