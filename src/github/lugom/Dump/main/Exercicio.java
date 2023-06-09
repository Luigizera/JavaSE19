package github.lugom.Dump.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import github.lugom.Dump.classes.Employee;
import github.lugom.Dump.classes.Pessoas;
import github.lugom.Dump.classes.Rooms;

public class Exercicio 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		//EX1
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.nome = sc.next();
		System.out.print("Gross salary: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("\nEmployee: " + funcionario);
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		
		funcionario.IncreaseSalary(percentage);
		System.out.println("Updated data: " + funcionario);
		//EX2
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.next();
		System.out.print("Digite suas 3 notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + aluno.toString());
		aluno.Validacao();
		
		//EX3
		System.out.println("\nWhat is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollar = sc.nextDouble();
		System.out.printf("Ammount to be paid in reais: %.2f%n", CurrencyConverter.DollarToReal(dollarPrice, dollar));
		*/
		//VETORES
		/*
		VectEx1();
		VectEx2();
		VectEx3();
		VectEx4();
		VectEx5();
		VectEx9();
		*/
		ListEx1();
		
		
		
		sc.close();
	}
	
	public static void VectEx1()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do
		{
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] < 0)
			{
				System.out.printf("%.2f%n", vect[i]);
			}
		}
	}
	
	public static void VectEx2()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double soma = 0;
		double media = 0;
		do
		{
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++)
		{
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		for(int i = 0; i < vect.length; i++)
		{
			soma += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", soma);
		media =  soma / vect.length;
		System.out.printf("MEDIA = %.2f%n", media);
			
	}
	
	public static void VectEx3()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double soma = 0;
		double altMedia = 0;
		int menorDeIdade = 0;
		double menorDeIdadeMedia = 0;
		
		do
		{
			System.out.print("Quantas pessoas serão digitadas? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		Pessoas[] vect = new Pessoas[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Digite o Nome: ");
			String nome = sc.next();
			System.out.print("Digite a Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite a Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(nome, idade, altura);
		}
		
		
		for(int i = 0; i < vect.length; i++)
		{
			soma += vect[i].getAltura();
		}
		altMedia = soma/vect.length;
		System.out.printf("Altura média: %.2f%n", altMedia);
		
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i].getIdade() < 16)
			{
				menorDeIdade += 1;
			}
		}
		menorDeIdadeMedia = menorDeIdade * 100 / vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.2f% %n", menorDeIdadeMedia);
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i].getIdade() < 16)
			{
				System.out.printf("%s%n", vect[i].getNome());
			}
		}		
	}
	
	public static void VectEx4()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double qntPares = 0;
		
		do
		{
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.println("NÚMEROS PARES:");
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] % 2 == 0)
			{
				System.out.printf("%.1f ", vect[i]);
				qntPares += 1;
			}
		}
		sc.nextLine();
		System.out.printf("QUANTIDADE DE PARES = %d%n", qntPares);
	}
	
	public static void VectEx5()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double vlrMaior = 0;
		int vlrMaiorPosicao = 0;
		
		do
		{
			System.out.print("Quantos números você vai digitar? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] > vlrMaior)
			{
				vlrMaior = vect[i];
				vlrMaiorPosicao = i;
			}
		}
		sc.nextLine();
		System.out.printf("MAIOR VALOR = %.1f%n", vlrMaior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", vlrMaiorPosicao);
	}
	
	public static void VectEx6()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do
		{
			System.out.print("Quantos valores vai ter cada vetor? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		double[] vectC = new double[n];
		

		System.out.println("Digite os Valores do Vetor A:");
		for(int i = 0; i < vectA.length; i++)
		{
			vectA[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("Digite os Valores do Vetor B:");
		for(int i = 0; i < vectB.length; i++)
		{
			vectB[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectA.length; i++)
		{
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
	}
	
	public static void VectEx7()
	{
		//abaixo_da_media
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double soma = 0;
		double media = 0;
		do
		{
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		for(int i = 0; i < vect.length; i++)
		{
			soma += vect[i];
		}
		media = soma/vect.length;
		
		System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] < media)
			{
				System.out.println(vect[i]);
			}
		}
	}
	
	public static void VectEx8()
	{
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		byte pares = 0;
		double soma = 0;
		double media = 0;
		
		do
		{
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++)
		{
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			System.out.println();
		}
		
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] %2 == 0)
			{
				soma += vect[i];
				pares += 1;
			}
		}
		if(pares <= 0)
		{
			System.out.println("NENHUM NÚMERO PAR.");
		}
		else
		{
			media = soma/pares;
			System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		}
	}
	
	public static void VectEx9()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Rooms[] vect = new Rooms[9];
		String name = "";
		String email = "";
		int room = 0;
		
		do
		{
			System.out.print("How many rooms will be rented? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			name = sc.next();
			sc.nextLine();
			System.out.print("Email: ");
			email = sc.next();
			sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Rooms(name, email);
		}
		
		for(int i = 0; i < vect.length; i++)
		{
			if(vect[i] != null)
			{
				System.out.println("\nBusy rooms:");
				System.out.println(i + ": " + vect[i].toString()); 
			}
		}
	}
	
	public static void ListEx1()
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int id = 0;
		String name = "";
		double salary = 0;
		List<Employee> list = new ArrayList<>();
		
		do
		{
			System.out.print("How many employees will be registered? ");
			n = sc.nextInt();
			System.out.println();
		} while(n > 10 && n <= 0);
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			while (hasId(list, id)) 
			{
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			System.out.print("Name: ");
			name = sc.next();
			sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int eId = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == eId).findFirst().orElse(null);
		if(emp == null)
		{
			System.out.println("This id does not exist!");
		}
		else 
		{
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		sc.nextLine();
		System.out.println("List of employees:");
		for (Employee e : list) 
		{
			System.out.println(e);
		}
	}
	public static boolean hasId(List<Employee> list, int id) 
	{
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
