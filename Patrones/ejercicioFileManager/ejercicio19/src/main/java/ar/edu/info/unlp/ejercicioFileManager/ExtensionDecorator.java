package ar.edu.info.unlp.ejercicioFileManager;

public class ExtensionDecorator extends FileDecorator{
	
	
	public ExtensionDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " - extension: " + this.componente.getExtension();
	}
}
