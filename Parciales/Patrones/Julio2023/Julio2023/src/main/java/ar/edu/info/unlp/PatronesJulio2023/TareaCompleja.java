package ar.edu.info.unlp.PatronesJulio2023;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea{
	private List<Tarea> tareas;
	
	public TareaCompleja(String descripcion) {
		super(descripcion);
		this.tareas = new ArrayList<Tarea>();
	}
	
	public void agregarTarea(Tarea tarea)
	{
		this.tareas.add(tarea);
	}
	
	@Override
	public int duracionTotal()
	{
		return this.tareas.stream().mapToInt(t -> t.duracionTotal()).sum();
	}

	@Override
	public void iniciarTarea() {
		this.tareas.stream().forEach(t -> t.iniciar());
	}

	@Override
	public long tiempoUtilizado() {
		return this.tareas.stream().mapToLong(t -> t.tiempoUtilizado()).sum();
	}

	@Override
	public void finalizarTarea() {
		this.tareas.forEach(t -> t.finalizar());	
	}
}
