package github.lugom.Composition.Ex3.entities;

public class OrderItem
{
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Product product, Integer quantity) {
        this.quantity = quantity;
        this.price = quantity * product.getPrice();
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product.getName() + ", " + product.getPrice() + ", Quantity: " + quantity + ", Subtotal: " + price;
    }
}
