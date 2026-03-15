package ejercicioArbolUD3;
/**
 *
 * @author Ulises III
 */
import java.util.Scanner;
public class Ej02Arbol {

 
    public static void main(String[] args) {
        Scanner teclado  = new Scanner (System.in);
        //
       
        System.out.println("Datos Del arbol por el Constructor:");
        System.out.println("");
        Ej01Arbol manzano = new Ej01Arbol("Manzano",3.5,8,"caduca",true);
        manzano.visualizar();
        manzano.setEsFrutal(false);
        manzano.visualizar();
        // por consola
        Ej01Arbol roble = new  Ej01Arbol ();
        
        // 
        System.out.println("");
        System.out.println("Introduce los datos Ahora por consola");
        //por consola 
        System.out.print("Especie:");
        roble.setEspecie( teclado.next());
        System.out.print("Altura:");
        roble.setAltura(teclado.nextDouble());
        System.out.print("Edad:");
        roble.setEdad(teclado.nextInt());
        System.out.print("Tipo de hoja:");
        roble.setTipoHoja(teclado.next());
        System.out.print("Es frutal? :");
        roble.setEsFrutal(teclado.nextBoolean());
      
        //Visualizar
        roble.visualizar();
        
    }
}