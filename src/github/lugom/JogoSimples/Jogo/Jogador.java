package github.lugom.JogoSimples.Jogo;

public class Jogador 
{
	/*
	String[] jogador_Cabecas = {
						"..............................\r\n"
					  + "..............................\r\n"
					  + "..........          ..........\r\n"
					  + ".......                 ......\r\n"
					  + "....                      ....\r\n"
					  + "...                        ...\r\n"
					  + "...                        ...\r\n",
					    ".............#.##.............\r\n"
					  + "..............##..............\r\n"
					  + "..........##########..........\r\n"
					  + "......##################......\r\n"
					  + "....######################....\r\n"
					  + "...############ ###########...\r\n"
					  + "...##########     #########...\r\n",
					    "..............................\r\n"
					  + "..............................\r\n"
					  + "..........##########..........\r\n"
					  + "......##################......\r\n"
					  + "....######################....\r\n"
					  + "...###### #################...\r\n"
					  + "...###     ################...\r\n",
					    "..........##########..........\r\n"
					  + "..........##########..........\r\n"
					  + "..........##########..........\r\n"
					  + "......##################......\r\n"
					  + "....##### ########## #####....\r\n"
					  + "...#####   ########   #####...\r\n"
					  + "...###      ######      ###...\r\n",
					    "...........#.......#..........\r\n"
					  + ".....#...##.#..#..##.#..##....\r\n"
					  + "...#..################.##.....\r\n"
					  + "....#.##################.##...\r\n"
					  + ".##.########### ##########....\r\n"
					  + "...######  #### ## ## #######.\r\n"
					  + ".####  # #   #   ## ####  ##..\r\n",
	};
	String[] jogador_Olhos = {
						"...    --            --     ..\r\n"
					  + "....  @@@@@@@     @@@@@@@   ..\r\n"
					  + ".....   @@@         @@@    ...\r\n"
					  + "......                    ....\r\n",
						"...                         ..\r\n"
					  + "....   @@@@@       @@@@@    ..\r\n"
					  + "..... @     @     @     @  ...\r\n"
					  + "......                    ....\r\n",
					    "...     --           --     ..\r\n"
					  + "....                        ..\r\n"
					  + "..... @@@@@@@     @@@@@@@  ...\r\n"
					  + "......                    ....\r\n",
					    "...     --           - @@@@ ..\r\n"
					  + "....  @@@@@@@      @@@@@@   ..\r\n"
					  + ".....   @@@        @@@@@@  ...\r\n"
					  + "......                 @@@....\r\n",
					    "...     @@@         @@@     ..\r\n"
					  + "....     @           @      ..\r\n"
					  + ".....    @           @     ...\r\n"
				      + "......                    ....\r\n",
				        "... @  @@@@@       @@@@@  @ ..\r\n"
					  + ".... @@  @  @@@@@@@  @  @@  ..\r\n"
					  + "..... @  @  @     @  @  @  ...\r\n"
					  + "......                    ....\r\n",
	};
	String[] jogador_Corpos = {
						".......                 ......\r\n"
					  + "..........           .........\r\n"
					  + "............@@&@@&@@.,........\r\n"
					  + ".. .   .. @@  @  @  @@.. .....\r\n"
					  + "         @     @@     @      .\r\n",
					    ".......                 ......\r\n"
					  + "..........           .........\r\n"
					  + ".......@@@@@@@&@@&@@@@@@@.....\r\n"
					  + ".. . @@      @    @      @@...\r\n"
					  + "    @@        @@@@        @@ .\r\n",
					    ".......                 ......\r\n"
					  + "..........           .........\r\n"
					  + ".........@@@@@&@@&@@@@@@@.....\r\n"
					  + ".. .   .. @@@@@@@@@@@@.@@@@...\r\n"
					  + "         @            @ @@@@ .\r\n",
					    ".......                 ......\r\n"
					  + "..........           .........\r\n"
					  + ".......@@@@@.@&@@&@@.@@@@.....\r\n"
					  + ".. . @@ @    ... ...   @ @@...\r\n"
					  + "    @@   @      $     @   @@ .\r\n",
	};
	
	int jogador_Cabeca = 0;
	int jogador_Olho =  0;
	int jogador_Corpo =  0;
	*/
	private int jogador_Nivel = 1;
	private int jogador_ExpAtual = 0;
	private int jogador_ExpProximoNivel = 10;
	private int jogador_VidaAtual = 100;
	private int jogador_VidaMaxima = 100;
	private int jogador_ManaAtual = 50; //
	private int jogador_ManaMaxima = 50; //
	private int jogador_DanoDeAtaque = 10;	
	private int pocao_Vida_Quantidade = 3;
	private int pocao_Mana_Quantidade = 1;
	private int jogador_Habilidade_1 = Habilidade.getHabilidade_ID(0);
	private int jogador_Habilidade_2 = Habilidade.getHabilidade_ID(1);
	int escapar_Chance = 80;
	
