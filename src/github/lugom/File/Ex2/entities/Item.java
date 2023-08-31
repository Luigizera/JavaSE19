package github.lugom.File.Ex2.entities;

public class Item
{
    private String nome;
    private Double preco;
    private Integer quantidade;


    public Item() {}
    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getTotalValue()
    {
        return preco * quantidade;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %.2f, %d", nome, preco, quantidade);
    }

    public String toString(boolean totalValue)
    {
        if(totalValue) {
            return String.format("%s, %.2f", nome, getTotalValue());
        }

        return String.format("%s, %.2f, %d", nome, preco, quantidade);
    }



}
