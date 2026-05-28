package OrdenacionColecciones12.Atleta;

import OrdenacionColecciones11.Atleta.*;
import OrdenacionColecciones.Atleta.*;

/**
 * Ejercicio 10 con interface
 *
 * @author Ulises III
 */
public class Atleta implements Comparable<Atleta> {

    private String nombre;
    private String nif;
    private int edad;
    private double peso;

    public Atleta() {
    }

    public Atleta(String nombre, String nif, int edad, double peso) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
        
       
        return "Atleta"+ " nombre= " + nombre + ", nif=" + nif + ", edad=" + edad + "años "+",Peso =" +String.format("%.2f", peso) + " kg";
    }

    // comparamos edades y lo ordenamos
    @Override
    public int compareTo(Atleta nuevo) {
     
        
        // return Integer.compare(this.edad, nuevo.edad);//si lo quiero al reves es return Integer.compare(nuevo.edad, this.edad);
        return Integer.compare(nuevo.edad,this.edad);// al revés de mayor a menor
    }
    /*
La otra forma es con formas no primitivas (String, Integer,...)
public int compareTo(atleta nuevo){
return this.edad.compareTo(nuevo.edad);
}
     */
}
