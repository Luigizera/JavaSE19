package github.lugom.JogoSimples.Jogo;

public class Habilidade 
{
	//Id, Nome, Dano, Mana
	private static String[][] Habilidade = 
		{
			{"0", "Combo", "20", "5"}, 
			{"1", "Destruição em Massa", "60", "20"}, 
			{"2", "One-Shot", "100", "40"}
		};
	
	public static int getHabilidade_ID(int habilidade) 
	{
		return Integer.parseInt(Habilidade[habilidade][0]);
	}
	public static String getHabilidade_Nome(int habilidade) 
	{
		return Habilidade[habilidade][1];
	}
	public static int getHabilidade_DanoDeAtaque(int habilidade) 
	{
		return Integer.parseInt(Habilidade[habilidade][2]);
	}
	public static int getHabilidade_CustoDeMana(int habilidade) 
	{
		return Integer.parseInt(Habilidade[habilidade][3]);
	}
}
