package ar.edu.info.unlp.ejercicioExcursiones;

public interface Estado {
	public void inscribir(Excursion excursion, Usuario usuario);
	public String obtenerInformacion(Excursion excursion);
}