	public int getEscapar_Chance() 
	{
		return escapar_Chance;
	}
	public void setEscapar_Chance(int escapar_Chance) 
	{
		this.escapar_Chance = escapar_Chance;
	}
	public int getJogador_Nivel() 
	{
		return jogador_Nivel;
	}
	public void setJogador_Nivel(int jogador_Nivel) 
	{
		this.jogador_Nivel = jogador_Nivel;
	}
	//EXPERIÊNCIA
	public int getJogador_ExpAtual() 
	{
		return jogador_ExpAtual;
	}
	public void setJogador_ExpAtual(int jogador_ExpAtual) 
	{
		this.jogador_ExpAtual = jogador_ExpAtual;
	}
	public void adcJogador_ExpAtual(int jogador_ExpAtual) 
	{
		this.jogador_ExpAtual += jogador_ExpAtual;
	}
	public int getJogador_ExpProximoNivel() 
	{
		return jogador_ExpProximoNivel;
	}
	public void setJogador_ExpProximoNivel(int jogador_ExpProximoNivel) 
	{
		this.jogador_ExpProximoNivel = jogador_ExpProximoNivel;
	}
	//VIDA
	public int getJogador_VidaAtual() 
	{
		return jogador_VidaAtual;
	}
	public void setJogador_VidaAtual(int jogador_VidaAtual) 
	{
		this.jogador_VidaAtual = jogador_VidaAtual;
	}
	public void adcJogador_VidaAtual(int jogador_VidaAtual) 
	{
		this.jogador_VidaAtual += jogador_VidaAtual;
	}
	public void rmvJogador_VidaAtual(int jogador_VidaAtual) 
	{
		this.jogador_VidaAtual -= jogador_VidaAtual;
	}
	public int getJogador_VidaMaxima() 
	{
		return jogador_VidaMaxima;
	}
	public void setJogador_VidaMaxima(int jogador_VidaMaxima) 
	{
		this.jogador_VidaMaxima = jogador_VidaMaxima;
	}
	//MANA
	public int getJogador_ManaAtual() 
	{
		return jogador_ManaAtual;
	}
	public void setJogador_ManaAtual(int jogador_ManaAtual) 
	{
		this.jogador_ManaAtual = jogador_ManaAtual;
	}
	public void adcJogador_ManaAtual(int jogador_ManaAtual) 
	{
		this.jogador_ManaAtual += jogador_ManaAtual;
	}
	public void rmvJogador_ManaAtual(int jogador_ManaAtual) 
	{
		this.jogador_ManaAtual -= jogador_ManaAtual;
	}
	public int getJogador_ManaMaxima() 
	{
		return jogador_ManaMaxima;
	}
	public void setJogador_ManaMaxima(int jogador_ManaMaxima) 
	{
		this.jogador_ManaMaxima = jogador_ManaMaxima;
	}
	//DANO DE ATAQUE
	public int getJogador_DanoDeAtaque() 
	{
		return jogador_DanoDeAtaque;
	}
	public void setJogador_DanoDeAtaque(int jogador_DanoDeAtaque) 
	{
		this.jogador_DanoDeAtaque = jogador_DanoDeAtaque;
	}
	//POÇÃO DE VIDA
	public int getPocao_Vida_Quantidade() 
	{
		return pocao_Vida_Quantidade;
	}
	public void setPocao_Vida_Quantidade(int pocao_Vida_Quantidade) 
	{
		this.pocao_Vida_Quantidade = pocao_Vida_Quantidade;
	}
	public void adcPocao_Vida_Quantidade(int pocao_Vida_Quantidade) 
	{
		this.pocao_Vida_Quantidade += pocao_Vida_Quantidade;
	}
	public void rmvPocao_Vida_Quantidade(int pocao_Vida_Quantidade) 
	{
		this.pocao_Vida_Quantidade -= pocao_Vida_Quantidade;
	}
	//POÇÃO DE MANA
	public int getPocao_Mana_Quantidade() 
	{
		return pocao_Mana_Quantidade;
	}
	public void setPocao_Mana_Quantidade(int pocao_Mana_Quantidade) 
	{
		this.pocao_Mana_Quantidade = pocao_Mana_Quantidade;
	}
	public void adcPocao_Mana_Quantidade(int pocao_Mana_Quantidade) 
	{
		this.pocao_Mana_Quantidade += pocao_Mana_Quantidade;
	}
	public void rmvPocao_Mana_Quantidade(int pocao_Mana_Quantidade) 
	{
		this.pocao_Mana_Quantidade -= pocao_Mana_Quantidade;
	}
	//HABILIDADES
	public int getJogador_Habilidade_1() 
	{
		return jogador_Habilidade_1;
	}
	public void setJogador_Habilidade_1(int jogador_Habilidade_1) 
	{
		this.jogador_Habilidade_1 = Habilidade.getHabilidade_ID(jogador_Habilidade_1);
	}
	public int getJogador_Habilidade_2() 
	{
		return jogador_Habilidade_2;
	}
	public void setJogador_Habilidade_2(int jogador_Habilidade_2) 
	{
		this.jogador_Habilidade_2 = Habilidade.getHabilidade_ID(jogador_Habilidade_2);
	}
	
	public void LevelUp()
	{
		jogador_Nivel++;
		jogador_VidaMaxima += (jogador_VidaMaxima * 0.2);
		jogador_ManaMaxima += (jogador_ManaMaxima * 0.2);
		jogador_DanoDeAtaque += (jogador_DanoDeAtaque * 0.2);
		jogador_ExpAtual -= jogador_ExpProximoNivel;
		jogador_ExpProximoNivel *= 2;
		jogador_VidaAtual = jogador_VidaMaxima;
		jogador_ManaAtual = jogador_ManaMaxima;
	}
}
