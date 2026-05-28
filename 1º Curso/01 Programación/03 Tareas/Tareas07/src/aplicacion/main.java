package aplicacion;

import droneCarrera.DroneCarrera;

/**
 * Ejercicio 3
 * @author Ulises III
 */
public class main {
       public static void main(String[] args) {

        //int potencias[] = {130, 135, 120, 133};
         int potencias[] = {120, 125, 118, 122};
        //DroneCarrera nuevo = new DroneCarrera(potencias, 3, "acrobatico", 950, 18, 120, 4); Test
        DroneCarrera nuevo = new DroneCarrera(potencias, 4, "asistido", 950, 20, 100, 2);
        //nuevo.velocidadEstimada();
    
        nuevo.velocidadEstimada();

        nuevo.visualizarDroneCarrera();

    }
 
}
