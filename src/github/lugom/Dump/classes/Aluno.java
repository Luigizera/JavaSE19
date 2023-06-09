package github.lugom.Dump.classes;

public class Aluno 
{
	public String nome = "";
	public double nota1 = 0;
	public double nota2 = 0;
	public double nota3 = 0;
	
	public double Soma()
	{
		return nota1 + nota2 + nota3;
	}
	
	public void Validacao()
	{
		if(Soma() >= 60)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", 60.00 - Soma());
		}
	}
	
	public String toString()
	{
		return String.format("%.2f", nota1 + nota2 + nota3);
	}
}
