import java.util.Set;

class Estados {

    String nome;
    Integer popu;

    Estados(String nome, Integer popu){
        this.nome = nome;
        this.popu = popu;
    }
    
    public String getNome() {
        return nome;
    }
    public Integer getPopu() {
        return popu;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPopu(Integer popu) {
        this.popu = popu;
    }
    @Override
    public String toString() {
        return "Estado" + nome + "Populacao" + popu;
    }
}

