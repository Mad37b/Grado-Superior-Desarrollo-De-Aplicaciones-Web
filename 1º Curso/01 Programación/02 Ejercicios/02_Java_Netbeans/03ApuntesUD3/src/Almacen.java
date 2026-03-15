/**
 *
 * @author Ulises III
 */
public class Almacen {
    
    //variables
    
    int stock;
    int operarios;
    int secciones = 6;
    String tipoPiezas [] = new String [5];
    int capacidad;

    public Almacen(int stock, int operarios, int capacidad) {
        this.stock = stock;
        this.operarios = operarios;
        this.capacidad = capacidad;
    }
    
    
    
    
    // Getter // Devuelve
    public void consulta (){ // Select
    
    String query = "Select * FROM Almacen"; 
    
    }
    // Setter / Establecer
    public int anadirStock (int nStock){ // insert into
        this.stock = stock;
        
        return nStock;
    }
    
    public int actualizarStock( int stock){ // Update
            this.stock = stock;
            
            return stock;
    }
    
    public int borrarStock ( int stock){ // Delete
        System.out.print(" Se ha borrado el stock");
        return stock;
    }

    public int getStock() {
        return stock;
    }

    public int getOperarios() {
        return operarios;
    }

    public int getSecciones() {
        return secciones;
    }

    public String[] getTipoPiezas() {
        return tipoPiezas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setOperarios(int operarios) {
        this.operarios = operarios;
    }

    public void setSecciones(int secciones) {
        this.secciones = secciones;
    }

    public void setTipoPiezas(String[] tipoPiezas) {
        this.tipoPiezas = tipoPiezas;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
