package ejercicio04;

import ejercicio01_02_03.Hora;

/**
 * Ejercicio 05
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Hora comienzo = new Hora(6,3,55);
        Hora fin = new Hora(6,4,1);
              
        Llamada nuevaLlamada = new Llamada();
        nuevaLlamada.setNumeroTelefono("959886645");
        nuevaLlamada.setComienzoLlamada(comienzo);
        nuevaLlamada.setFinLlamada(fin);
        
        
        System.out.println(nuevaLlamada.duracionLlamada() + " segundos");
        
        // Hacer objeto que de -1

    }
}
