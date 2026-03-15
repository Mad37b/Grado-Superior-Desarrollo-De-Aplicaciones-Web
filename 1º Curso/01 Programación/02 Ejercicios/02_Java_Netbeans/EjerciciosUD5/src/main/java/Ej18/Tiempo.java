package Ej18;

/**
 *
 * @author Ulises III
 */
public class Tiempo {
    int minutos;
    int segundos;

    public Tiempo() {
        this(0,0);
    }
    public Tiempo(int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
        System.out.println(minutos +":"+segundos);
        
       
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return  minutos +" minutos,"+ segundos + " segundos" ;
    }
}
