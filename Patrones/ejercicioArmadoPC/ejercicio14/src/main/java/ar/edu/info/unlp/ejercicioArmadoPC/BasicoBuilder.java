package ar.edu.info.unlp.ejercicioArmadoPC;

public class BasicoBuilder extends ComputadoraBuilder {

	@Override
	public void agregarProcesador(Catalogo catalogo) {
		this.getComputadora().agregarComponente(catalogo.getComponente("Procesador Basico"));
	}

	@Override
	public void agregarMemoriaRam(Catalogo catalogo) {
		this.getComputadora().agregarComponente(catalogo.getComponente("8 GB"));
	}

	@Override
	public void agregarDisco(Catalogo catalogo) {
		this.getComputadora().agregarComponente(catalogo.getComponente("HDD 500 GB"));
	}

	@Override
	public void agregarTarjetaGrafica(Catalogo catalogo) {
		//No hace nada 
	}

	@Override
	public void agregarGabinete(Catalogo catalogo) {
		this.getComputadora().agregarComponente(catalogo.getComponente("Gabinete Estandar"));
	}
	
}
