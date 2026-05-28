package OrdenacionColecciones13.Vehiculo;

/**
 * Ejercicio 13 Coche
 *
 * @author Ulises III
 */
public class Coche implements Comparable<Coche> {

    private int velocidad;
    private int marcha;

    public Coche() {
        velocidad = 0;
        marcha = 0;
    }

    public Coche(int velocidad, int marcha) {
        this.velocidad = velocidad;
        this.marcha = marcha;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void acelera(int valor) {
        velocidad += valor;
    }

    public void frena(int valor) {
        velocidad -= valor;
    }

    public void subeMarcha() {
        if (marcha != 6) {
            marcha++;
        }
    }

    public void reduceMarcha() {
        if (marcha != 0) {
            marcha--;
        }
    }

    @Override
    public int compareTo(Coche c) {
        int resultado;
        if (this.velocidad < c.velocidad) {
            resultado = -1;
        } else if (this.velocidad > c.velocidad) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }
}
