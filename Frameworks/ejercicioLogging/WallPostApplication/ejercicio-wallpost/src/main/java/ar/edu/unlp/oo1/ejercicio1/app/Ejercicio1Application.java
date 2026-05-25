package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.formatter.JsonFormatter;
import ar.edu.unlp.oo1.ejercicio1.formatter.UpperCaseFormatter;
import ar.edu.unlp.oo1.ejercicio1.handler.EmailHandler;
import ar.edu.unlp.oo1.ejercicio1.handler.FilterHandler;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {
	public static void main(String[] args) throws SecurityException, IOException {
		// logger del modelo
        Logger loggerModelo = Logger.getLogger(WallPostImpl.class.getName());
        FileHandler fileHandler = new FileHandler("wallpost.log");
        fileHandler.setFormatter(new JsonFormatter()); // formato JSON
        FilterHandler filterHandler = new FilterHandler(fileHandler, Arrays.asList("palabraProhibida"));
        loggerModelo.addHandler(filterHandler);
        
        // logger de la UI
        Logger loggerUI = Logger.getLogger(WallPostUI.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new UpperCaseFormatter()); // formato mayúsculas
        loggerUI.addHandler(consoleHandler);
        
        //EmailHandler
        EmailHandler emailHandler = new EmailHandler(Arrays.asList("destino@mail.com"));
        loggerModelo.addHandler(emailHandler);
        
        // arrancar la aplicación
        Logger logger = Logger.getLogger(Ejercicio1Application.class.getName());
        SwingUtilities.invokeLater(() -> {
            logger.info("Iniciando aplicación...");
            new WallPostUI();
        });
	}
}
