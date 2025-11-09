/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Aparttado 1
 * @author Ulises III
 */
import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class AlmacenHora {
    

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa " + "\n" + " introduce la hora");
        Scanner teclado = new Scanner (System.in);
        
        //LocalTime tiempo = LocalTime.now();
                
        String tiempoSeleccionado = teclado.nextLine();
        // formato     
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm"); 
     
        LocalTime horaEstablecida = LocalTime.of(18,0);
        
        // conversion       
        
        LocalTime horaIntroducida = LocalTime.parse(tiempoSeleccionado,formato);
        
        // calculo 
                
        Duration calculo = Duration.between(horaIntroducida, horaEstablecida);
      
        // resultado        
        
        if ( !tiempoSeleccionado.isEmpty()){
                System.out.println("  Queda " +   calculo.toMinutes() + " minutos");   
        }else{
            System.out.println(" la hora no ha sido establecida");   
        }
        
        
    }

}
