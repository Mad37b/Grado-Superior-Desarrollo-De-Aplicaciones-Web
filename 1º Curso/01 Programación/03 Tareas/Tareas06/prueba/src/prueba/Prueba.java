package prueba;
/**
 * Ejercicio 4 examen
 * @author Miguel Ángel
 */
import java.util.Scanner;
public class Prueba{
    public static void main(String[] args) {
        
            System.out.println("Bienvenido al ejercicio 4 ");

            Scanner teclado = new Scanner ( System.in);
            String numeroStr="";
            String cadena = teclado.nextLine();
            String cadenaFinal= "";
            int numero;
            while( !cadena.equalsIgnoreCase("fin")){    
            char letra = cadena.charAt(0);// obtenemos la primera letra
                for (int i = 0; i < cadena.length(); i++) {

                    numeroStr= cadena.substring(i); // obtener el numero final                     
                    
                    System.out.println("pruebo if -- " +   numeroStr);
              }      
              // Compruebo que he obtenido el numero y la letra
            System.out.println("pruebo aqui " + numeroStr);
            System.out.println(letra); 
           //PARSEINT 
           
           numero = Integer.parseInt(numeroStr);
                   
            // 3. Aqui hago la suma 
   
                for (int i = 0; i < numero; i++) {
                  
                    cadenaFinal = letra + cadena; // Aqui está la clave , queda que se vaya sumando cada letra cada fila , solo sumo 1 letra
                  
                }
                
                System.out.println("Perfecto , el resultaado a  sido " + cadenaFinal);
                
                System.out.println("Introduce otra palabra o escribe ' fin ' ");

                cadena = teclado.nextLine(); // 
            }
        }
    }

