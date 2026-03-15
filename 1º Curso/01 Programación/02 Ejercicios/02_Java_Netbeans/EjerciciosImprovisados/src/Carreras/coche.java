package Carreras;

/**
 * @author Ulises III
 */
public class coche {
    String nombre;
    String dorsal;
    double rueda1 = 0.00;
    double rueda2 = 0.00;
    double rueda3 = 0.00;
    double rueda4 = 0.00;
    double gasolina = 0.00;

    

    
    public coche(String nombre, String dorsal,double gasolina) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.gasolina = gasolina;
    }
    
            public coche(){
    
    this("","",0);
    }
            
   public void consultarCoche(){
      
       System.out.println("Nombre " + nombre  + "Dorsal" + dorsal);
   
   }
    

    
}
