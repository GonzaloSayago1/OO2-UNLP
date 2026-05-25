package ar.edu.info.unlp.PatronesJulio2023;

import org.junit.jupiter.api.Test;

public class TestTareas {
	@Test
	public void testAvanceTareaCompleja() {
	    TareaSimple supermercado = new TareaSimple("ir al supermercado", 3) {
	        long[] tiempos = {9, 11};
	        int llamada = 0;
	        protected long ahora() { return tiempos[llamada++]; }
	    };

	    TareaSimple verduleria = new TareaSimple("ir a la verduleria", 1) {
	        long[] tiempos = {11, 12};
	        int llamada = 0;
	        protected long ahora() { return tiempos[llamada++]; }
	    };

	    TareaCompleja realizarCompras = new TareaCompleja("realizar compras");
	    realizarCompras.agregarTarea(supermercado);
	    realizarCompras.agregarTarea(verduleria);

	    realizarCompras.iniciar();
	    realizarCompras.finalizar();
	}
}
