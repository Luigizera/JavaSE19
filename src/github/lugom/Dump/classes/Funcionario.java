package github.lugom.Dump.classes;

public class Funcionario 
{
	public String nome = "";
	public double salario = 0.00;
	public double imposto = 0.00;
	
	public double NetSalary()
	{
		return salario - imposto;
	}
	
	public void IncreaseSalary(double percentage)
	{
		salario += percentage/100 * salario;
	}
	
	public String toString()
	{
		return nome + ", " + " $ " + String.format("%.2f", NetSalary());
	}
	
}
