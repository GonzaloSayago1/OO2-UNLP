package ar.edu.unlp.oo1.ejercicio1.handler;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class EmailHandler extends Handler{
	private List<String> emails;
	
	
	public EmailHandler(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public void publish(LogRecord record) {
		this.emails.stream()
		.forEach(destinatario -> System.out.println("Enviando mail a: " + destinatario 
		        + " | Mensaje: " + record.getMessage() 
		        + " | Nivel: " + record.getLevel()));
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

}
