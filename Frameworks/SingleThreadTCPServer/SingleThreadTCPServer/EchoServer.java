
import java.io.PrintWriter;

public class EchoServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {
        new EchoServer().startLoop(args);
    }
    
    @Override
    protected String sessionCloseCommand() {
        return "QUIT";//Ejemplo de sobreescribir par terminar con la palabra "QUIT"
    }
}