package github.lugom.Dump.main;
import java.util.*;

public class Ex2 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = 0;
		double comprimento = 0;
		double metroQuadrado = 0;
		double area = 0;
		double preco = 0;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor por metro quadrado do terreno: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("A área do terreno é: %.2f%n", area);
		System.out.printf("O preço do terreno é: %.2f%n%n", preco);
		
		//Ex1
		
		int n1 = 0;
		int n2 = 0;
		int soma = 0;
		
		System.out.print("Digite o primeiro número inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		System.out.printf("A soma dos valores é: %d%n%n", soma);
		
		//Ex2
		
		double n3 = 0;
		double area2 = 0;
		
		System.out.print("Digite o valor do raio do círculo: ");
		n3 = sc.nextDouble();
		
		area2 = Math.PI * Math.pow(n3, 2);
		System.out.printf("A área do raio é: %.4f%n%n", area2);
		
		//Ex3
		
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		int n7 = 0;
		
		System.out.print("Digite o primeiro número inteiro: ");
		n4 = sc.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		n5 = sc.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		n6 = sc.nextInt();
		System.out.print("Digite o quarto número inteiro: ");
		n7 = sc.nextInt();
		
		int diff = (n4*n5)-(n6*n7);
		System.out.printf("A diferença dos números é de: %d%n%n", diff);
		
		//Ex4
		
		int numeroFuncionario= 0;
		double horasTrabalhadas = 0;
		double recebePorHora = 0;
		
		System.out.print("Digite o número do funcionário: ");
		numeroFuncionario = sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.print("Digite quanto ele recebe por hora: ");
		recebePorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * recebePorHora;
		System.out.printf("Número do Funcionário: %d%n", numeroFuncionario);
		System.out.printf("Salário: U$ %.2f%n%n", salario);
		
		//Ex5
		
		int I_COD_PECA1 = 0; //Não necessário para exemplo
		int I_QNT_PECA1 = 0;
		double D_VLR_PECA1 = 0;
		int I_COD_PECA2 = 0; //Não necessário para exemplo
		int I_QNT_PECA2 = 0;
		double D_VLR_PECA2 = 0;
		
		System.out.print("Digite o código da peça 1: ");
		I_COD_PECA1 = sc.nextInt();
		System.out.print("Digite o número de peças da peça 1: ");
		I_QNT_PECA1 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 1: ");
		D_VLR_PECA1 = sc.nextDouble();
		System.out.print("Digite o código da peça 2: ");
		I_COD_PECA2 = sc.nextInt();
		System.out.print("Digite o número de peças da peça 2: ");
		I_QNT_PECA2 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 2: ");
		D_VLR_PECA2 = sc.nextDouble();
		
		double Total = (I_QNT_PECA1*D_VLR_PECA1) + (I_QNT_PECA2*D_VLR_PECA2);
		
		System.out.printf("Digite o valor unitário da peça 2: %.2f%n%n", Total);
		
		//Ex6
		//Maneira feia
		double a = 0;
		double b = 0;
		double c = 0;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = Math.sqrt((a*c));
		double circulo = Math.PI * Math.pow(c, 2);
		double trapezio = Math.sqrt((a+b)*c);
		double quadrado = Math.pow(b, 2);
		double retangulo = b*a;
		
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n%n", retangulo);
		sc.close();
	}

}
