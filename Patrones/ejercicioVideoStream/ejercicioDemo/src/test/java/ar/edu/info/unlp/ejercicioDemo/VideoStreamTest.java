package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoStreamTest {
	VideoStreamAdapter adapter;
	MediaPlayer mediaPlayer;
	
	@BeforeEach
	void setUp() throws Exception
	{
		adapter = new VideoStreamAdapter(new VideoStream());
		mediaPlayer = new MediaPlayer();
		mediaPlayer.agregarMedia(adapter);
	}
	
	@Test
	public void playTest() {
	    // Si este método llega al final sin tirar error, el adaptador está bien conectado
	    assertDoesNotThrow(() -> mediaPlayer.play());
	}
}
