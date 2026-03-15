/**
 *https://aceptaelreto.com/problem/statement.php?id=429
 * @author Ulises III
 */
import java.util.Scanner;
public class hangar {
    public static void main(String[] args) {
    Scanner teclado = new Scanner ( System.in);
    // Numero de naves y hangares
    int nNaves;
    int nHangares ;

    boolean esCierto = true;
        while(true){
            
            // numero hangares como casos
         nHangares= teclado.nextInt(); // nCasos  // 1º Entrada
         
            if (nHangares > 0 && nHangares <11) {
                System.out.println("OK");
            }

        if (nHangares == 0) {
            break;
        }
            //Tamaño// Resolucion
                int [] tamañoHangares = new int[nHangares];
                for (int i = 0; i < nHangares; i++) {
                  tamañoHangares[i] = teclado.nextInt(); //2º entrada
                }//////////////////////
                   nNaves = teclado.nextInt();
                   
                      if (nNaves > 0 && nNaves < 200) {
                
                        }
                   
                   
                   
                int [] tamañoNaves = new int [nNaves];
                for (int j = 0; j < nNaves; j++) {
                    tamañoNaves[j] = teclado.nextInt();
                    
                      
                }
                // COMPARAR Y RESOLVER
                for (int i = 0; i < nNaves; i++) {
                
                    
                    for (int j = 0; j < nHangares; j++) {
                        
                        
                          if ( tamañoHangares[j] > tamañoNaves[i]) {
                            esCierto= true;
                            }else{
                            esCierto= false;
                        }
                        
                        
                        
                    }       
            }////////////////////////////////
                if (esCierto=true) {
                System.out.println("SI");
            }else{System.out.println("NO");}
        }
    }
}
