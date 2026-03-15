/**
 * enlace:https://aceptaelreto.com/problem/statement.php?id=239
 * @author Ulises III
 */
import java.util.Scanner;
public class reloj {

    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        while(true){
            int dia =teclado.nextInt();
            int emisora = teclado.nextInt(); 
            int tiempo ; 
            
            int dia2;
            int hora;
            int minuto;
            int segundo;
              
            if (dia == 0 && emisora == 0  ) {
                break;
            }
            
            tiempo = 24* dia * 6 * emisora ;
            
            dia2 = tiempo / 86400;
            hora = (tiempo %86400) / 3600;  
            minuto = (tiempo %3600) / 60;
            segundo =  tiempo % 60;
            
            while(segundo > 59){
            segundo= segundo - 60;
            minuto= minuto + 1 ;
            }
            while(minuto > 59){
             minuto = minuto - 60;   
             hora = hora +1;
            }
            while(hora > 23){
             hora = hora - 24;   
             dia2 = dia2 + 1;
            }
           System.out.printf("%d:%02d:%02d:%02d%n", dia2, hora, minuto, segundo);
         
        }   
    }    
}