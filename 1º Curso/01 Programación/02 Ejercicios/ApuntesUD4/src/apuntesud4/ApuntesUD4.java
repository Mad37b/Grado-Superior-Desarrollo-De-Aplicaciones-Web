/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesud4;

/**
 *
 * @author Ulises III
 */
public class ApuntesUD4 {

 public static void main (String[] arg){
        
        
        // Apuntes de la Unidad 4 : Uso de estructuras de control.
        
        /**
         * 
         * 1.¿Qué es una estructura de control ?
         * 
         * Las estructuras de control son un conjunto de reglas que hacen posible la gestión de flujo de ejecución de los programas 
         * y permite que el código tome deciosiones, repita acciones
         * 
         * 
         * 2. Tipos 
         * 
         *      - Estructuras de control condicionales - If y Swicht
         *              - Estructuras de control múltiples If 
         * 
         *      - Estructuras de control en bucle
         *          - for y for-each
         * 
         *          - while
         * 
         *          - do-while
         * 
         * 
         * 
         **/
        
        int expresion1 = 0;
        
        int expresion2 = 4;
        
        
       // 1. Condicionales - if
        
        if(expresion1 < expresion2){
            System.out.println("entro en el primer if");
        }
        
        //
        
        if (expresion1 < expresion2){
            
            System.out.println("entro en el segundo if");
            
            
        }else{
            System.out.println("no entrn en el segundo if");   
        }
        
        
        // 2. Condionales múltiples
        
        if(expresion1 < expresion2){
            
        }else if(expresion1 == expresion2){
        
        }else if( expresion1 != expresion2){
        
        }else { }
        
    
   
        
        
        final int valores=2; // los switch solo aceptan en los cases , valores definitivos , no dinámicos
        
        // 3. Condicionales - Swicht 
        // con Swicht , evitamos el efecto del 'código espaguetti', que se refiere anidar tantos if dentro de otro
        
      
        
        // 2º forma de hacerlo 
        
           switch (expresion1) {
            case 0:
                System.out.println("Sol");
                break;
                
            case 1:
                System.out.println("Nubes");
                break;
            default:
                
                throw new AssertionError();
        }
        // 4. For 
         int array [] = new int [3];
         
        for ( int i = 0; i< 10 ;i++){ 
            
         // escribimos la sentencia    
        }
            
        
        for ( int i = 0 ; i < array.length ; i++){
            // escribimos la sentencia
        }
        
        
        // 4.1 For-each
       
        for ( int nombre : array){
            
            System.out.println("valor del for-each " + nombre + " - ");
        }
        
        // 5. while
        
        while(expresion1<expresion2){
            // escribimos la sentencia
            
            
      
        }
        
        
        do{
            
            // escribimos la sentencia
            
        }while (expresion1<expresion2);
        
        // Sentencias 
        
        // continue: acaba una vuelta o parte de la sentencia del la estructura - 10 %
        
        // break : rompe la sentencia aunque no haya acabado la estructura -50%
        
        // return :  acaba la estructura y el método  - 100%
            // tambien nos puede retornar un valor al final de return | Ejemplo:  return suma; |
            
            
       //4. Excepciones 
       
       try{
           
           // sentencia 
           
       }catch( Exception e){
           
           // sentencia de excepcion
           
       }
       
       
       
       // 5. Documentacion con Javadoc
        
        
    }
    
}
