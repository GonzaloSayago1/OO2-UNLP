package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio5.Cliente;
import ar.edu.info.unlp.ejercicio5.ElementoAtomico;
import ar.edu.info.unlp.ejercicio5.TablaPeriodica;
import ar.edu.info.unlp.ejercicio5.UnionQuimica;

public class SustanciaTest {
	TablaPeriodica tabla;
	ElementoAtomico oxigeno;
	Cliente cliente;
	UnionQuimica h2o;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		tabla = new TablaPeriodica();
		cliente = new Cliente(tabla);
		h2o = cliente.Agua();
	}
	
	@Test
	public void testOxigeno()
	{
		oxigeno = (ElementoAtomico) tabla.oxigeno();
		assertEquals(16, oxigeno.pesoAtomico());
		assertEquals(-2, oxigeno.cargaElectrica());
		assertFalse(oxigeno.esMetal());
	}
	
	@Test
	public void testAgua() {
	    assertEquals(3, h2o.cantidadElementos());
	    assertEquals(18, h2o.pesoAtomico()); // 1 + 1 + 16
	    assertEquals(0, h2o.cargaElectrica()); // +1 +1 -2
	    assertEquals("molécula", h2o.tipoUnion());
	    assertTrue(h2o.esValida()); // 0 metales, hijos válidos
	}
}
