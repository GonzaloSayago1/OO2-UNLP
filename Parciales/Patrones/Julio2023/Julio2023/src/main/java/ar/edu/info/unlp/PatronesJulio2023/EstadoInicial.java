package ar.edu.info.unlp.PatronesJulio2023;

import java.time.Duration;

public class EstadoInicial implements IEstado{

	@Override
	public void iniciar(Tarea tarea) 
	{
		tarea.iniciarTarea();
		tarea.setEstado(new EstadoEnProceso());
	}

	@Override
	public void finalizar(Tarea tarea) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long tiempoUtilizado(Tarea tarea) {
		return 0;
	}	
}
