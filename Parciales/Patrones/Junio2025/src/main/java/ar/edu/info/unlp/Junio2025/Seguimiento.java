package ar.edu.info.unlp.Junio2025;

public class Seguimiento extends ServicioDecorator{
	static double costoAdicional = 2000;
	
	public Seguimiento(IServicio paquete) {
		super(paquete);
	}
	
	@Override
	protected double sumarEnvio()
	{
		return costoAdicional;
	}

}
