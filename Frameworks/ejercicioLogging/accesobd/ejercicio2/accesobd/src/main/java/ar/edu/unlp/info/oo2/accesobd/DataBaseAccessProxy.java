package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class DataBaseAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean autenticado;
	Logger logger = Logger.getLogger(DataBaseAccessProxy.class.getName());
	
	public DataBaseAccessProxy(DatabaseRealAccess db, boolean autenticado) {
		this.db = db;
		this.autenticado = autenticado;
	}
	
	public void estaAutenticado()
	{
		if(!this.autenticado) {
			logger.severe("Error: Usuario no autenticado");
			throw new RuntimeException();
		}
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		this.estaAutenticado();
		logger.info("Consultando en base de datos...");
	    return this.db.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
	    this.estaAutenticado();
	    logger.warning("Agregando en base de datos...");
	    return this.db.insertNewRow(rowData);
	}
	
	public void autenticarUsuario(boolean estado)
	{
		this.autenticado = estado;
	}
}
