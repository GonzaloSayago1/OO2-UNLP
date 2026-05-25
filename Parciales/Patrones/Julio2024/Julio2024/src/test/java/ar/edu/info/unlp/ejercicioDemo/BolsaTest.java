package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BolsaTest {
	Bolsa bolsa;
	ItemUnitario item, itemGrande;
	
	@BeforeEach
	void setUp() throws Exception
	{
		bolsa = new Bolsa(1, "bolsa", 10); 
		item = new ItemUnitario(3, "item");
		itemGrande = new ItemUnitario(30, "item");
	}
	
	@Test
	public void testAgregar()
	{
		assertTrue(bolsa.agregarALaBolsa(item));
		assertTrue(bolsa.agregarALaBolsa(new Bolsa(1, "bolsa2", 13)));
		assertFalse(bolsa.agregarALaBolsa(itemGrande));
	}
}
