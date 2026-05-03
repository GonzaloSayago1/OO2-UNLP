package ar.edu.info.unlp.ejercicio5;

public class Cliente {
	private TablaPeriodica tabla;
	
	public Cliente(TablaPeriodica tabla)
	{
		this.tabla = tabla;
	}
	
	public UnionQuimica Agua()
	{
		UnionQuimica h2o = new UnionQuimica();
	    h2o.add(tabla.hidrogeno());
	    h2o.add(tabla.hidrogeno());
	    h2o.add(tabla.oxigeno());
	    return h2o;
	}
}
