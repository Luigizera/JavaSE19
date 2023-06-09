package github.lugom.JogoSimples.Jogo;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;

public class Musica 
{
	private static Clip clip;
	private static String[] Musica_Batalha = {"Battle1-HereitComes.wav", "Battle2-NoMercy.wav"};
	private static String[] Musica_MiniBoss = {"Boss1-AlphaMission.wav", "Boss2-AtlantisRage.wav"};
	private static String[] Musica_Menu = {"Victory1-Ringside.wav", "Victory2-Freeling.wav"};
	
	public static void setMusicaBatalha()
	{
		Random rand = new Random();
		File soundURL = new File("src/github/lugom/JogoSimples/Musica/" + Musica_Batalha[rand.nextInt(Musica_Batalha.length)]);
		try
		{
			AudioInputStream AIS = AudioSystem.getAudioInputStream(soundURL);
			clip = AudioSystem.getClip();
			clip.open(AIS);
		}
		catch (Exception e)
		{
			System.out.println("Erro ao colocar musica: " + e);
		}
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void setMusicaMenu(int i)
	{
		Random rand = new Random();
		File soundURL = new File("src/github/lugom/JogoSimples/Musica/" + Musica_Menu[i]);
		try
		{
			AudioInputStream AIS = AudioSystem.getAudioInputStream(soundURL);
			clip = AudioSystem.getClip();
			clip.open(AIS);
		}
		catch (Exception e)
		{
			System.out.println("Erro ao colocar musica: " + e);
		}
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void setMusicaMiniBoss()
	{
		Random rand = new Random();
		File soundURL = new File("src/github/lugom/JogoSimples/Musica/" + Musica_MiniBoss[rand.nextInt(Musica_MiniBoss.length)]);
		try
		{
			AudioInputStream AIS = AudioSystem.getAudioInputStream(soundURL);
			clip = AudioSystem.getClip();
			clip.open(AIS);
		}
		catch (Exception e)
		{
			System.out.println("Erro ao colocar musica: " + e);
		}
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void stop()
	{
		clip.stop();
	}
	
}
