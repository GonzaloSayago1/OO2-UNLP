package ar.edu.info.unlp.PatronesJulio2023;

import java.time.Duration;

public class EstadoCompletada implements IEstado{

	@Override
	public void iniciar(Tarea tarea) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finalizar(Tarea tarea) {
		
	}

	@Override
	public long tiempoUtilizado(Tarea tarea) {
		return tarea.getTiempoFin() - tarea.getTiempoInicio();
	}
}
