package ar.edu.info.unlp.ejercicioFileManager;

public class PermisoDecorator extends FileDecorator{
	
	public PermisoDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	protected String impresionAdicional() {
		return " - permisos: " + this.componente.getPermisos();
	}
}
