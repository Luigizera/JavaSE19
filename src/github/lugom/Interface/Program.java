package github.lugom.Interface;

import github.lugom.Interface.entities.Contract;
import github.lugom.Interface.entities.ContractService;
import github.lugom.Interface.entities.Installment;
import github.lugom.Interface.entities.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Contract contract = new Contract();
        ContractService contractService = new ContractService(new PaypalService());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Entre os dados do contrato:");
            System.out.print("Número: ");
            int num = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), dateTimeFormatter);
            System.out.print("Valor do Contrato: ");
            double vlrContract = sc.nextDouble();
            System.out.print("Entre com o número de parcelas: ");
            int parcel = sc.nextInt();

            contract = new Contract(num, date, vlrContract);
            contractService.processContract(contract, parcel);
            for(Installment installment : contract.getInstallment())
            {
                System.out.println(installment);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
