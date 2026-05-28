package Prueba;

/**
 *
 * @author Ulises III
 */
public class main {
    public static void main(String[] args) {
        Loteria premio = new Loteria();
        int cupon[] = premio.generarCupon();
        
        for (int i = 0; i < 6; i++) {
           System.out.print(cupon[i] + ","); 
            
        }
        
        System.out.println(premio.getCupon());
    }
}
