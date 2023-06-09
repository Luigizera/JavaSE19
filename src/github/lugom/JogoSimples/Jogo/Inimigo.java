package github.lugom.JogoSimples.Jogo;

import java.util.Random;

public class Inimigo 
{	
	private int area = 1;
	
	private int inimigo_Atual = 0;
	private String inimigo_Nome = "";
	private int inimigo_VidaMaxima = 0;
	private int inimigo_VidaAtual = 0;
	private int inimigo_DanoDeAtaque = 0;
	private int inimigo_ExpRecebida = 0;
	
	
	public String getInimigo_Nome() 
	{
		return inimigo_Nome;
	}
	//VIDA
	public int getInimigo_VidaMaxima() 
	{
		return inimigo_VidaMaxima;
	}
	public int getInimigo_VidaAtual() 
	{
		return inimigo_VidaAtual;
	}
	public void adcInimigo_VidaAtual(int inimigo_VidaAtual) 
	{
		this.inimigo_VidaAtual += inimigo_VidaAtual;
		if(this.inimigo_VidaAtual > this.inimigo_VidaMaxima)
		{
			this.inimigo_VidaAtual = this.inimigo_VidaMaxima;
		}
	}
	public void rmvInimigo_VidaAtual(int inimigo_VidaAtual) 
	{
		this.inimigo_VidaAtual -= inimigo_VidaAtual;
		if(this.inimigo_VidaAtual < 0)
		{
			this.inimigo_VidaAtual = 0;
		}
	}
	public int getInimigo_DanoDeAtaque() 
	{
		return inimigo_DanoDeAtaque;
	}
	public int getInimigo_ExpRecebida() 
	{
		return inimigo_ExpRecebida;
	}
	
	public int getArea() 
	{
		return area;
	}
	public void setArea(int area) 
	{
		if(area >= 5)
		{
			this.area = 5;
		}
		else
		{
			this.area = area;
		}
	}
	
	public void geraInimigo()
	{
		Random rand = new Random();
		String[][] inimigos = null;
		String[][] miniBoss = null;
		
		switch(this.area)
		{
			case 1:
			{
				inimigos = Area.getArea1();
				miniBoss = Area.getArea1_MiniBoss();
				break;
			}
			case 2:
			{
				inimigos = Area.getArea2();
				miniBoss = Area.getArea2_MiniBoss();
				break;
			}
			case 3:
			{
				inimigos = Area.getArea3();
				miniBoss = Area.getArea3_MiniBoss();
				break;
			}
			case 4:
			{
				inimigos = Area.getArea4();
				miniBoss = Area.getArea4_MiniBoss();
				break;
			}
			case 5:
			{
				inimigos = Area.getArea5();
				miniBoss = Area.getArea5_MiniBoss();
				break;
			}
			default:
			{
				inimigos = Area.getArea1();
				miniBoss = Area.getArea1_MiniBoss();
				break;
			}
		}
		
		if(rand.nextDouble(100) <= 0.1)
		{
			Musica.setMusicaMiniBoss();
			inimigo_Atual = Integer.parseInt(miniBoss[rand.nextInt(miniBoss.length)][0]);
			inimigo_Nome = miniBoss[inimigo_Atual][1];
			inimigo_VidaMaxima = rand.nextInt(Integer.parseInt(miniBoss[inimigo_Atual][2]) - Integer.parseInt(miniBoss[inimigo_Atual][3])) + Integer.parseInt(miniBoss[inimigo_Atual][3]);
			inimigo_VidaAtual = inimigo_VidaMaxima;
			inimigo_DanoDeAtaque = Integer.parseInt(miniBoss[inimigo_Atual][4]);
			inimigo_ExpRecebida = Integer.parseInt(miniBoss[inimigo_Atual][5]);
		}
		else
		{
			Musica.setMusicaBatalha();
			inimigo_Atual = Integer.parseInt(inimigos[rand.nextInt(inimigos.length)][0]);
			inimigo_Nome = inimigos[inimigo_Atual][1];
			inimigo_VidaMaxima = rand.nextInt(Integer.parseInt(inimigos[inimigo_Atual][2]) - Integer.parseInt(inimigos[inimigo_Atual][3])) + Integer.parseInt(inimigos[inimigo_Atual][3]);
			inimigo_VidaAtual = inimigo_VidaMaxima;
			inimigo_DanoDeAtaque = Integer.parseInt(inimigos[inimigo_Atual][4]);
			inimigo_ExpRecebida = Integer.parseInt(inimigos[inimigo_Atual][5]);
		}
	}
}
