package github.lugom.Polymorphism.Ex1.entities;

public final class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
        this.price += customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag()
    {
        return String.format("%s $%.2f (Customs fee: $%.2f)", name, price, customFee);
    }
}
