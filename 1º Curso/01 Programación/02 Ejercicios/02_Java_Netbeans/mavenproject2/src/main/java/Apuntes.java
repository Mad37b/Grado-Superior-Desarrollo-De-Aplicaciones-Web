

/**
 *
 * @author Ulises III
 */
import java.util.*;
public class Apuntes {

    public static void main(String[] args) {
   
        // 1. Contador y acomulador.
        
        int contador= 0 ;
        int acomulador = 0;
        String lista [] = new String [5];
       
        
        //contador
        
        while ( contador < 10){
            
            contador++;
            System.out.println("valor del contador =" + contador);
        }
        // acomulador //  
        while(acomulador < 10 ){
            
          
            acomulador += 4;
            
            System.out.println("valor del acomulador = " +acomulador);
            
        }
        // 2. Array 
        
            // Añadir directamente
            
                                // Añadir varias veces 
      				for( int i = 0; i < lista.length ; i++) {
					
					 
					String valor = "carlos";
					lista [i] = valor ; // introducimos siempre carlos hasta la posicion 5.
					
					System.out.println("Perfecto , el valor introducido a sido " + valor + "\n");
					System.out.println("El resultado a sido ;" + " Indice " + i + " - " + lista[i]);
					System.out.println("El resultado total es " + Arrays.toString(lista));
					contador++;
					
				}
                                
                                // Añadir una vez
                                if ( 1 < contador){
                                    System.out.println("probando");
                                    int i = 3;
                                    String valor = "Lorena";
                                         lista [i] = valor ; // introducimos siempre carlos hasta la posicion 5.


                                    System.out.println("Perfecto , el valor introducido a sido " + valor + "\n");
                                         System.out.println("El resultado a sido ;" + " Indice " + i + " - " + lista[i]);
                                         System.out.println("El resultado total es " + Arrays.toString(lista));
                                }else{System.out.println("no devuelvo nada en el if ");}
        
            // Modificar
            
            // Borrar
            
            // 3. Condicionales y bucles
       
    }
}
