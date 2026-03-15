package tarea06.Drones;

import java.util.Scanner;
import java.util.Random;

/**
 * Ejercicio 03
 *
 * @author Ulises III
 */
public class Dron {

    private int energia;
    private String estado;

    public Dron() {
        this(100, "Activo");
    }

    public Dron(int energia, String estado) {
        this.energia = energia;
        this.estado = estado;
    }

    public int volar() {
        Random aleatorio = new Random();
        int nAleatorio = aleatorio.nextInt(16) + 10;
        energia = nAleatorio;
        return energia;
    }

    public int recargar() {
        energia = 100;
        return energia;
    }

    public String cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        return estado;
    }

    public void mostrarInfo() {
        System.out.println("Estado del dron");
        System.out.println("Energia :" + energia + " %");
        System.out.println("Estado :" + estado);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dron{" + "energia=" + energia + ", estado=" + estado + '}';
    }

}
