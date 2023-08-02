package github.lugom.Polymorphism.Ex1;

import github.lugom.Polymorphism.Ex1.entities.ImportedProduct;
import github.lugom.Polymorphism.Ex1.entities.Product;
import github.lugom.Polymorphism.Ex1.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        int numProducts = 0;

        System.out.print("Enter the number of products: ");
        numProducts = sc.nextInt();

        if(numProducts > 0)
        {
            for(int i = 0; i < numProducts; i++)
            {
                char choice;
                String name;
                double price;
                System.out.printf("%nProduct #%d data:%n", i+1);
                System.out.print("Commom, used or imported (c/u/i)? ");
                choice = sc.next().charAt(0);
                System.out.print("Name: ");
                name = sc.next();
                System.out.print("Price: ");
                price = sc.nextDouble();

                if (choice == 'i') {
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    productList.add(new ImportedProduct(name, price, customsFee));
                }
                else if (choice == 'u'){
                    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.print("Manufacture date: ");
                    LocalDate manufactureDate = LocalDate.parse(sc.next(), dateTimeFormatter);
                    productList.add(new UsedProduct(name, price, manufactureDate));
                }
                else {
                    productList.add(new Product(name, price));
                }
            }

            System.out.println("PRICE TAGS:");
            for(Product a : productList)
            {
                System.out.println(a.priceTag());
            }
        }


    }
}
