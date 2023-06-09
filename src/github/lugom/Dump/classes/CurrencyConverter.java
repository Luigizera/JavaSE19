package github.lugom.Dump.classes;

public class CurrencyConverter 
{
	public static final double IOF = 0.06;
	
	public static double DollarToReal(double dollarPrice, double dollar)
	{
		double real = dollarPrice * dollar + (dollarPrice * dollar) * IOF;
		return real;
	}
	
}
