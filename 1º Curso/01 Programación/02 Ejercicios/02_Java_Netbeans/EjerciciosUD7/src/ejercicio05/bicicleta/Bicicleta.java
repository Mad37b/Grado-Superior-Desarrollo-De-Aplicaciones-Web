package ejercicio05.bicicleta;

/**
 * Ejercicio 6
 * @author Ulises III
 */
public class Bicicleta {
    
    private int tamanoRueda;
    private int velocidad;
    private int numPlatos;
    private int numPinones;
    
    public Bicicleta(){}

    public Bicicleta(int tamanoRueda, int velocidad, int numPlatos, int numPinones) {
        this.tamanoRueda = tamanoRueda;
        this.velocidad = velocidad;
        this.numPlatos = numPlatos;
        this.numPinones = numPinones;
    }
   
    public int getTamanoRueda() {
        return tamanoRueda;
    }

    public void setTamanoRueda(int tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public int getNumPinones() {
        return numPinones;
    }

    public void setNumPinones(int numPinones) {
        this.numPinones = numPinones;
    }

}
