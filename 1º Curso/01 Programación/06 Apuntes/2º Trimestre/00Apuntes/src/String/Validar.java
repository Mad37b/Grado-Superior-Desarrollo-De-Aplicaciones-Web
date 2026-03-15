package String;
/**
 *
 * @author Ulises III
 */
public class Validar {

    private String nombre;
    private String contraseña;
    private Validar cuenta = new Validar();

    public Validar() {
        this("", "");
    }

    public Validar(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String validarContraseña(String pass) {

        if (pass.length() > 7 && pass.matches(".*\\d{1}.*") && !pass.contains(" ") && Character.isUpperCase(pass.charAt(0))) {
            System.out.print("Contraseña válida: " + pass);
            System.out.println(" ");
            this.contraseña = pass;
        } else {
            System.out.println("Contraseña no válida " + pass);
        }
        
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
