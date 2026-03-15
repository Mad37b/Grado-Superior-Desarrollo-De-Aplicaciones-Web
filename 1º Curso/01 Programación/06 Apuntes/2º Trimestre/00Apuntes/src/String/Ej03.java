package String;

/**
 *
 * @author Ulises III
 */
public class Ej03 {

    public static void main(String[] args) {

        String archivo = "Jabón de manos, 3, 1.50, Fragancia floral";
        String partes[] = archivo.split(","); // podemos separar por espacios " " o cualquier caracter que separe un valor de otro
        String nombre=partes[0].trim();     // Nos aseguramos que no haya espacios con trim()
        int unidades = Integer.parseInt(partes[1].trim());
        double precio = Double.parseDouble(partes[2].trim());
        String tipo=partes[3].trim();

        double total = precio * unidades;
        System.out.println("Nombre:" + nombre + " Unidad:" + unidades + " Tipos " + tipo + " Precio:" + precio  + " Total = " + total);
    }

}
