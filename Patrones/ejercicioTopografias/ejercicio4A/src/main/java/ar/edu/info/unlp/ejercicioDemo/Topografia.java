package ar.edu.info.unlp.ejercicioDemo;


public interface Topografia {
	public double proporcionAgua();
	
	public double proporcionTierra();

	public boolean esIgualAMixta(Mixta topografia);
	
	public boolean equals(Object t);
}
