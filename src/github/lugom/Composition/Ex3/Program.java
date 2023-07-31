package github.lugom.Composition.Ex3;

import github.lugom.Composition.Ex3.entities.Customer;
import github.lugom.Composition.Ex3.entities.Order;
import github.lugom.Composition.Ex3.entities.OrderItem;
import github.lugom.Composition.Ex3.entities.Product;
import github.lugom.Composition.Ex3.enums.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Customer customer = new Customer();
        OrderItem orderItem = new OrderItem();
        Product product = new Product();
        Order order = new Order();
        String customerName = "";
        String customerEmail = "";
        LocalDate customerBirthday = LocalDate.now();
        String orderStatus = "";
        int orderItems = 0;


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        customerName = sc.nextLine();
        System.out.print("Email: ");
        customerEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        customerBirthday = LocalDate.parse(sc.nextLine(), dateFormatter);
        customer = new Customer(customerName, customerEmail, customerBirthday);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        orderStatus = sc.nextLine().toUpperCase();
        System.out.print("How many items to this order: ");
        orderItems = sc.nextInt();

        order = new Order(customer, LocalDateTime.now(), OrderStatus.valueOf(orderStatus));

        if(orderItems > 0)
        {
            for(int i = 0; i < orderItems; i++)
            {
                String name = "";
                double price = 0D;
                int quantity = 0;

                System.out.printf("Enter #%d item data:%n", i+1);
                System.out.print("Product name: ");
                name = sc.next();
                System.out.print("Product price: ");
                price = sc.nextDouble();
                product = new Product(name, price);
                System.out.print("Quantity: ");
                quantity = sc.nextInt();

                orderItem = new OrderItem(product, quantity);
                order.addItem(orderItem);
            }
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + dateTimeFormatter.format(order.getMoment()));
        System.out.println("Order status: " + order.getOrderStatus().toString().substring(0, 1).toUpperCase().substring(1).toLowerCase());
        System.out.println("Customer: " + customer.toString());
        System.out.println("Order Items:");
        order.getItems();
        System.out.println("Total price: " + order.getTotal());

        sc.close();
    }
}
