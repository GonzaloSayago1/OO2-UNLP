package ar.edu.info.unlp.ejercicioDemo;

public class VideoStreamAdapter extends Media{
	private VideoStream video;

	public VideoStreamAdapter(VideoStream video) {
		this.video = video;
	}
	
	public void play()
	{
		this.video.repruduce();
	}
}
