import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }
    private String generarPassword(String letras, String numeros, String especiales) {
        Random random = new Random();
        List<Character> chars = new ArrayList<>();
        // Agrego caracteres obligatorios
        chars.add(especiales.charAt(random.nextInt(especiales.length())));
        chars.add(numeros.charAt(random.nextInt(numeros.length())));
        // Agrego las 6 letras
        for (int i = 0; i < 6; i++) {
            chars.add(letras.charAt(random.nextInt(letras.length())));
        } 
        // Mezclo los caracteres
        Collections.shuffle(chars);
        // Armo el String de retorno
        StringBuilder password = new StringBuilder();
        for (char c : chars) {
            password.append(c);
        }
        return password.toString();
    }
	 
	@Override
	public void handleMessage(String message, PrintWriter out) {
		String[] args = message.split(",");
	    String letras = args[0];
	    String numeros = args[1];
	    String especiales = args[2];
	    
	    String password = generarPassword(letras, numeros, especiales);
	    out.println(password);
	}
}
