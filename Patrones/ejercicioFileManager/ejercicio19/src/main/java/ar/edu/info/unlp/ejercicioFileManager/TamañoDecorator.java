package ar.edu.info.unlp.ejercicioFileManager;

public class TamañoDecorator extends FileDecorator{
	public TamañoDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	protected String impresionAdicional() {
		return " - tamaño: " + this.componente.getTamaño();
	}
}
