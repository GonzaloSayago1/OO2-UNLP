package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class CancelacionEstricta implements ICancelacion{
	
	@Override
	public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
		return 0;
	}
}
