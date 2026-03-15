package arrays;

/**
 *
 * @author Ulises III
 */
public class prueba {
    
    public static void main(String[] args) {
        int[] valores = {4, 21, 6, 33, 10, 2, 50, 17};   
        int numero=0;
        int mayor;
        int veces=0;
        //Crea un nuevo array que contenga solo los números mayores que 15.
        
        for (int i = 0; i < valores.length; i++) {
             numero = valores[i];
            if (numero > 15 ) {
               // aqui no puedo asignar mayores
                 veces++;
            }
            
        }
        
        // donde debo asignar los valores de mayores
        
        int mayores[] =new int [veces];
       
        System.out.println("Numeros mayores que 15 ");
        for (int i = 0; i < mayores.length; i++) {
          
                  numero = valores[i];
                   if (valores[i] > 15){
                        mayores[i] = valores[i];
                        System.out.print(mayores[i] + " - ");
                
            }
        }
    }
}