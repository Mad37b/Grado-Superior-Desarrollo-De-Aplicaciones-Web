package Clases4;

/**
 * Nivel : Intermedio Ejercicio 4
 * @author Ulises III
 */
public class Socio {
    
    
    private int numeroSocio;
    private String nombre;
    private int edad ;
    private double cuotaMensual;

    public Socio() {
        this(0,"",0,0.0);
    }

    public Socio(int numeroSocio, String nombre, int edad, double cuotaMensual) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.edad = edad;
        this.cuotaMensual = cuotaMensual;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    
    
}
