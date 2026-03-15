package String;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Ej01 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      
      String texto = teclado.nextLine();
      int contador=0;
        int contarA=0;
         int contarE=0;
          int contarI=0;
           int contarO=0;
            int contarU=0;
           
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

              switch(letra){
          
          case 'a':contarA++;break;
            case 'e':contarE++;break;
            case 'i':contarI++;break;
              case '0':contarO++;break;
                case 'u':contarU++;break;
                
      }
        }
       
        if (contarA >= 1 ) {
        System.out.println("he contado "+contarA+" vez"); 
        }else{
        System.out.println("he contado "+contarA+" veces"); 
       
        }
        
        if (contarE >= 1 ) {
        System.out.println("he contado "+contarE+" vez"); 
        }else{
        System.out.println("he contado "+contarE+" veces"); 
       
        }
              
        if (contarI >= 1 ) {
        System.out.println("he contado "+contarI+" vez"); 
        }else{
        System.out.println("he contado "+contarI+" veces"); 
       
        }
                    
        if (contarO >= 1 ) {
        System.out.println("he contado "+contarO+" vez"); 
        }else{
        System.out.println("he contado "+contarO+" veces"); 
       
        }
                          
        if (contarU >= 1 ) {
        System.out.println("he contado "+contarU+" vez"); 
        }else{
        System.out.println("he contado "+contarU+" veces"); 
        }
    }
}  