

/**
 *
 * @author Ulises III
 */

import java.util.Scanner;

public class precio {
    
    public static void main (String [] arg){
        
        /**
         * Hacer un programa que lea por teclado el precio de un producto y el IVA que se le va a
            aplicar. A continuación, el programa escribirá el IVA y el precio final del producto. 
            * 
            **/
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Bienvenido al programa de productos e IVA"+ "\n" + "Introduzca un valor del producto");
        
        double valorProducto = teclado.nextDouble();
        System.out.println("Ahora el valor del iva");
        double valorIva = teclado.nextDouble();
        
        // hacer las operaciones 
        //calcula el iva
        double ivaCalculado = valorProducto * (valorIva / 100);
        double ivaTotal = valorIva / 100 ;
        double precioTotal = ivaCalculado + valorProducto;
        System.out.println("iva " + ivaTotal +  "%");
        System.out.println("iva calculado = " + ivaCalculado);
        System.out.println("El valor del precio con iva a sido " + precioTotal +" Euros");
        
        // calcular el valor añadido que se consigue con el iva 
    }
    
    
}
