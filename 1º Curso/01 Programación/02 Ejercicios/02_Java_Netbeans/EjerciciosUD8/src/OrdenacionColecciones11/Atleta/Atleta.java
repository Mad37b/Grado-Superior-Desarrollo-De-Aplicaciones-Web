package OrdenacionColecciones11.Atleta;

import OrdenacionColecciones.Atleta.*;

/**
 * Ejercicio 10
 *
 * @author Ulises III
 */
public class Atleta implements {

    private String nombre;
    private String nif;
    private int edad;

    public Atleta() {
    }

    public Atleta(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    //
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + '}';
    }

}
