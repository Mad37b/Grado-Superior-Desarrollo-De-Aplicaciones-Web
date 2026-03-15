
package Clases2;

/**
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {

        Alumno nuevo[] = new Alumno[5];

        nuevo[0] =new Alumno("alfredo",5.66);
        nuevo[1] =new Alumno("Jaime",9.66);
        nuevo[2] =new Alumno("Paula",2.16);
        nuevo[3] =new Alumno("Olivia",3.96);
        nuevo[4] =new Alumno("Natalia",5.66);
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        buscarAlumno("Paula", nuevo);
    }

    public static void buscarAlumno(String alumno,Alumno datos[]) {
       
        for (int i = 0; i < datos.length; i++) {
             if (datos[i].getNombre().equalsIgnoreCase(alumno)) {
            System.out.println("Se ha encontrado el alumno" +datos[i].getNombre() + " con nota" + datos[i].getNotaMedia() );
        }else{
            System.out.println("Alumno no encontrado");
        }
        }
       
        
    }

}
