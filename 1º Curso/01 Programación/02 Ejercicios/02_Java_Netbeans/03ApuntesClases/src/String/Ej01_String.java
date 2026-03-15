package String;
/**
 *
 * @author Ulises III
 */
public class Ej01_String {
 
    public static void main(String[] args) {
        int contador = 0; 
        String texto = "habia una vez un texto muy largo donde escribí una frase";
        for (int i = 0; i < texto.length(); i++) {
                // startsWith()
               if (texto.startsWith("habia")) {
                   System.out.println("contador de 'e'" + (texto.startsWith("juan")));
        }
               // contains()
            if (texto.contains("una")) {
                System.out.println("mensaje 1");
            }   // endsWith()
            if (texto.endsWith("muy")) {
                System.out.println("mensaje 2");
            }
            
        }
     
        
        
    }
    
    
}
