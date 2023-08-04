package github.lugom.Polymorphism.Ex2.entities;

public final class PessoaJuridica extends Contribuintes{
    private Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer gastosSaude) {
        this.numFuncionarios = gastosSaude;
    }

    @Override
    public void pagarImposto() {
        if(numFuncionarios < 10){
            rendaAnual *= 0.16;
        }
        else{
            rendaAnual *= 0.14;
        }
    }

    @Override
    public String toString() {
        return nome + ": $ " + rendaAnual;
    }
}
