package github.lugom.JogoSimples.Jogo;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class GameMain 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Objetos do Sistema
		Scanner sc = new Scanner(System.in);

		// Variáveis do Jogo
		Inimigo inimigo = new Inimigo();
		Pocao pocao = new Pocao();

		// Variáveis do Jogador
		Jogador jogador = new Jogador();
		
		
		// Jogo
		System.out.println("---------------------------------------------");
		System.out.println("\tBem-vindo a Dungeon");
		Batalha(jogador, inimigo, pocao);

		System.out.println("######################");
		System.out.println("# OBRIGADO POR JOGAR #");
		System.out.println("######################");
		sc.close();
	}
	
	public static void Batalha(Jogador jogador, Inimigo inimigo, Pocao pocao) throws InterruptedException
	{
		// Objetos do Sistema
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String input = "";

		// Variáveis do Jogo
		int dano_Recebido = 0;
		boolean rodando = true;
		
		GAME: 
		while (rodando) 
		{
			inimigo.geraInimigo();
			
			System.out.println("---------------------------------------------");
			System.out.printf("\t# %s apareceu! #%n", inimigo.getInimigo_Nome());
			BATALHA:
			while (inimigo.getInimigo_VidaAtual() > 0 && jogador.getJogador_VidaAtual() > 0)
			{
				System.out.printf("\tVida atual: %d/%d%n", jogador.getJogador_VidaAtual(), jogador.getJogador_VidaMaxima());
				System.out.printf("\tMana atual: %d/%d%n", jogador.getJogador_ManaAtual(), jogador.getJogador_ManaMaxima());
				System.out.printf("\tVida do %s: %d/%d%n", inimigo.getInimigo_Nome(), inimigo.getInimigo_VidaAtual(), inimigo.getInimigo_VidaMaxima());
				TimeUnit.SECONDS.sleep(2);
				System.out.println("\tO que fazer?");
				System.out.println("\t1. Atacar");
				System.out.println("\t2. Habilidade");
				System.out.println("\t3. Usar poção");
				System.out.println("\t4. Fugir");

				input = sc.nextLine();

				switch(input) 
				{
					case "1": 
					{
						Ataque(jogador, inimigo);
						break;
					}
					case "2": 
					{
						Habilidade(jogador, inimigo);
						break;
					}
					case "3":
					{
						Pocao(jogador, inimigo, pocao);
						break;
					}
					case "4": //FUGIR
					{
						if (rand.nextInt(100) > jogador.getEscapar_Chance()) 
						{
							System.out.println("\t> Você não consegue fugir!");
							TimeUnit.SECONDS.sleep(2);

							dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

							if(dano_Recebido == 0)
							{
								System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
								TimeUnit.SECONDS.sleep(2);
							}
							else
							{
								jogador.rmvJogador_VidaAtual(dano_Recebido);
								System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
								TimeUnit.SECONDS.sleep(2);
							}
							if (jogador.getJogador_VidaAtual() < 1) 
							{
								System.out.printf("\t> Você não aguentou o dano recebido!%n");
								TimeUnit.SECONDS.sleep(2);
							}
							System.out.println("---------------------------------------------");
							break;
						} 
						else 
						{
							Musica.stop();
							SFX.setSFX(0);
							System.out.printf("\tVocê foge de %s em segurança!%n", inimigo.getInimigo_Nome());
							TimeUnit.SECONDS.sleep(2);
							System.out.println("---------------------------------------------");
							break BATALHA;
						}
					}
					default:
					{
						System.out.println("\t>Comando inválido.");
						System.out.println("---------------------------------------------");
						break;
					}
						
				}
			}
			Musica.stop();
			if (jogador.getJogador_VidaAtual() < 1) 
			{
				System.out.println("Você sai correndo da dungeon, por causa dos danos na batalha.");
				TimeUnit.SECONDS.sleep(2);
				break;
			} 
			else 
			{
				if(inimigo.getInimigo_VidaAtual() < 1)
				{
					Musica.setMusicaMenu(1);
					LevelUp(jogador, inimigo, pocao);
					System.out.println("O que gostaria de fazer?");
					System.out.println("1. Procurar mais inimigos");
					System.out.println("2. Ir para próxima área");
					System.out.println("3. Sair da dungeon");
					input = sc.nextLine();
					switch(input)
					{
						case "1":
						{
							Musica.stop();
							System.out.println("Você continua sua aventura.");
							TimeUnit.SECONDS.sleep(2);
							break;
						}
						case "2":
						{
							Musica.stop();
							int area = inimigo.getArea() + 1;
							inimigo.setArea(area);
							System.out.printf("Você vai para área %d!%n", inimigo.getArea());
							TimeUnit.SECONDS.sleep(2);
							break;
						}
						case "3":
						{
							Musica.stop();
							System.out.println("Você sai da dungeon em segurança.");
							TimeUnit.SECONDS.sleep(2);
							break GAME;
						}
						default:
						{
							System.out.println("Comando inválido.");
							TimeUnit.SECONDS.sleep(2);
							input = sc.nextLine();
							break;
						}
					}
				}
				else
				{
					Musica.setMusicaMenu(1);

					System.out.println("O que gostaria de fazer?");
					System.out.println("1. Procurar mais inimigos");
					System.out.println("2. Ir para próxima área");
					System.out.println("3. Sair da dungeon");
					input = sc.nextLine();

					switch(input)
					{
						case "1":
						{
							Musica.stop();
							System.out.println("Você continua sua aventura.");
							TimeUnit.SECONDS.sleep(2);
							break;
						}
						case "2":
						{
							Musica.stop();
							int area = inimigo.getArea() + 1;
							inimigo.setArea(area);
							System.out.printf("Você vai para área %d!%n", inimigo.getArea());
							TimeUnit.SECONDS.sleep(2);
							break;
						}
						case "3":
						{
							Musica.stop();
							System.out.println("Você sai da dungeon em segurança.");
							TimeUnit.SECONDS.sleep(2);
							break GAME;
						}
						default:
						{
							System.out.println("Comando inválido.");
							TimeUnit.SECONDS.sleep(2);
							input = sc.nextLine();
							break;
						}
					}
				}
			}
		}
		
	}
	
	public static void Ataque(Jogador jogador, Inimigo inimigo) throws InterruptedException
	{
		Random rand = new Random();
		
		int dano_Enviado = jogador.getJogador_DanoDeAtaque();
		int dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

		inimigo.rmvInimigo_VidaAtual(dano_Enviado);

		System.out.printf("\t> Você acerta o %s causando %d de dano.%n", inimigo.getInimigo_Nome(), dano_Enviado);
		TimeUnit.SECONDS.sleep(2);
		if (inimigo.getInimigo_VidaAtual() > 0) 
		{
			if(dano_Recebido == 0)
			{
				System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
				TimeUnit.SECONDS.sleep(2);
			}
			else
			{
				jogador.rmvJogador_VidaAtual(dano_Recebido);
				System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
				TimeUnit.SECONDS.sleep(2);
			}
		}
		
		if (jogador.getJogador_VidaAtual() < 1) 
		{
			System.out.printf("\t> Você não aguentou o dano recebido!%n");
			TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("---------------------------------------------");
	}
	
	public static void Habilidade(Jogador jogador, Inimigo inimigo) throws InterruptedException
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dano_Enviado = 0;
		int dano_Recebido = 0;
		
		System.out.println("---------------------------------------------");
		System.out.println("\t Qual habilidade usar?");
		
		System.out.printf("\t 1. %s - Dano: %s - Mana: %s%n", Habilidade.getHabilidade_Nome(jogador.getJogador_Habilidade_1()), Habilidade.getHabilidade_DanoDeAtaque(jogador.getJogador_Habilidade_1()), Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_1()));
		System.out.printf("\t 2. %s - Dano: %s - Mana: %s%n", Habilidade.getHabilidade_Nome(jogador.getJogador_Habilidade_2()), Habilidade.getHabilidade_DanoDeAtaque(jogador.getJogador_Habilidade_2()), Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_2()));
		System.out.println("\t 3. Voltar");
		
		String input2 = sc.nextLine();
		
		switch(input2)
		{
			case "1":
			{
				if(jogador.getJogador_ManaAtual() >= Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_1()))
				{
					jogador.rmvJogador_ManaAtual(Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_1()));
					dano_Enviado = Habilidade.getHabilidade_DanoDeAtaque(jogador.getJogador_Habilidade_1());
					dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

					inimigo.rmvInimigo_VidaAtual(dano_Enviado);

					System.out.printf("\t> Você usa sua habilidade %s no %s causando %d de dano.%n", Habilidade.getHabilidade_Nome(jogador.getJogador_Habilidade_1()), inimigo.getInimigo_Nome(), dano_Enviado);
					TimeUnit.SECONDS.sleep(2);
					if (inimigo.getInimigo_VidaAtual() > 0) 
					{
						if(dano_Recebido == 0)
						{
							System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
							TimeUnit.SECONDS.sleep(2);
						}
						else
						{
							jogador.rmvJogador_VidaAtual(dano_Recebido);
							System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
							TimeUnit.SECONDS.sleep(2);
						}
					}
					if (jogador.getJogador_VidaAtual() < 1) 
					{
						System.out.println("\t> Você não aguentou o dano recebido!");
						TimeUnit.SECONDS.sleep(2);
						break;
					}
				}
				else
				{
					System.out.println("\t> Mana insuficiente!");
					TimeUnit.SECONDS.sleep(2);
				}
				break;
			}
			case "2":
			{
				if(jogador.getJogador_ManaAtual() >= Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_2()))
				{
					jogador.rmvJogador_ManaAtual(Habilidade.getHabilidade_CustoDeMana(jogador.getJogador_Habilidade_2()));
					dano_Enviado = Habilidade.getHabilidade_DanoDeAtaque(jogador.getJogador_Habilidade_2());
					dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

					inimigo.rmvInimigo_VidaAtual(dano_Enviado);

					System.out.printf("\t> Você usa sua habilidade %s no %s causando %d de dano.%n", Habilidade.getHabilidade_Nome(jogador.getJogador_Habilidade_2()), inimigo.getInimigo_Nome(), dano_Enviado);
					TimeUnit.SECONDS.sleep(2);
					if (inimigo.getInimigo_VidaAtual() > 0) 
					{
						if(dano_Recebido == 0)
						{
							System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
							TimeUnit.SECONDS.sleep(2);
						}
						else
						{
							jogador.rmvJogador_VidaAtual(dano_Recebido);
							System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
							TimeUnit.SECONDS.sleep(2);
						}
					}
					if (jogador.getJogador_VidaAtual() < 1) 
					{
						System.out.println("\t> Você não aguentou o dano recebido!");
						TimeUnit.SECONDS.sleep(2);
						break;
					}
				}
				else
				{
					System.out.println("\t> Mana insuficiente!");
					TimeUnit.SECONDS.sleep(2);
				}
				break;
			}
			case "3":
			{
				break;
			}
			default:
			{
				System.out.println("\t> Comando inválido.");
				break;
			}
		}
		System.out.println("---------------------------------------------");
	}
	
	public static void Pocao(Jogador jogador, Inimigo inimigo, Pocao pocao) throws InterruptedException
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int dano_Recebido = 0;
		
		System.out.println("---------------------------------------------");
		System.out.println("\t Qual poção usar?");
		System.out.printf("\t 1. Poção de Vida (%d)%n", jogador.getPocao_Vida_Quantidade());
		System.out.printf("\t 2. Poção de Mana (%d)%n", jogador.getPocao_Mana_Quantidade());
		System.out.println("\t 3. Voltar");
		
		String input = sc.nextLine();
		
		switch(input)
		{
			case "1":
			{
				if (jogador.getPocao_Vida_Quantidade() > 0) 
				{
					jogador.adcJogador_VidaAtual(pocao.getPocao_Vida_CuraRecebida());
					if (jogador.getJogador_VidaAtual() > jogador.getJogador_VidaMaxima()) 
					{
						jogador.setJogador_VidaAtual(jogador.getJogador_VidaMaxima());
					}
					jogador.rmvPocao_Vida_Quantidade(1);

					System.out.printf("\t> Você bebe uma poção de vida, curando %d.%n", pocao.getPocao_Vida_CuraRecebida());
					System.out.printf("\t> Você tem %d poções de vida restantes.%n", jogador.getPocao_Vida_Quantidade());
					TimeUnit.SECONDS.sleep(2);

					dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

					if(dano_Recebido == 0)
					{
						System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
						TimeUnit.SECONDS.sleep(2);
					}
					else
					{
						jogador.rmvJogador_VidaAtual(dano_Recebido);
						System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
						TimeUnit.SECONDS.sleep(2);
					}
					
					if (jogador.getJogador_VidaAtual() < 1) 
					{
						System.out.printf("\t> Você não aguentou o dano recebido!%n");
						TimeUnit.SECONDS.sleep(2);
					}
				} 
				else 
				{
					System.out.printf("\t> Você não tem poções de vida!%n");
					TimeUnit.SECONDS.sleep(2);
				}
				break;
			}
			case "2":
			{
				if (jogador.getPocao_Mana_Quantidade() > 0) 
				{
					jogador.adcJogador_ManaAtual(pocao.getPocao_Mana_ManaRecebida());
					if (jogador.getJogador_ManaAtual() > jogador.getJogador_ManaMaxima()) 
					{
						jogador.setJogador_ManaAtual(jogador.getJogador_ManaMaxima());
					}
					jogador.rmvPocao_Mana_Quantidade(1);

					System.out.printf("\t> Você bebe uma poção de mana, restaurando %d.%n", pocao.getPocao_Mana_ManaRecebida());
					System.out.printf("\t> Você tem %d poções de mana restantes.%n", jogador.getPocao_Mana_Quantidade());
					TimeUnit.SECONDS.sleep(2);

					dano_Recebido = rand.nextInt(inimigo.getInimigo_DanoDeAtaque());

					if(dano_Recebido == 0)
					{
						System.out.printf("\t> %s errou o ataque.%n", inimigo.getInimigo_Nome());
						TimeUnit.SECONDS.sleep(2);
					}
					else
					{
						jogador.rmvJogador_VidaAtual(dano_Recebido);
						System.out.printf("\t> Você recebe %d de dano.%n", dano_Recebido);
						TimeUnit.SECONDS.sleep(2);
					}
					TimeUnit.SECONDS.sleep(2);
					if (jogador.getJogador_VidaAtual() < 1) 
					{
						System.out.printf("\t> Você não aguentou o dano recebido!%n");
						TimeUnit.SECONDS.sleep(2);
					}
				} 
				else 
				{
					System.out.printf("\t> Você não tem poções de mana!%n");
					TimeUnit.SECONDS.sleep(2);
				}
				break;
			}
			case "3":
			{
				break;
			}
			default:
			{
				System.out.println("\t> Comando inválido.");
				break;
			}
		}
		System.out.println("---------------------------------------------");
	}
	
	public static void LevelUp(Jogador jogador, Inimigo inimigo, Pocao pocao) throws InterruptedException
	{
		Random rand = new Random();
		int expRecebida = 0;
		
		System.out.printf(" # %s foi derrotado! #%n", inimigo.getInimigo_Nome());
		System.out.println("---------------------------------------------");
		TimeUnit.SECONDS.sleep(2);
		expRecebida = rand.nextInt(inimigo.getInimigo_ExpRecebida());
		jogador.adcJogador_ExpAtual(expRecebida);
		if (jogador.getJogador_ExpAtual() >= jogador.getJogador_ExpProximoNivel()) 
		{
			SFX.setSFX(1);
			while (jogador.getJogador_ExpAtual() >= jogador.getJogador_ExpProximoNivel()) 
			{
				jogador.LevelUp();
			}
			System.out.println(" # Você subiu de nível! #");
			System.out.printf(" # Nível atual: %d%n", jogador.getJogador_Nivel());
			System.out.printf(" # Vida atual: %d/%d%n", jogador.getJogador_VidaAtual(), jogador.getJogador_VidaMaxima());
			System.out.printf(" # Mana atual: %d/%d%n", jogador.getJogador_ManaAtual(), jogador.getJogador_ManaMaxima());
			System.out.printf(" # Dano atual: %d%n", jogador.getJogador_DanoDeAtaque());
			System.out.printf(" # Experiência atual: %d/%d%n", jogador.getJogador_ExpAtual(), jogador.getJogador_ExpProximoNivel());
			System.out.println("---------------------------------------------");
			TimeUnit.SECONDS.sleep(5);
		} 
		else 
		{
			System.out.printf(" # Você recebeu %d de experiência. #%n", expRecebida);
			System.out.printf(" # Vida atual: %d/%d%n", jogador.getJogador_VidaAtual(), jogador.getJogador_VidaMaxima());
			System.out.printf(" # Mana atual: %d/%d%n", jogador.getJogador_ManaAtual(), jogador.getJogador_ManaMaxima());
			System.out.printf(" # Experiência atual: %d/%d%n", jogador.getJogador_ExpAtual(), jogador.getJogador_ExpProximoNivel());
			System.out.println("---------------------------------------------");
			TimeUnit.SECONDS.sleep(5);
		}

		if (rand.nextInt(100) <= pocao.getPocao_Vida_ChanceDrop()) 
		{
			SFX.setSFX(1);
			jogador.adcPocao_Vida_Quantidade(1);
			System.out.printf(" # O %s deixou cair uma poção de vida!%n", inimigo.getInimigo_Nome());
			System.out.printf(" # Você tem agora %d poções de vida restantes.%n", jogador.getPocao_Vida_Quantidade());
			System.out.println("---------------------------------------------");
			TimeUnit.SECONDS.sleep(2);
		}
		
		if (rand.nextInt(100) <= pocao.getPocao_Mana_ChanceDrop()) 
		{
			SFX.setSFX(1);
			jogador.adcPocao_Mana_Quantidade(1);
			System.out.printf(" # O %s deixou cair uma poção de mana!%n", inimigo.getInimigo_Nome());
			System.out.printf(" # Você tem agora %d poções de mana restantes.%n", jogador.getPocao_Mana_Quantidade());
			System.out.println("---------------------------------------------");
			TimeUnit.SECONDS.sleep(2);
		}
	}
}
