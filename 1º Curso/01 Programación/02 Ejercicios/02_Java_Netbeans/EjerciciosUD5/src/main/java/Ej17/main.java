
package Ej17;

/**
 *
 * @author Ulises III
 */
public class main {
    
    public static void main(String[] args) {
          System.out.println("Clase Hora");
        //Clase Hora
        Hora inicio= new Hora (44,44,12); // Establezco la primera hora
        Hora fin = new Hora (02,55,33); // Establezco la segunda hora     
        
        //1º Establecer la hora
        inicio.modificarHoras(44, 02, 55);
        fin.modificarHoras(14, 22, 04);
        inicio.visualizar();
        inicio.getHora();
        fin.visualizar();
        // 2º Verificar formato 
       
        
        // Clase Llamada
       
        // 3º 
        System.out.println("Clase Llamada :");
        Llamada Agente = new Llamada ("242344123",inicio,fin);
        System.out.print("Hora Comienzo:");
        Agente.escribirHoraComienzo();
        System.out.print("Hora Final:");
        Agente.escribirHoraFinal();
        System.out.println("#Visualizar");
        Agente.visualizar();
        System.out.print("duracion:");
        System.out.println(Agente.duracionLlamada() + " segundos");
    }
    
}
