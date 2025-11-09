
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ulises III
 */
public class rombo {
    
    public static void main(String[] args) {
    
        // variable asteriscos
                    
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        int distancia = 0;
        int altura;
        System.out.println("Bienvenido al programa , inserte el numero");
       
          
        while (numero > -1){
        
            /**
             * REGLAS PARA QUE EL ROMBO FUNCIONE 
             * 
             * Tenemos que calcular (numero / 2), para poder controlar los espacios y las barras - ( Ascendiente hasta descendente
             * 
             * 
            **/
            
                  // hacer la altura por 2 numero + 1  
             
            if ( numero >= 4 && numero <= 25){ // validación
         
 
                // el primer for imprime los espacios , de las primeras lineas 

                // 1. Filas
                
                 altura = 2 * numero + 1 ; 
                for (int i = 0; i < altura; i++) { // Este hace Como del Eje Y , como la altura , es el que manda 
                            int asteriscos = 0; 
                            int espacio =0;
                            int centro = 0;
                           
                 // el centro depende de la altura // Calculo
                         centro = altura / 2; // centrar

                         distancia = Math.abs(i - centro);
                         
                         asteriscos = altura -2 *distancia; // calcular cuantos asteriscos se ponen

                        espacio = distancia;
                   
                    // 2. Espacios
                    
                    for (int j =0; j < espacio ; j++) {
                      System.out.print(" "); // Aqui da espacios 
                }
                     System.out.print("*");// aqui creo que imprimo todos los astericos 
                     

                    // 3. ----


                    if ( asteriscos== 1){
                        System.out.print(""); // solo uno en el centro
                        
                    }else{
                        System.out.print(""); // pinta la izquierda doblemente si pongo * 
                     

                        for (int s = 0; s < asteriscos-2; s++) {
                            System.out.print("-"); // Rellena el centro
                        }
                         System.out.print("*"); // Cubre la derecha
                         
                    } 

                    System.out.println(); // salto
                    }

            }else{}//PRINCIPAL

             // vuelve a preguntar
            // si el numero esta fuera de rango , pide el numero
            System.out.println("Introduce de nuevo un valor , si es -1 se cierra el programa");
            numero = teclado.nextInt();
            }//fin del while
    }
}

