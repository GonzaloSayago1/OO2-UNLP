package ar.edu.info.unlp.PatronesJulio2023;

import java.time.Duration;

public abstract class Tarea {
	private String descripcion;
	private IEstado estadoActual;
	private long inicio;
	private long fin;
	
	public Tarea(String descripcion) {
		this.descripcion = descripcion;
		this.estadoActual = new EstadoInicial();
	}
	
	protected void setEstado(IEstado estado)
	{
		this.estadoActual = estado;
	}
	
	protected long getTiempoFin() {
		return this.fin;
	}
	
	protected long getTiempoInicio() {
		return this.inicio;
	}
	
	protected void finalizarContador()
	{
		this.fin = System.currentTimeMillis();
	}
	
	protected void iniciarContador(){
		this.inicio = System.currentTimeMillis();
		}
	
	protected IEstado getEstado()
	{
		return this.estadoActual;
	}
	
	public abstract void iniciarTarea();
	public abstract void finalizarTarea();
	public abstract int duracionTotal();
	public abstract long tiempoUtilizado();
	
	public void iniciar()
	{
		this.estadoActual.iniciar(this);
	}
	public void finalizar()
	{
		this.estadoActual.finalizar(this);
	}	
	
	public double avanceTarea()
	{
		long tiempoEnHoras = this.tiempoUtilizado() / 3600000;
		return (double) tiempoEnHoras / this.duracionTotal();
	}	
}
