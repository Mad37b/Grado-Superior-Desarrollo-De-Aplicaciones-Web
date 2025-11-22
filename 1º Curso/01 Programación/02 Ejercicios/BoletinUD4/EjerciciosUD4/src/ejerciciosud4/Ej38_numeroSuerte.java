/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 * Apartado 38 : Numero de la suerte por la fecha de nacimiento
 * @author Ulises III
 */
public class Ej38_numeroSuerte {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año ;
        int mes;
        int dia ;
        // conseguimos los datos
        System.out.println("Bienvenido al programa , vamos a averiguar tu numero de la suerte " + "\n" + "Introduce tu dia de nacimiento");
        dia = teclado.nextInt();
        System.out.println("Ahora introduce el mes de nacimiento");
        mes = teclado.nextInt();
        System.out.println("Ahora por ultimo introduce tu año de nacimiento");
        año = teclado.nextInt();
        System.out.println(" Perfecto tu fecha a sido "+ dia +" - "+ mes + año);
        
        System.out.println(" Vamos a calcular tu numero de la suerte espera ");
        
        String textoDia = String.valueOf(dia);
       
        
           int total = dia+mes+año;
           
           // convertimos el total en string
            String texto =String.valueOf(total);
           
            int longitud = texto.length();
            int parte = longitud / 4;
            
            
         
            // texto partido
            String prueba =  texto.substring(0,1); // del 0 al 3
            String prueba2 =  texto.substring(1,2); // del 0 al 3
             String prueba3 = texto.substring(2,3); // del 0 al 3
             String prueba4 = texto.substring(3,4); // del 0 al 3
            System.out.println("prueba = "+ prueba +"-"+ prueba2 +"-"+ prueba3 +"-"+ prueba4 );
               // texto total
            System.out.println("prueba 2 "+ texto);
        
        
        int numero= Integer.parseInt(prueba);
        int numero2=Integer.parseInt(prueba2);
        int numero3 = Integer.parseInt(prueba3);
        int numero4 = Integer.parseInt(prueba4);
        
        System.out.println("Prueba numeros separados :" + numero+" - " + numero2+" - "+numero3+" - "+numero4);
        
        int sumaMagica = numero+numero2+numero3+numero4;
        
        // Ahora partimos el nuevo numero
        
        String textoMagico = String.valueOf(sumaMagica);
        
        
        
        int longitudMagica =textoMagico.length() ;
        int partir2 = longitudMagica / 2; // según las lineas que tenga
        
        String textoP = textoMagico.substring(0,1);
        //String textoP2 = textoMagico.substring(1,2);
        
        int numero5 = Integer.parseInt(textoP);
        //int numero6 = Integer.parseInt(textoP2);
        
        int sumaMagica2 = numero5;
                
        
        
        
        
        
        System.out.println(" Perfecto , tu numero del a suerte a sido " + sumaMagica2);
        
        System.out.println("Vaya :( , tu numero de la suerte no ha sido calculado correctamente");
    }
}
