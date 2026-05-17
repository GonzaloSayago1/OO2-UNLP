package ar.info.unlp.arboles;

public class ArbolVacio implements IArbol{
	private static final ArbolVacio INSTANCIA = new ArbolVacio();
	
	public IArbol getHijoIzquierdo()
	{
		return this;
	}
	
	public IArbol getHijoDerecho()
	{
		return this;
	}
	
	public String recorrerPreorden() 
	{
		return "";	
	}
	
	public String recorrerPostorden() 
	{
		return "";	
	}
	
	public String recorrerInorden() 
	{
		return "";	
	}
	
	public static ArbolVacio getInstance() {
        return INSTANCIA;
    }
	
}
