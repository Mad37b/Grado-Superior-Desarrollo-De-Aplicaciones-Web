package OrdenacionColecciones11.Atleta;

import OrdenacionColecciones.Atleta.*;

/**
 * Ejercicio 10 con interface
 *
 * @author Ulises III
 */
public class Atleta implements Comparable<Atleta> {

    private String nombre;
    private String nif;
    private Integer edad;

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
        return "Atleta" + "nombre= " + nombre + ", nif=" + nif + ", edad=" + edad +"años";
    }
    // comparamos edades y lo ordenamos
    @Override
    public int compareTo(Atleta e1) {
        
        // return Integer.compare(this.edad, nuevo.edad);//si lo quiero al reves es return Integer.compare(nuevo.edad, this.edad);
        return this.edad.compareTo(e1.edad);
    }
/*
La otra forma es con formas no primitivas (String, Integer,...)
public int compareTo(atleta nuevo){
return this.edad.compareTo(nuevo.edad);
}
*/
}
