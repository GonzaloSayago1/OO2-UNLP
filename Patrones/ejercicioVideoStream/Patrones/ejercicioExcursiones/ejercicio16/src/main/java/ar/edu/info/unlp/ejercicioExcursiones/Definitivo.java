package ar.edu.info.unlp.ejercicioExcursiones;

public class Definitivo implements Estado{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) {
	    if(excursion.hayLugar()) {
	        excursion.agregarUsuario(usuario);
	        if(!excursion.hayLugar())  // verificar si se llenó después de agregar
	            excursion.setEstado(new Lleno());
	    } else {
	        excursion.agregarUsuarioEnEspera(usuario);
	    }
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.armarMensaje() + excursion.mensajeDefinitivo();
	}

	@Override
	public boolean estaLLeno() {
		// TODO Auto-generated method stub
		return false;
	}
}
