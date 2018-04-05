
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) throws IOException {
		
		final File fichero = new File("texto.txt");
	    final String ruta = "texto.txt";
	    FileWriter file  = null;
	    PrintWriter pw = null;
	    
	    
	    
	    if(fichero.exists()) {
        	logger.info("Modificando el fichero.");

        	
        } else {
           	logger.info("Creando el fichero.");
        	
        }
	    try {
	    	file  = new FileWriter (ruta, true);
	        pw = new PrintWriter(file);

	        pw.println("�Qu� es poes�a? Dices mientras clavas");
	        pw.println("en mi pupila tu pupila azul;");
	        pw.println("�Qu� es poes�a...? �Y t� me lo preguntas?");
	        pw.print("�Poes�a eres t�!");
	        pw.close();
	        	        
	    } catch (IOException ex) {
	        System.out.println("Error: "); 
	    }
	    
	}

}
