import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

class Contato {
    
    String nome;
    Integer numero;

    Contato(String nome, Integer numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}

class compadorNum implements Comparator<Map.Entry<Integer, Contato>>{
    @Override
    public int compare(Map.Entry<Integer, Contato> conta1, Map.Entry<Integer, Contato> conta2) {
        
        return Integer.compare(conta1.getValue().getNumero(), conta2.getValue().getNumero());
    }
}

class compadorNome implements Comparator<Map.Entry<Integer,Contato>>{
    @Override
    public int compare(Entry<Integer, Contato> conta1, Entry<Integer, Contato> conta2) {
        return conta1.getValue().getNome().compareToIgnoreCase(conta2.getValue().getNome());
    }
}

