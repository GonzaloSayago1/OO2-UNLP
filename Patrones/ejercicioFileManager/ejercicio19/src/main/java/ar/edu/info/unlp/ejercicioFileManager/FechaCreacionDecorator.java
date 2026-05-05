package ar.edu.info.unlp.ejercicioFileManager;

public class FechaCreacionDecorator extends FileDecorator{
	public FechaCreacionDecorator(FileComponent componente) {
		super(componente);
	}
	
	@Override
	protected String impresionAdicional() {
		return " - fecha de creación: " + this.componente.getFechaCreacion();
	}
}
