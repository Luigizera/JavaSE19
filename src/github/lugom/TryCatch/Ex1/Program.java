package github.lugom.TryCatch.Ex1;

import github.lugom.TryCatch.Ex1.entities.Account;
import github.lugom.TryCatch.Ex1.exceptions.WithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        int number = 0;
        String holder = "";
        double withdrawLimit = 0D;

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            number = sc.nextInt();
            System.out.print("Holder: ");
            holder = sc.next();
            System.out.print("Balance: ");
            account.deposit(sc.nextDouble());
            System.out.print("Withdraw Limit: ");
            withdrawLimit = sc.nextDouble();

            account = new Account(number, holder, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f" + account.getBalance());
        }
        catch(WithdrawException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Tipagem da variável incorreta");
        }
        catch (Exception e) {
            System.out.println("Erro Inesperado");
        }
    }

}
