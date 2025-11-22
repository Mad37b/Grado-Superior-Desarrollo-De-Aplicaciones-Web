package ejerciciosud4;
import java.util.*;
import java.time.*;

/**
 * Apartado 41
 * @author Ulises III
 */
public class Ej41_FechaB {
    
    public static void main ( String [] arg){
        // variables
        Scanner teclado = new Scanner (System.in);
        boolean fechaValida = true;
        String fecha = teclado.nextLine();

       // rompemos la cadena para dia
        
        String diaS=  fecha.substring(0, 2); // obtengo 2 caracteres
        String espaciado1 = fecha.substring(2,3); // Espaciado
        String mesS= fecha.substring(3,5); 
        String espaciado2 =fecha.substring(5,6);
        String añoS = fecha.substring(6,10); // está bien
        
        //2. Validar el formato
        
            for (int i = 0; i < diaS.length(); i++) {
           Character.isDigit(diaS.charAt(i));  // evita letras en la fecha, solo es util en 
               if (!Character.isDigit(diaS.charAt(i))) {
                    fechaValida = false;
                }
           
        }
           for (int i = 0; i < mesS.length(); i++) {
           Character.isDigit(mesS.charAt(i));  // evita letras en la fecha, solo es util en 
            if (!Character.isDigit(mesS.charAt(i))) {
                    fechaValida = false;
                }
        }
        for (int i = 0; i < añoS.length(); i++) {
          Character.isDigit(añoS.charAt(i));  // evita letras en la fecha, solo es util en 
        if (!Character.isDigit(añoS.charAt(i))) {
          fechaValida = false;
         }
        }
       // 3. Luego de comprobar linea por linea si son digitos los caracteres , lo pasamos a int  y verificamos los numeros
        
        int dia = Integer.parseInt(diaS);
        int mes= Integer.parseInt(mesS);
        int año = Integer.parseInt(añoS);
        // Verifica numero formato
        
           // idea para verificar  : si esta cadena partida es mayor que 1 o menor que 31
        
        // 4. Verifica la numeración de la fecha
         // Verifica espacado por / o - 
        if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/' && dia >=1 && dia <= 31 && mes >=1 && mes <= 12 && año >=1900 && año <= 2099 ) {
            System.out.println("formato válido");
            System.out.println("dia =" + diaS +"espaciado 1 =" + espaciado1+"mes =" + mesS +"espaciado 2 =" + espaciado2 +"ano =" + añoS);
        }
        
        if (fecha.charAt(2) == '-' && fecha.charAt(5) == '-' && dia >=1 && dia <= 31 && mes >=1 && mes <= 12 && año >=1900 && año <= 2099) {
              System.out.println("formato válido");
              System.out.println("dia =" + diaS +"espaciado 1 =" + espaciado1+"mes =" + mesS +"espaciado 2 =" + espaciado2 +"ano =" + añoS);
        }
        
    } 
}
