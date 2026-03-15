package Clases3;

/**
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {
        Producto array[][] = new Producto[3][4];

        array[0][0] = new Producto("", "", 0.00, 0);
        array[0][0] = new Producto("Teclado Mecanico", "Logitech", 89.99, 10);
        array[0][2] = new Producto("Raton Gaming", "Razer", 55.50, 15);

        buscarProducto(array, "Teclado Mecanico"); // aqui se podria poner por teclado 
    }

    public static void buscarProducto(Producto[][] ventas, String nombre) {
        int contadorj = 0;
        boolean esEncontrado = false;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
              
                if (ventas[i][j] != null) {
                    
                    contadorj++;
                      
                    if (ventas[i][j].getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("El producto a sido " + nombre +" con marca "+ ventas[i][j].getMarca() + " en la fila " + i + " en la columna " + contadorj);
                        esEncontrado = true;
                    }

                }

            }
            if (!esEncontrado) {
                System.out.println("No encontrado");
            }
        }

    }
}
