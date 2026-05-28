package exameneva3;

/**
 * Ejercicio 1
 *
 * @author dawdi : Miguel Ángel Domínguez Llorente
 */
public class Seta {

    private String nombre;
    private String especie;
    private double peso;

    public Seta() {}

    public Seta(String nombre, String especie, double peso) {

        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;

        if (peso <= 0) { // si es menor o igual que cero , se le da estos valores 

            this.nombre = "Error";
            this.especie = "Desconocida";
            this.peso = 0;

        } 

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
