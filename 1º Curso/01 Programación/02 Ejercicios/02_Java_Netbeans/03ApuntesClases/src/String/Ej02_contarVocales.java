package String;
/**
 *
 * @author Ulises III
 */
public class Ej02_contarVocales {
    
    public static void main(String[] args) {
        // 1. Iniciar un String
        String texto ="Erase una tierra con muchas historias  que contar";
        String parrafo = new String ("aqui es donde añado un valor si no estoy vacio"); // por el constructor
        String palabra;
       char vocalesA;
       // 2. Longitud de la cadena .legth();
       // 3. Acceder a un caracter .charArt() por indice o por int
       // 4. escoger una frase o palabra con .substring
       
        for (int i = 0; i < texto.length(); i++) {
            
            vocalesA = texto.charAt(i);
       
            //System.out.print(vocalesA);
            
            //System.out.println(texto.charAt(i)); 
            
        
        }
            palabra=texto.substring(0,6);
            palabra = palabra.toUpperCase(); // así se hace , hay que reasignar
            palabra = palabra.replace(palabra,"QUERIDA"); // Remplazando // palabra anterior - palabra nueva
            System.out.println(palabra);
       
        
        if (texto.equals(parrafo)) {
            System.out.println("esto va");
        }
    }
    
}
