package ar.edu.info.unlp.ejercicioFileManager;

public class FechaModificacionDecorator extends FileDecorator {
	public FechaModificacionDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " - fecha de modificacion: " + this.componente.getFechaModificacion();
	}
}
