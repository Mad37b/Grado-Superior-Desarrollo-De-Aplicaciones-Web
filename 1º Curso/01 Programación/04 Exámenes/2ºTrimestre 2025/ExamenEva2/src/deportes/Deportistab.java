package deportes;
/**
 * Ejercicio 1 - Clase deportista
 *
 * @author Miguel Ángel
 */
public class Deportistab {

    private String nombre;
    private int edad;
    private double peso; // en kg
    private double altura;  // en metros   
    private int horasEntrenamientoSemanal;

    public Deportistab() {
        
    }

    public Deportistab(String nombre, int edad, double altura, int horasEntrenamientoSemanal) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.horasEntrenamientoSemanal = horasEntrenamientoSemanal;
    }

    public double calcularIndiceRendimiento() { // Establecemos un valor de IR  

        double indiceRendimiento = 0;

        indiceRendimiento = horasEntrenamientoSemanal / (peso * altura);
        //String.format("%d"+"%f0.2");

        return indiceRendimiento;
    }

    public String clasificarRendimiento() {
        double IR = calcularIndiceRendimiento(); // obtenemos el IR  del calculo para poder clasificarlo 
        String medida = ""; 
        if (IR < 0.5) {
            medida = "Bajo";
        } else if (IR > 0.5 && IR < 1) {
            medida = "Medio";
        } else if (IR > 1) {

            medida = "Alto";
        }

        return medida;

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getHorasEntrenamientoSemanal() {
        return horasEntrenamientoSemanal;
    }

    public void setHorasEntrenamientoSemanal(int horasEntrenamientoSemanal) {
        this.horasEntrenamientoSemanal = horasEntrenamientoSemanal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

