package ejercicioArbolUD3;
/**
 * enlace : https://aceptaelreto.com/problem/statement.php?id=368
 * @author Ulises III
 */
import java.util.Scanner;
public class Ej04Huevos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        int nHuevos;
        int nCapacidad;
        int minutos;
        int nRondas=0;
      while(true){
          
         nHuevos=teclado.nextInt();
         nCapacidad=teclado.nextInt();
               if(nHuevos == 0 && nCapacidad == 0 ) {
                    break;
         }
         while(nHuevos > 0){
         
           nHuevos= nHuevos - nCapacidad;
         
           nRondas++;
         }
         minutos = nRondas * 10;
         System.out.println(minutos);
         nRondas =0;
      }  
    }        
}