package github.lugom.Composition.Ex1;

import github.lugom.Composition.Ex1.entities.Department;
import github.lugom.Composition.Ex1.entities.HourContract;
import github.lugom.Composition.Ex1.entities.Worker;
import github.lugom.Composition.Ex1.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Worker worker;
        String departmentName;
        String workerName;
        String workerLevel;
        double workerSalary;
        int numContracts;
        String date;
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateFormatterMonthYear = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter department's name: ");
        departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        workerName = sc.nextLine();
        System.out.print("Level: ");
        workerLevel = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        workerSalary = sc.nextDouble();

        worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.print("How many contracts this worker will have? ");
        numContracts = sc.nextInt();

        for(int i = 0; i < numContracts; i++)
        {
            System.out.printf("¨Enter contract number %d data:\n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            date = sc.next();
            LocalDate localDate = LocalDate.parse(date, dateFormatter);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract hourContract = new HourContract(localDate, valuePerHour, duration);
            worker.addContract(hourContract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        date = sc.next();
        LocalDate localDate = LocalDate.parse("01/" + date, dateFormatter);
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + localDate.format(dateFormatterMonthYear) + ": " + worker.income(localDate.getYear(), localDate.getMonthValue()));

        sc.close();
    }
}
