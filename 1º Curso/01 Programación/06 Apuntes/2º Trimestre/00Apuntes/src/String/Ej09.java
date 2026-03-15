package String;

/**
 * Ejercicios de palindromos 
 * @author Ulises III
 */
public class Ej09 {
    
    public static void main(String[] args) {
        
        String texto = "Ana se fue la lavanderia a lavar";
        
        texto.replaceAll(" ", "");
        char derecho;
        char inverso;
        boolean esPalindromo=false;
        for (int i = 0; i < texto.length(); i++) {
            
            derecho= texto.charAt(i);
            
            inverso = texto.charAt(texto.length()-1-i); // recorre el indice al revés
            
            if (derecho != inverso) {
               
                esPalindromo=false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("la frase es palindroma");
            
        }else{
            System.out.println("la frase no es palindroma");
        }
    }
}
