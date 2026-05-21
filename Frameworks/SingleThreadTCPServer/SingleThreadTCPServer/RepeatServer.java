import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer{

	@Override
	public void handleMessage(String message, PrintWriter out) {
		String[] args = message.split(",");
		//Verifico tener 3 numeros
        if (args.length != 2) {
            out.println("Error: El formato debe ser 'texto,numero'");
            return;
        }
        String texto = args[0];
        String cantidadStr = args[1].trim();
        //valido argumentos 
        if (!verificarArg1(texto) || !verificarArg2(cantidadStr)) {
            out.println("Error: Argumentos inválidos. El segundo argumento debe ser un número entero.");
            return;
        }
        int veces = Integer.parseInt(cantidadStr);
        String resultado = (texto + " ").repeat(veces).trim();
        out.println(resultado);
	}
	
	public static void main(String[] args) {
		
        new RepeatServer().startLoop(args);
    }
	
	private boolean verificarArg1(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
	
	private boolean verificarArg2(String number) {
        try {
            int valor = Integer.parseInt(number);
            return valor > 0; 
        } catch (NumberFormatException e) {
            return false; 
        }
    }
}
