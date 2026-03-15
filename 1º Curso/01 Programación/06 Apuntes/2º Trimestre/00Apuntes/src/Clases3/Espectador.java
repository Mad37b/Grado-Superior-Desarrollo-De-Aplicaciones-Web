package Clases3;

/**
 *
 * @author Ulises III
 */
public class Espectador {

private String nombre;
    private int edad;

    public Espectador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Espectador() {
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
    
}
