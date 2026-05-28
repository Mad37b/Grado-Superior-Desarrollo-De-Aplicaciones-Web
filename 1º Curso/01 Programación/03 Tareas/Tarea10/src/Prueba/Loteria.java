package Prueba;

import java.util.Random;

/**
 *
 * @author Ulises III
 */
public class Loteria {

    Random aleatorio = new Random();
    int cupon[] = new int[8];
    int complementario;
    int reintegro;

    public Loteria() {
    }

    public Loteria(int complementario, int reintegro) {
        this.complementario = complementario;
        this.reintegro = reintegro;
        generarCupon();
    }

    public int[] generarCupon() {

        int numeroAleatorio;
        for (int i = 0; i < cupon.length; i++) {
            numeroAleatorio = aleatorio.nextInt(49) + 1;
            cupon[i] = numeroAleatorio;

        }
        setCupon(cupon);
        return cupon;
    }

    public int[] getCupon() {
        
        
        return cupon;
    }

    public void setCupon(int[] cupon) {
        this.cupon = cupon;
    }

    public int getComplementario() {
        return complementario;
    }

    public void setComplementario(int complementario) {
        this.complementario = complementario;
    }

    public int getReintegro() {
        return reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    @Override
    public String toString() {
        return "Loteria{" + "aleatorio=" + aleatorio + ", cupon=" + cupon + ", complementario=" + complementario + ", reintegro=" + reintegro + '}';
    }

}
