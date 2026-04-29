package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface ICancelacion {
	public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva);
}
