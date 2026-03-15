/**
 *
 * @author Ulises III
 */

public class tienda {
    
    
    public static void main ( String [] arg){
    
    Almacen tienda = new Almacen (0,0,0);
        tienda.setCapacidad(100);
        tienda.setOperarios(6);
        tienda.setStock(60);
        System.out.println("prueba "+ tienda.getCapacidad());
         System.out.println("prueba "+ tienda.getOperarios());
          System.out.println("prueba "+ tienda.getStock());
    
    }
    
    
    
    
    
}
