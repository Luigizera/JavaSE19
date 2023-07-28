package github.lugom.Composition.Ex3.entities;

import github.lugom.Composition.Ex3.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order
{
    private Customer customer;
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus orderStatus;

    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus orderStatus, List<OrderItem> orderItems) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addItem(OrderItem item)
    {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item)
    {
        orderItems.remove(item);
    }

    public double total()
    {
        double total = 0D;
        for(OrderItem c : orderItems)
        {
            total += c.getPrice();
        }
        return total;
    }
}
