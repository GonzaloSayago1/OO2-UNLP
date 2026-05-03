package ar.edu.info.unlp.ejercicioExcursiones;

public class Provisorio implements Estado{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
	    excursion.agregarUsuario(usuario);
	    if(excursion.superoCupoMinimo())
	        excursion.setEstado(new Definitivo());
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.armarMensaje() + excursion.mensajeProvisorio();
	}
}
