package ar.edu.info.unlp.ejercicioFileManager;

public class PermisoDecorator extends FileDecorator{
	
	public PermisoDecorator(FileComponent componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " - permisos: " + this.componente.getPermisos();
	}
}
