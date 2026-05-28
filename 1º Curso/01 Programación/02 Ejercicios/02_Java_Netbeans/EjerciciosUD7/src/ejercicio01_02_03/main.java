package ejercicio01_02_03;

/**
 * Ejercicio 03
 *
 * @author Ulises III
 */
public class main {

    public static void main(String[] args) {

        Hora nueva = new Hora();
        HoraPlus nuevaPlus = new HoraPlus(9, 66, 50, 120);
        System.out.println("Nueva hora ");
        System.out.println(nueva.visualizarHora());
        System.out.println("Nueva hora Plus ");
        System.out.println(nuevaPlus.visualizarHora());
        System.out.println("Nueva hora Plus asignación ");
        System.out.println();
        nuevaPlus.setCentesima(200);
        nuevaPlus.setSegundos(90);
        nuevaPlus.setMinutos(55);
        nuevaPlus.setHora(6);

        System.out.println(nuevaPlus.visualizarHora());
    }

}
