package github.lugom.Polymorphism.Ex2.entities;

public final class PessoaFisica extends Contribuintes{
    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public void pagarImposto() {
        if(rendaAnual < 20000.0D)
        {
            rendaAnual = (rendaAnual * 0.15) - (gastosSaude * 0.5);
        }
        else
        {
            rendaAnual = (rendaAnual * 0.25) - (gastosSaude * 0.5);
        }
    }

    @Override
    public String toString() {
        return nome + ": $ " + rendaAnual;
    }
}
