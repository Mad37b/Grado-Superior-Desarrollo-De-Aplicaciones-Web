package ejercicio05.mountainBike;

import ejercicio05.bicicleta.Bicicleta;

/**
 * Ejercicio 7
 *
 * @author Ulises III
 */
public class mountainBike extends Bicicleta {

    private int numDientes[] = new int[15];
    private int plato; // Entre 1 y 3
    private int pinon; // Entre 1 y 12

    public mountainBike() {
    }

    public mountainBike(int tamanoRueda, int velocidad, int numPlatos, int numPinones,int plato, int pinon ) {
        super(tamanoRueda, velocidad, numPlatos, numPinones);
        this.plato = plato;
        this.pinon = pinon;
        
        setNumDientes(numDientes);
        setNumPinones(numPinones);
        setNumPlatos(numPlatos);
    }

    public void visualizarMountainBike() {
        // Bicicleta
        //tamanoRueda cadencia
        System.out.println(getTamanoRueda());
        // Velocidad
        System.out.println(getVelocidad());
        numPlatos:
        System.out.println(getNumPlatos());
        numPinones:
        System.out.println(getNumPinones());

        // MountainBike
        
        // numDientes:
        for (int i = 0; i < 15; i++) {
            System.out.print("numDientes:" + this.numDientes[i]);
        }
        System.out.println(" ");
        //plato:
        System.out.println("plato:"+plato);
        
        pinon:
        System.out.println("pinon"+pinon);
        
    
    }

    public double cmAvanza() {
         // pulgada = 2,54 cm 
        double calculo = 

        return calculo;
    }

    public int[] getNumDientes() {
        return numDientes;
    }

    public void setNumDientes(int[] numDientes) {
        this.numDientes = numDientes;
    }

    public int getPlato() {
        return plato;
    }

    public void setPlato(int plato) {
        this.plato = plato;
    }

    public int getPinon() {
        return pinon;
    }

    public void setPinon(int pinon) {
        this.pinon = pinon;
    }

    @Override
    public String toString() {
        return "mountainBike{" + "numDientes=" + numDientes + ", plato=" + plato + ", pinon=" + pinon + '}';
    }

}
