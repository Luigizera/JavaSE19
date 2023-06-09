package github.lugom.Dump.main;

import java.util.Locale;
import java.util.Scanner;

public class Testes 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = 0, n = 0, p = 0;
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		Integer[][] vect = new Integer[m][n];
		
		for(int i = 0; i < vect.length; i++)
		{
			for(int j = 0; j< vect[i].length; j++)
			{
				vect[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("fim");
		p = sc.nextInt();
		
		for(int i = 0; i < vect.length; i++)
		{
			for(int j = 0; j< vect[i].length; j++)
			{
				if(vect[i][j] == p)
				{
					System.out.printf("Position %d,%d:", i, j);
					if(vect[i][j-1] != null)
					{
						System.out.printf("Left: %d,%d:", i, j);
					}
					if(vect[i][j+1] != null)
					{
						System.out.printf("Right: %d,%d:", i, j);
					}
					if(vect[i-1][j] != null)
					{
						System.out.printf("Up: %d,%d:", i, j);
					}
					if(vect[i+1][j] != null)
					{
						System.out.printf("Down: %d,%d:", i, j);
					}
				}
			}
		}
		
	}

}
