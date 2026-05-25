package ar.edu.info.unlp.PatronesJulio2023;

import java.time.Duration;

public class EstadoEnProceso implements IEstado{

	@Override
	public void iniciar(Tarea tarea) {
	}

	@Override
	public void finalizar(Tarea tarea) {
		tarea.finalizarContador();
		tarea.setEstado(new EstadoCompletada());
	}

	public long tiempoUtilizado(Tarea tarea) {
		return 0;
	}
}
