package ar.edu.info.unlp.Junio2025;

public class Seguro extends ServicioDecorator{

	public Seguro(IServicio paquete) {
		super(paquete);
	}
	
	@Override
	protected String agregarDescripcion()
	{
		return " con seguro";
	}
	
	@Override
	protected double sumarEnvio()
	{
		return this.getPaquete().getValorDeclarado() * 0.2;
	}
}
