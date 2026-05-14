package ar.edu.info.unlp.ejercicioPlanesMedicos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coseguro {
	private String nombre;
	private int descuento;
	private LocalDate fechaIngreso;
	private double montoCobertura;
	
	public Coseguro(String nombre, int descuento, LocalDate fechaIngreso, double montoCobertura) {
		this.nombre = nombre;
		this.descuento = descuento;
		this.fechaIngreso = fechaIngreso;
		this.montoCobertura = montoCobertura;
	}
	
	public int getDescuento() {
		return descuento;
	}
	
	public long getAntiguedad() {
		return ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now());
	}

	public double getMontoCobertura() {
		return montoCobertura;
	}
	
	public double realizarDescuento(double monto)
	{
		return monto -= (monto * this.descuento);
	}
	
	public double descontarViaje(double monto)
	{
		return monto - this.montoCobertura;
	}
	
	protected double descontarAntiguedad(double descuento)
	{
		return this.getAntiguedad() * descuento;
	}
}
