package ar.edu.info.unlp.ejercicioPlanesMedicos;

public interface ICoseguro {
	public double realizarDescuento(double monto);
	public double descontarViaje(double monto);
	public double descontarAntiguedad(double descuento);
}
