package github.lugom.JogoSimples.Jogo;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SFX 
{
	private static Clip clip;
	private static String[] sfx = {"RunAway.wav", "LevelUp.wav"};
	
	public static void setSFX(int i)
	{
		File soundURL = new File("src/github/lugom/JogoSimples/SFX/" + sfx[i]);
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
	}
}
