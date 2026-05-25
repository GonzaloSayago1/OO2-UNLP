package ar.edu.info.unlp.PatronesJulio2023;

import java.time.Duration;

public interface IEstado {
	public void iniciar(Tarea tarea);
	public void finalizar(Tarea tarea);
	public long tiempoUtilizado(Tarea tarea);
}
