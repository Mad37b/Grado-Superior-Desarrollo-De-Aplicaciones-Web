package ejercicio04;

import ejercicio01_02_03.Hora;

/**
 * Ejercicio04
 *
 * @author Ulises III
 */
public class Llamada extends Hora {

    private String numeroTelefono;
    private Hora comienzoLlamada;
    private Hora finLlamada;

    public Llamada() {
    }

    public Llamada(String numeroTelefono, Hora comienzoLlamada, Hora finLlamada) {
        this.numeroTelefono = numeroTelefono;
        this.comienzoLlamada = new Hora();
        this.finLlamada = new Hora();
    }

    public int duracionLlamada() {
        int segundos = 0;
        int comienzo = comienzoLlamada.getHora() * 3600 + comienzoLlamada.getMinutos() * 60 + comienzoLlamada.getSegundos();
        int fin = finLlamada.getHora() * 3600 + finLlamada.getMinutos() * 60 + finLlamada.getSegundos();
        
        if (comienzo > fin) {

            return -1;
        }
        segundos = fin - comienzo;
        return segundos;
    }
    public int duracion(){
        int total;
        total = (finLlamada.getHora() * 3600 + finLlamada.getMinutos() * 60 + finLlamada.getSegundos()) - (comienzoLlamada.getHora() * 3600 + comienzoLlamada.getMinutos() * 60 + comienzoLlamada.getSegundos());
        if (total < 0) {
             return total = -1;
        }
        return total;
    }
    

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Hora getComienzoLlamada() {
        return comienzoLlamada;
    }

    public void setComienzoLlamada(Hora comienzoLlamada) {
        this.comienzoLlamada = comienzoLlamada;
    }

    public Hora getFinLlamada() {
        return finLlamada;
    }

    public void setFinLlamada(Hora finLlamada) {
        this.finLlamada = finLlamada;
    }

}
