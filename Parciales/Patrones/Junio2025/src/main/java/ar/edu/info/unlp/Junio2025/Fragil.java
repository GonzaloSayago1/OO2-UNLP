package ar.edu.info.unlp.Junio2025;

public class Fragil extends ServicioDecorator{

	public Fragil(IServicio paquete) {
		super(paquete);
	}
	
	@Override
	protected String agregarDescripcion()
	{
		return " fragil";
	}
}
