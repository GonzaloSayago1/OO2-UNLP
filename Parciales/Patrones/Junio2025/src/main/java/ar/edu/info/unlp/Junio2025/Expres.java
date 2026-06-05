package ar.edu.info.unlp.Junio2025;

public class Expres extends ServicioDecorator{

	public Expres(IServicio paquete) {
		super(paquete);
	}
	
	@Override
	protected String agregarDescripcion()
	{
		return " entrega express";
	}
	
	@Override
	protected double sumarEnvio()
	{
		return this.getPaquete().getValorDeclarado() * 0.5;
	}
}
