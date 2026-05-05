package ar.edu.info.unlp.ejercicioFileManager;

public class FechaModificacionDecorator extends FileDecorator {
	public FechaModificacionDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	protected String impresionAdicional() {
		return " - fecha de modificacion: " + this.componente.getFechaModificacion();
	}
}
