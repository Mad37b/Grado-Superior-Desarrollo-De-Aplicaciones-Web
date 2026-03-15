package ejerciciosud4;

/**
 *Apartado 16
 * @author Ulises III
 */
public class Ej16_sumarNumeros30 {
    
    
    
    public static void main(String[] args) {
        
        int num = 1;
        int suma=0;
        
        while ( suma <= 29){
            
         suma += num;   
            System.out.println("el valor de la suma ha sido " + suma);
           
        }
        
        System.out.println("");
         System.out.println("la media total a sido " + (suma / 30));
    }
    
}
