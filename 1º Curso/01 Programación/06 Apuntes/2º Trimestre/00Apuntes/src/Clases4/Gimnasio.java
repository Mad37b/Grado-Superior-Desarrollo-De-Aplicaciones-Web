package Clases4;

/**
 * Nivel : Intermedio Ejercicio 4
 *
 * @author Ulises III
 */
public class Gimnasio {

    private int contadorSocio;
    private Socio socio[]; // si no lo pongo así no sale en el constructor en INSERT CODE

    public Gimnasio(int contadorSocio, Socio[] socio) {
        this.contadorSocio = contadorSocio;
        this.socio = new Socio[contadorSocio]; // Construimos el objeto con huecos
    }

    public void agregarSocio(Socio nuevoSocio) {

        if (contadorSocio < socio.length) {

            socio[contadorSocio] = nuevoSocio;
            contadorSocio++;
            System.out.println("Socio guardado con exito");
        } else {
            System.err.println("No hay hueco para añadir un nuevo socio");
        }

    }

    public Socio buscarSocio(int numero) {
        for (int i = 0; i < 10; i++) {

            if (socio[i].getNumeroSocio() == numero) {
                return socio[i];
            }

        }

        return null;
    }

    public int obtenerIngresosPorMayores(int edadLimite) {
        int cuotaTotal = 0;

        for (int i = 0; i < socio.length; i++) {

            if (socio[i].getEdad() >= edadLimite) {
                cuotaTotal += socio[i].getCuotaMensual();

            }

        }
        return cuotaTotal;
    }

    public int getContadorSocio() {
        return contadorSocio;
    }

    public void setContadorSocio(int contadorSocio) {
        this.contadorSocio = contadorSocio;
    }

    public Socio[] getSocio() {
        return socio;
    }

    public void setSocio(Socio[] socio) {
        this.socio = socio;
    }

    public void visualizar() {
        for (int i = 0; i < socio.length; i++) {
            System.out.println("Nombre:" + socio[i].getNombre());
            System.out.println("Nombre:" + socio[i].getEdad());
            System.out.println("Nombre:" + socio[i].getCuotaMensual());
            System.out.println("Nombre:" + socio[i].getNombre());
        }

    }

    @Override
    public String toString() {
        return "Gimnasio{" + "contadorSocio=" + contadorSocio + ", socio=" + socio + '}';
    }

}
