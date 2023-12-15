package github.lugom.Polymorphism.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            //Variáveis temporárias
            DateTimeFormatter formatador_de_data = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatador de data
            String nome = "";
            String sobrenome = "";
            int idade = 0;
            String nascimento = "";
            String local_de_trabalho = "";
            double salario = 0;

            System.out.print("Escreva seu nome: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            nome = sc.nextLine(); //Pega a informação digitada
            System.out.print("Escreva seu sobrenome: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            sobrenome = sc.nextLine(); //Pega a informação digitada
            System.out.print("Escreva sua idade: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            idade = Integer.parseInt(sc.nextLine()); //Pega a informação digitada e converte
            System.out.print("Escreva sua data de nascimento: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            nascimento = sc.nextLine(); //Pega a informação digitada
            System.out.print("Escreva o nome do seu local de trabalho: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            local_de_trabalho = sc.nextLine(); //Pega a informação digitada
            System.out.print("Escreva seu salário: "); //Mostrar para o usuário o que deve ser digitado (Saída de Dados)
            salario = Double.parseDouble(sc.nextLine()); //Pega a informação digitada e converte

            Usuario usuario = new Usuario(nome, sobrenome, idade, LocalDate.parse(nascimento, formatador_de_data), local_de_trabalho, salario);
            System.out.println(usuario.toString()); //Mostrar para o usuário seus dados (Saída de Dados)
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
