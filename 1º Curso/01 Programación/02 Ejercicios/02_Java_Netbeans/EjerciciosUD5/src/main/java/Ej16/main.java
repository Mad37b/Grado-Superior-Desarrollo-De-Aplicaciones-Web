package Ej16;

/**
 *
 * @author Ulises III
 */
public class main {
    
    public static void main(String[] args) {
        Fecha calendario = new Fecha ();
        Fecha calendario2 = new Fecha ();
        System.out.println(calendario.getDia());
         System.out.println(calendario.getMes());
          System.out.println(calendario.getAnno());
          //Asignar nueva fecha
          
          calendario.asignar(9, 5, 2015);
            calendario.imprimir();
            
            // imprimir nueva fecha con argumentos
            
            calendario2.imprimir(22, 9, 2021);
            
            // incrementar
            
            //calendario.incrementar(90);
            System.out.println(calendario.incrementar(3900));
            // 45 ,37 , 2015
            // 45 ,1 2018
            // 14 ,
            // get fecha 
            
            System.out.println(calendario.getFecha());
    } 
}