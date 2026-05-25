package ar.edu.info.unlp.PatronesJulio2023;

public class TareaSimple extends Tarea{
	private int duracionEstimada;
	
	public TareaSimple(String descripcion, int duracion) {
		super(descripcion);
		this.duracionEstimada = duracion;
	}
	
	private int getDuracionEstimada()
	{
		return this.duracionEstimada;
	}
	
	@Override
	public int duracionTotal()
	{
		return this.getDuracionEstimada();
	}
	
	@Override
	public void iniciarTarea() 
	{	
		this.iniciarContador();
	}

	@Override
	public long tiempoUtilizado() {
		return this.getEstado().tiempoUtilizado(this);
	}

	@Override
	public void finalizarTarea() {
		this.finalizarContador();
		
	}
}
