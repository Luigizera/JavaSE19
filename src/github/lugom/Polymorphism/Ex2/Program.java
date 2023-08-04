package github.lugom.Polymorphism.Ex2;

import github.lugom.Polymorphism.Ex2.entities.Contribuintes;
import github.lugom.Polymorphism.Ex2.entities.PessoaFisica;
import github.lugom.Polymorphism.Ex2.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> contribuintes = new ArrayList<>();
        int n;
        double totalTaxes = 0D;


        System.out.print("Enter the number of tax payers: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            char choice;
            String name;
            double anualIncome;

            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            choice = sc.next().charAt(0);
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Anual income: ");
            anualIncome = sc.nextDouble();
            if(choice == 'c')
            {
                int employees;
                System.out.print("Number of employees: ");
                employees = sc.nextInt();

                contribuintes.add(new PessoaJuridica(name, anualIncome, employees));
            }
            else
            {
                double healthExpenditures;
                System.out.print("Health Expenditures: ");
                healthExpenditures = sc.nextDouble();

                contribuintes.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }
        }

        System.out.println("Taxes Paid:");
        for (Contribuintes c : contribuintes)
        {
            c.pagarImposto();
            System.out.println(c.toString());
            totalTaxes += c.getRendaAnual();

        }

        System.out.printf("%nTotal Taxes: $ %.2f", totalTaxes);

        sc.close();
    }
}
