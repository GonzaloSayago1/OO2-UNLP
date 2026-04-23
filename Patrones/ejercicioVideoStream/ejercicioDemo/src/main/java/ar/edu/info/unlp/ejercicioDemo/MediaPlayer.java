package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> media;

	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public void play()
	{
		this.media.stream().forEach(m -> m.play());
	}
	
	public void agregarMedia(Media media)
	{
		this.media.add(media);
	}
}
