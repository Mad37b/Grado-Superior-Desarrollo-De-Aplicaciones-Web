import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Fichero {

	String salidaFichero;

	// Crear fichero
	static final String ruta =("/");
	File ficheroMenu = new File(ruta);
	
	
	   private static final String RUTA_ARCHIVO = "clientesMenu.VDA";

	    public static void crearFichero(String seleccionPrimero, String seleccionSegundo, String seleccionPostre, String seleccionBebida) {
	        try (FileWriter nuevoMenu = new FileWriter(RUTA_ARCHIVO, true)) {
	            nuevoMenu.write("Primer plato: " + seleccionPrimero + "\n");
	            nuevoMenu.write("Segundo plato: " + seleccionSegundo + "\n");
	            nuevoMenu.write("Postre: " + seleccionPostre + "\n");
	            nuevoMenu.write("Bebida: " + seleccionBebida + "\n");
	            nuevoMenu.write("\n"); // Separador entre cada pedido
	        } catch (IOException ex) {
	            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
	        }
	    }
	
	
	
	private void leerFichero(String cliente) {
		
		try {
			Scanner fichero = new Scanner(ficheroMenu);
			while(fichero.hasNextLine()) {
				
				String linea = fichero.nextLine()
;				
			}
			fichero.close();
		}catch(Exception e) {
			System.out.println("Error 1 = No se ha podido leer el archivo ");
			e.printStackTrace();
		}
	}
	
	

}
