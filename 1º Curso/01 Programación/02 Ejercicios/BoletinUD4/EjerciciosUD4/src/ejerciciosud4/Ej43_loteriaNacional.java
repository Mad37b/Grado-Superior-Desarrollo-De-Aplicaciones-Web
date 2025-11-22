/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Ulises III
 */
public class Ej43_loteriaNacional {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeroLoteria [] = new int [6];
        int complementario;
        int reintegro;
        int numero=0 ;
        int contador = 0;
        int numeroAcertado=  0;
        int numeroErrado = 0;
        // 
        
        int numeroLoteriaGenerado [] = new int [6];
        int numeroAleatorio =(int) (Math.random()*49)+1;
        int complementarioGenerado = (int) (Math.random()*49)+1;
        int reintegroGenerado = (int) (Math.random()*9)+1;
        
        //
        
            System.out.println("Tu numero de loteria");
        for (int i = 0; i < numeroLoteria.length; i++) {
            
             if ( numero >= 0 && numero <= 49 ){
           numero = teclado.nextInt();
           numeroLoteria[i] = numero;
             System.out.println("Numero Generado " + numeroLoteria[i]);
             }else{System.out.println("Los números no son del formato correcto o supera el limite"); }
        }
         System.out.println("Tu numero de complementario");
        complementario = teclado.nextInt();
        
         System.out.println("Tu reintegro");
         reintegro = teclado.nextInt();
        // Número de la loteria generado
        System.out.println(" numero de loteria generado");
        for (int i = 0; i < numeroLoteriaGenerado.length; i++) {
          numeroAleatorio =(int) (Math.random()*49)+1;
            numeroLoteriaGenerado [i] =numeroAleatorio;
            System.out.println("Numero Generado " + numeroLoteriaGenerado[i]);
            
        }
            // comparar dos arrays 
            for (int i = 0; i < 6; i++) {
            contador++;
                if(numeroLoteria[i] == numeroLoteriaGenerado[i]){
                    System.out.println("Indice - "+ contador +"\n" +"El numero introducido es " +  numeroLoteria[i] + " igual " + numeroLoteria[i]);
                    numeroAcertado++;
                    System.out.println("Numeros acertados" + numeroAcertado);
                }else {
                System.out.println("Indice - "+ contador + "El numero introducido " +  numeroLoteria[i] + " igual" + numeroLoteria[i]);
                numeroErrado++;
                    System.out.println("Numeros errados" + numeroErrado);
                }
        }
        // Comparar complementos 
         if (complementario == complementarioGenerado) {
             System.out.println("El numero complementario a sido " + complementario + " es igual a " + complementarioGenerado);
        }else{  System.out.println("El numero complementario no a sido " + complementario + " igual a " + complementarioGenerado);}
         
         if(reintegro == reintegroGenerado){
             System.out.println("El reintegro ha sido " + complementario + " es igual a " + reintegroGenerado);
         }else{System.out.println("El reintegro no ha sido " + complementario + " igual a " + reintegroGenerado);}
           
           
           
           
       
        
        
       
         
         // Resultado 
         
         for (int i = 0; i < numeroLoteria.length; i++) {
             System.out.print("" + numeroLoteria[i]+ " - ");
                    
        }
         System.out.println(" ");
            for (int i = 0; i < numeroLoteriaGenerado.length; i++) {
             System.out.print("" + numeroLoteriaGenerado[i]+ " - ");
                    
        }
            
        // complemento    
            
        // Reitegro    
        
        
        
        
            
        
    }
    
    
}
