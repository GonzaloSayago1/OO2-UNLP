package ar.edu.info.unlp.ejercicioFileManager;

public class ExtensionDecorator extends FileDecorator{
	
	
	public ExtensionDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	protected String impresionAdicional() {
		return " - extension: " + this.componente.getExtension();
	}
}
