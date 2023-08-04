package github.lugom.Polymorphism.Ex2.entities;

public abstract class Contribuintes {
    protected String nome;
    protected Double rendaAnual;

    public Contribuintes() {
    }

    public Contribuintes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract void pagarImposto();

    public abstract String toString();
}
