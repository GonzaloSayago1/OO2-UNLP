package ar.edu.info.unlp.ejercicioMensajero;

public class FeistelCipherAdapter implements TipoCifrado{
	private FeistelCipher feistel;

	public FeistelCipherAdapter(FeistelCipher feistel) {
		this.feistel = feistel;
	}
	
	public String cifrar(String mensaje)
	{
		return this.feistel.encode(mensaje);
	}
	
	public String desencriptar(String mensaje)
	{
		return this.feistel.encode(mensaje);
	}
}
