package github.lugom.Enum;

import github.lugom.Enum.entities.Order;
import github.lugom.Enum.entities.OrderStatus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EnumMain
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(180, LocalDate.now(), OrderStatus.DELIVERED);
        System.out.println(order.toString());

        String delivered = sc.nextLine().toUpperCase().replaceAll(" ", "_").replaceAll("-", "_");
        for (OrderStatus status : OrderStatus.values())
        {
            OrderStatus os1 = OrderStatus.valueOf(status.toString());
            if(delivered.equals(status.toString()))
            {
                OrderStatus os2 = OrderStatus.valueOf(delivered);
                System.out.println(os1 + " / " + os2);
                break;
            }
        }

    }
}
