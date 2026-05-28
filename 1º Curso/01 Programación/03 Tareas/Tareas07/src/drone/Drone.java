package drone;

/**
 *
 * @author Ulises III
 */
public class Drone {

    private int peso;
    private int autonomia;
    private int velocidadMaxima;
    private int numMotores;

    public Drone() {
    }

    public Drone(int peso, int autonomia, int velocidadMaxima, int numMotores) {
        this.peso = peso;
        this.autonomia = autonomia;
        this.velocidadMaxima = velocidadMaxima;
        this.numMotores = numMotores;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

}
