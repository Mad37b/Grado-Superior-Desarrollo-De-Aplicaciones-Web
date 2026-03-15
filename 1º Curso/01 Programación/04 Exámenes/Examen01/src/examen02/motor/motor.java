package examen02.motor;

/**
 *
 * @author Ulises III
 */
public class motor {

    private int caballos;
    private double consumo;

    public motor() {
    }

    public motor(int caballos, double consumo) {
        this.caballos = caballos;
        this.consumo = consumo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void mostrar() {
        System.out.println("Caballos del coche: " + caballos);
        System.out.println("Consumo del coche: " + consumo);
    }

    public int mejorarPotencia(int potencia) {
        caballos = caballos + potencia;
        return caballos;
    }

    public double empeararConsumo(double extra) {
        consumo = consumo + extra;
        return consumo;
    }
}
