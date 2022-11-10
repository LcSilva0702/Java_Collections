import java.util.Comparator;

class gato implements Comparable<gato> {
    String nome;
    int idade;
    String cor;
    
     gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
     }
     void setCor(String cor) {
         this.cor = cor;
     }
     String getCor() {
         return cor;
     }
     void setIdade(int idade) {
         this.idade = idade;
     }
     int getIdade(){
        return idade;
     }
     void setNome(String nome){
        this.nome = nome;
     }
     String getNome(){
        return nome;
     }
     @Override
     public String toString() {
         return " Nome = " + nome + " Idade = " + idade + " Cor " + cor;
     }
    @Override
    public int compareTo(gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparadorIdade implements Comparator<gato>{
    @Override
    public int compare(gato g1, gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class comparadorCor implements Comparator<gato>{
    @Override
    public int compare(gato g1, gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class compadorNomeCorIdade implements Comparator<gato>{
    @Override
    public int compare(gato g1, gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return nome;
        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        if (idade != 0) return idade;
         return 0;
    }
}
