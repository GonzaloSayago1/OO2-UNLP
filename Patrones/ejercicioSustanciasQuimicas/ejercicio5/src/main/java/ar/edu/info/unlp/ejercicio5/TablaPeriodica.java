package ar.edu.info.unlp.ejercicio5;

public class TablaPeriodica {
	
	public ElementoQuimico oxigeno()
	{
		return new ElementoAtomico("O", 16, -2, false);
	}
	
	public ElementoQuimico cloro()
	{
		return new ElementoAtomico("CI", 35, -1, false);
	}
	
	public ElementoQuimico calcio()
	{
		return new ElementoAtomico("Ca", 40, 2, true);
	}
	
	public ElementoQuimico sodio()
	{
		return new ElementoAtomico("Na", 23, 1, true);
	}
	
	public ElementoQuimico hidrogeno()
	{
		return new ElementoAtomico("H", 1, 1, false);
	}
	
	public ElementoQuimico atomWithSymbol(String symbol)
	{
		return null;
	}
}
