import java.util.*;
import java.util.Map.Entry;

class Livro {
    String nome;
    Integer paginas;

    public Livro(String nome, int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public String getNome() {
        return nome;
    }


    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(o == null || getClass() !=  o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome,paginas);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Pagina: " + paginas; 
    }
}
class comparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String,Livro> l1,Map.Entry<String,Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
class comparatorPagina implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}