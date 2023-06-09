package github.lugom.JogoSimples.Jogo;

public class Area 
{
	//NOME, VIDA MAXIMA, VIDA MINIMA, DANO DE ATAQUE, EXP DROPADA
	//INIMIGOS COMUNS
	private static String[][] Area1 = 
		{
				{"0", "Esqueleto", "100", "10", "25", "25"},
				{"1", "Zumbi", "100", "10", "25", "25"},
				{"2", "Goblin", "100", "10", "25", "25"},
				{"3", "Slime", "100", "10", "25", "25"},
		};
	private static String[][] Area2 = 
		{
				{"0", "Arqueiro", "300", "100", "75", "75"},
				{"1", "Mago", "300", "100", "75", "75"},
				{"2", "Guerreiro", "300", "100", "75", "75"},
				{"3", "Assassino", "300", "100", "75", "75"},
		};
	private static String[][] Area3 = 
		{
				{"0", "Golem", "600", "300", "150", "150"},
				{"1", "Centauro", "600", "300", "150", "150"},
				{"2", "Quimera", "600", "300", "150", "150"},
				{"3", "Ciclope", "600", "300", "150", "150"},
		};
	private static String[][] Area4 = 
		{
				{"0", "Dragão", "900", "600", "225", "225"},
				{"1", "Minotauro", "900", "600", "225", "225"},
				{"2", "Naga", "900", "600", "225", "225"},
				{"3", "Grifo", "900", "600", "225", "225"},
		};
	private static String[][] Area5 = 
		{
				{"0", "Thor", "1200", "900", "300", "300"},
				{"1", "Kratos", "1200", "900", "300", "300"},
				{"2", "Loki", "1200", "900", "300", "300"},
				{"3", "Freya", "1200", "900", "300", "300"},
		};
	
	//MINIBOSS
	private static String[][] Area1_MiniBoss = 
		{
				{"0", "Rei Esqueleto", "200", "200", "50", "50"},
				{"1", "Líder Goblin", "200", "200", "50", "50"},
		};
	private static String[][] Area2_MiniBoss = 
		{
				{"0", "Cavaleiro Negro", "500", "500", "100", "100"},
				{"1", "Necromante", "500", "500", "100", "100"},
				{"2", "Lorde das Trevas", "500", "500", "100", "100"},
		};
	private static String[][] Area3_MiniBoss = 
		{
				{"0", "Bafomé", "750", "750", "200", "200"},
				{"1", "Drácula", "750", "750", "200", "200"},
		};
	private static String[][] Area4_MiniBoss = 
		{
				{"0", "Bijuu", "1000", "1000", "280", "280"},
				{"1", "Thanatos", "1000", "1000", "280", "280"},
		};
	private static String[][] Area5_MiniBoss = 
		{
				{"0", "Morte", "3000", "3000", "800", "800"},
		};

	public static String[][] getArea1()
	{
		return Area1;
	}
	public static String[][] getArea2() 
	{
		return Area2;
	}
	public static String[][] getArea3() 
	{
		return Area3;
	}
	public static String[][] getArea4() 
	{
		return Area4;
	}
	public static String[][] getArea5() 
	{
		return Area5;
	}
	public static String[][] getArea1_MiniBoss() 
	{
		return Area1_MiniBoss;
	}
	public static String[][] getArea2_MiniBoss() 
	{
		return Area2_MiniBoss;
	}
	public static String[][] getArea3_MiniBoss() 
	{
		return Area3_MiniBoss;
	}
	public static String[][] getArea4_MiniBoss() 
	{
		return Area4_MiniBoss;
	}
	public static String[][] getArea5_MiniBoss() 
	{
		return Area5_MiniBoss;
	}
	
	
}
