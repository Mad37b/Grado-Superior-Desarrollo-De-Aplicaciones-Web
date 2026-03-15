import java.util.Scanner;
/**
 *Enlace:https://aceptaelreto.com/problem/statement.php?id=140
 * @author Ulises III
 */
public class E140Suma {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeros;
    int total=0;
    String texto="";
    int suma=0;
    int veces=0;
      
        while(true){
         numeros = teclado.nextInt();
         texto = texto.valueOf(numeros);
                if (numeros <= -1) {
                    break;
                }
                String salida="";
                    for (int i = 0; i < texto.length(); i++) {
              
                        char prueba = texto.charAt(i);
                        veces++;
                        int digito = prueba - '0';
                         suma = suma + digito ;
                         total = suma;
                         salida += prueba+"+" ;
           }     
                    
                        salida = salida.substring(0,salida.length()-1);
                        salida=salida+"="+total;
                        System.out.println("Prueba");
                        System.out.println(salida);
                        suma = 0 ; 
       }
    }
}
