package arrays.Ecuaciones14;

import java.util.Random;

/**
 *
 * @author Ulises III
 */
public class main {
    public static void main(String[] args) {
                                              // a b c
        Ecuaciones segundoGrado = new Ecuaciones(0,0,0); //
        Random aleatorio = new Random();
        int a;
        int b;
        int c;
        Ecuaciones segundoG[] = new Ecuaciones[5];
        //añadir al array de ecuaciones
        for (int i = 0; i < segundoG.length; i++) {
            a= (int)aleatorio.nextInt(16)-5;
            b=(int)aleatorio.nextInt(5)+1;
            c= (int)aleatorio.nextInt(100) +1;
            
            segundoG[i] = new Ecuaciones(a,b,c);
            //
             System.out.println("______" + i +"_____");
            System.out.println("Cociente a:"+a);
            System.out.println("Cociente b:"+b);
            System.out.println("Cociente c:"+c);
            System.out.println("___________");
            
            //System.out.println("Solucion + "+segundoG[i].obtenerSolucion1());
             //System.out.println("Solucion - "+segundoG[i].obtenerSolucion2());
             System.out.println("Ecuaciones generadas hasta obtener una con soluciones: " + segundoG[i].averiguar());
             System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
             
         
            /**Lo que me queda : 
             * Escribir también cuántas ecuaciones se generaron hasta dar con una válida para cada
                elemento del vecto
             * **/
        }
    }
}
