package Clases;

/**
 * Clases 1 
 * @author Ulises III
 */
public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this("", 0.00, 0);// valores por defecto
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int vender(int cantidad) {

        if (stock > 0) {
            int total = stock - cantidad;
            setStock(total); // llamo al metodo del tirón siendo void
        } else {

            System.err.println("No hay más stock");
        }

        return this.stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
