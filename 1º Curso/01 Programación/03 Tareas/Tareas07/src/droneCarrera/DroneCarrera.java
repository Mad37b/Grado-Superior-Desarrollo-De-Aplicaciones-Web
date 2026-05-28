package droneCarrera;

import drone.Drone;

/**
 * Ejercicio 2
 *
 * @author Ulises III
 */
public class DroneCarrera extends Drone {

    private int potenciaMotores[];

    public DroneCarrera(int[] potenciaMotores, int motorSeleccionado, String modoVuelo, int peso, int autonomia, int velocidadMaxima, int numMotores) {
        super(peso, autonomia, velocidadMaxima, numMotores);
        this.potenciaMotores = potenciaMotores;
        this.motorSeleccionado = motorSeleccionado;
        this.modoVuelo = modoVuelo;
    }
    private int motorSeleccionado;
    private String modoVuelo;

    public DroneCarrera() {
    }

    public void visualizarDroneCarrera() {

        System.out.println("Peso: " + getPeso() + " gramos");
        System.out.println("Autonomía:" + getAutonomia());
        System.out.println("Velocidad Máxima:" + getVelocidadMaxima());
        System.out.println("Número de motores:" + getNumMotores());
        System.out.println("Potencia de motores: " );
        for (int i = 0; i < potenciaMotores.length; i++) {
            System.out.println(" - Motor " + (i+1) + " - " + potenciaMotores[i] + " W");
        }

        System.out.println("Motor seleccionado: " + getMotorSeleccionado());
        System.out.println("Modo de vuelo: " + getModoVuelo());
        System.out.println("Velocidad estimada: " + String.format("%.2f", velocidadEstimada()));

    }

    public double velocidadEstimada() {
        double potenciaActiva = 0;
        double promedio = 0;
        double eficiencia = 0;
        double velocidad = 0;
        double peso = getPeso();
        double penalizacion = 0;
       
 
        for (int i = 0; i < potenciaMotores.length; i++) {
            potenciaActiva += potenciaMotores[i];
        }
        promedio = potenciaActiva /(double) potenciaMotores.length;
         penalizacion = 1.0 - Math.min(0.001 * getPeso(), 0.4);
        if (modoVuelo.equalsIgnoreCase("manual")) {
            eficiencia = 0.75;
        } else if (modoVuelo.equalsIgnoreCase("asistido")) {
            eficiencia = 0.85;
        } else if (modoVuelo.equalsIgnoreCase("acrobatico")) {
            eficiencia = 1.00;
        } else {
            eficiencia = 0.70;
        }
       
        velocidad = promedio * eficiencia * penalizacion * 0.1;

        return velocidad;
    }

    public static void main(String[] args) {

        int potencias[] = {130, 135, 120, 133};
        DroneCarrera nuevo = new DroneCarrera(potencias, 3, "acrobatico", 950, 18, 120, 4);
        //nuevo.velocidadEstimada();
    
        nuevo.velocidadEstimada();

        nuevo.visualizarDroneCarrera();

    }

    public int[] getPotenciaMotores() {
        return potenciaMotores;
    }

    public void setPotenciaMotores(int[] potenciaMotores) {
        this.potenciaMotores = potenciaMotores;
    }

    public int getMotorSeleccionado() {
        return motorSeleccionado;
    }

    public void setMotorSeleccionado(int motorSeleccionado) {
        this.motorSeleccionado = motorSeleccionado;
    }

    public String getModoVuelo() {
        return modoVuelo;
    }

    public void setModoVuelo(String modoVuelo) {
        this.modoVuelo = modoVuelo;
    }

}
