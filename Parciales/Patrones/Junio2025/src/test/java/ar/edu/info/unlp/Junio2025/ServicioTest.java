package ar.edu.info.unlp.Junio2025;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {
	Paquete paquete;
	Seguro seguro;
	Expres expres;
	
	@BeforeEach
	void setUp() throws Exception
	{
		//public Paquete(String descripcion, String destinatario, String direccionDestino, double valorDeclarado) {
		paquete = new Paquete("Caja de Libros", "Jose", "La Plata", 20000);
		seguro = new Seguro(paquete);
		expres = new Expres(seguro);
	}
	
	@Test
	public void testEnvio()
	{
		assertEquals(1000, paquete.getCostoEnvio());
		assertEquals(5000, seguro.getCostoEnvio());
		assertEquals(15000, expres.getCostoEnvio());
	}
	
	@Test
	public void testDescripcion()
	{
		assertEquals("Caja de Libros", paquete.getDescripcion());
		assertEquals("Caja de Libros con seguro", seguro.getDescripcion());
		assertEquals("Caja de Libros con seguro entrega express", expres.getDescripcion());
	}
}
