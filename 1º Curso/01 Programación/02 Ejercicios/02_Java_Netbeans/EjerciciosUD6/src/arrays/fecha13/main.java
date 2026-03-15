package arrays.fecha13;
import java.util.Random;
/**
 * @author Ulises III
 */
public class main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha (1,4,2011);
        Fecha arrayFecha[] =new Fecha[10];
        Random aleatorio = new Random();
        int dia;
        int mes;
        int anno;
        int veces=0;
        // asignar fechas aleatorias
        for (int i = 0; i < arrayFecha.length; i++) {
            dia= (int)aleatorio.nextInt(31-1)+1;
            mes=(int)aleatorio.nextInt(12-1)+1;
            anno = aleatorio.nextInt(8) + 2000;
            arrayFecha[i]=new Fecha(dia,mes,anno); // tengo que tratarlo como objeto , no como una variable
            
        }
        for (int i = 0; i < arrayFecha.length; i++) {
            System.out.println("prueba - " + arrayFecha[i].getFecha());
            veces++;
        }
          
        // añadir 3 días 
        
        for (int i = 0; i < arrayFecha.length; i++) {
            int diaActual = arrayFecha[i].getDia();
            
            int suma = diaActual + 3 ;
            
            arrayFecha[i].setDia(suma);
            
        }
        System.out.println("Aumento de 3 días");
        
           for (int i = 0; i < arrayFecha.length; i++) {
            System.out.println("prueba - " + arrayFecha[i].getFecha());
            veces++;
        }
        
    }
}
