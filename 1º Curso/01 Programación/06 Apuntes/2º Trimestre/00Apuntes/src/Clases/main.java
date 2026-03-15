package Clases;

/**
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Producto array[] = new Producto[3];
        
        array[0] = new Producto("limon", 0.40, 5);
        array[1] = new Producto("manzana", 0.60, 6);
        array[2] = new Producto("kiwi", 0.80, 3);
        Producto max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.getPrecio() < array[0].getPrecio()) {
            } else {
                max = array[i];
            }
        }
        System.out.println("El valor maximo a sido --> " + max.getPrecio());
    }
}
