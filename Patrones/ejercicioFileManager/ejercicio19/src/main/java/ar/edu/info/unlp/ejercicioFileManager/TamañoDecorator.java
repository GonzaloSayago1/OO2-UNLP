package ar.edu.info.unlp.ejercicioFileManager;

public class TamañoDecorator extends FileDecorator{
	public TamañoDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " - tamaño: " + this.componente.getTamaño();
	}
}
