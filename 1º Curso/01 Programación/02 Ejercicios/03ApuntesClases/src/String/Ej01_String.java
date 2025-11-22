package String;
/**
 *
 * @author Ulises III
 */
public class Ej01_String {
    
    /**
     * 
     *  Clase String 
     * 
     * Metodos de la clase String para
     * 
     * 1. Comparar
     * 
     * 2. Localizar
     * 
     * 3. Remplazar
     * 
     * 4. Dividir
     * 
     * 5. Formato y conversión
     * 
     * 6. Normalización
     * 
     * 7. Cambiar
     * 
     * 
     * 
     * */
    
    
    public static void main(String[] args) {
        int contador = 0; 
        String texto = "habia una vez un texto muy largo donde escribí una frase";
        for (int i = 0; i < texto.length(); i++) {
                // startsWith()
               if (texto.startsWith("habia")) {
                   System.out.println("contador de 'e'" + (contador++));
        }
               // contains()
            if (texto.contains("una")) {
                System.out.println("mensaje 1");
            }
            if (texto.endsWith("muy")) {
                System.out.println("mensaje 2");
            }
            
        }
     
        
        
    }
    
    
}
