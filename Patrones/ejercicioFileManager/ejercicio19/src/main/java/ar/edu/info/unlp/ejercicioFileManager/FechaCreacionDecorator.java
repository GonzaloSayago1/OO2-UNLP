package ar.edu.info.unlp.ejercicioFileManager;

public class FechaCreacionDecorator extends FileDecorator{
	public FechaCreacionDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " - fecha de creación: " + this.componente.getFechaCreacion();
	}
}
