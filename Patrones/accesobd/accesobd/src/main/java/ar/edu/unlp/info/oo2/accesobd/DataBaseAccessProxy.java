package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DataBaseAccessProxy implements DatabaseAccess{
	private DatabaseAccess db;
	private boolean autenticado;
	
	public DataBaseAccessProxy(DatabaseAccess db, boolean autenticado) {
		this.db = db;
		this.autenticado = autenticado;
	}
	
	public boolean estaAutenticado()
	{
		return this.autenticado;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!this.estaAutenticado())
	        throw new RuntimeException("Usuario no autenticado");
	    return this.db.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(!this.estaAutenticado())
	        throw new RuntimeException("Usuario no autenticado");
		return this.db.insertNewRow(rowData);
	}
	
	public void autenticarUsuario(boolean estado)
	{
		this.autenticado = estado;
	}
}
