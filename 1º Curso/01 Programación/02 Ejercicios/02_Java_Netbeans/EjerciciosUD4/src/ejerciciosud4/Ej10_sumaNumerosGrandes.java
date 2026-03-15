package ejerciciosud4;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Ej10_sumaNumerosGrandes {
 // Ejercicio 10   
    /**
     * Hacer un programa que pida por teclado dos números y que calcule y escriba su suma solamente si los dos
        son pares y el primero es menor que cincuenta y el segundo está dentro del intervalo cerrado 100-500. En
        el caso de que no se cumplan las condiciones, en vez de la suma visualizar un mensaje de error.
     **/
    public static void main ( String [] arg){
    Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al programa , introduce un valor");
    int valor1 = teclado.nextInt();
    
    while( valor1 <= 50){
    System.out.println("el valor es menor a 50, introduce un valor");
    valor1 = teclado.nextInt();
    
    }
    
      if (valor1 % 2 ==0  ){
        System.out.println("el valor1 es par = "+ valor1);   
      
     
    }else{
         System.out.println("el valor2 es impar");
     }
    
    
    System.out.println("Perfecto , introduce el segundo valor");
    int valor2 = teclado.nextInt();
    
    while ( valor2 <= 100 && valor1 >=500){
        
        System.out.println("El valor debe de estar entre 100 y 500" + valor2);
        
    }
     if (valor2 % 2 ==0  ){
        System.out.println("el valor2 es par = "+ valor2);   
      
     
    }else{
         System.out.println("el valor2 es impar");
     }
     
        System.out.println("Perfecto vamos a sumar los numeros");
        System.out.println("test"+ valor1 + " - " + valor2);
     if ( valor1 >=50 && (valor2 >=100 || valor2 >= 500)){
         
        int total = valor1 + valor2 ;
         System.out.println(" El valor total de valor1 =" + valor1 + " y el valor 2 =" +valor2 +" es =" + total);
     }else{ 
         
         System.out.println(" El valor 1 y 2 no se puede sumar , por favor introduzca valores entre mas validos");   
     }
     
     
        
    }
    
}
