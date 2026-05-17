package ar.info.unlp.arboles;

public interface IArbol {
	public IArbol getHijoIzquierdo();
	public IArbol getHijoDerecho();
	public String recorrerPreorden();
	public String recorrerPostorden();
	public String recorrerInorden();
}
