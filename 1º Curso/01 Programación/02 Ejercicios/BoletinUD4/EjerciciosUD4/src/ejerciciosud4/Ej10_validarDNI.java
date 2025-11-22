/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud4;
import java.util.Scanner;
/**
 *
 * @author Ulises III
 */
public class Ej10_validarDNI {
    
    public static void main (String [] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al programa , inserte su dni");
        
       int dni = teclado.nextInt();
       
       int valor = dni % 23 ;
       
        String letra = "";
        
        switch ( valor ){
            
            case 0: 
                System.out.println("T");
            break;
            
              case 1: 
                System.out.println("R");letra = "R";
                  System.out.println(dni );
            break;
            
              case 2:System.out.println("W");letra = "W";break;
              case 3:System.out.println("A");  letra = "A";break;
              case 4:System.out.println("G");letra = "G";break;
              case 5:System.out.println("M");letra = "M";break;
              case 6:System.out.println("Y");letra = "Y";break;
              case 7:System.out.println("F");letra = "F ";break;
              case 8:System.out.println("P");letra = "P ";break;
              case 9:System.out.println("D");letra = "D";break;
              case 10:System.out.println("X");letra = "X";break;
              case 11:System.out.println("B");letra = "B";break;
              case 12:System.out.println("N");letra = "N";break;
              case 13:System.out.println("J");letra = "J";break;
              case 14:System.out.println("Z");letra = "Z";break;
              case 15:System.out.println("S");letra = "S";break;
              case 16:System.out.println("Q");letra = "Q";break;
              case 17:System.out.println("V");letra = "V";break;
              case 18:System.out.println("H");letra = "H";break;
              case 19:System.out.println("L");letra = "L";break;
              case 20:System.out.println("C");letra = "C";break;
              case 21:System.out.println("K");letra = "K";break;
              case 22:System.out.println("E");letra = "E";break;
         
              default:
                  System.out.println("Valor no reconocido");
                  letra="/";
            
            
            
        }
        System.out.println("\n" + "Resultado = "+dni+letra);
        
    }
    
    
    
}
