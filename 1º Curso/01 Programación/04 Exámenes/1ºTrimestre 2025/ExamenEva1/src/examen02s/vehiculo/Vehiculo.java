package examen02s.vehiculo;

/**
 *  Examen simulacro
 * @author Ulises III
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private double kilometros;

    public Vehiculo(String matricula, String marca, double kilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Veh\u00edculo{" + "matricula=" + matricula + ", marca=" + marca + ", kilometros=" + kilometros + '}';
    }
    
    
}
