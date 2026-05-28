package examen02.motor;

/**
 *
 * @author Ulises III
 */
public class motorCont {

    private String marca;
    private String modelo;
    private motor motor;

    public motorCont() {
        this.motor = new motor();
    }

    public motorCont(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new motor();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.mostrar();
    }

    public void mejorarCoche() {
        int mejora = motor.getCaballos() + 20;
        double reducir = motor.getConsumo() - 0.5;
        motor.setCaballos(mejora);
        motor.setConsumo(reducir);
        
    }
}
