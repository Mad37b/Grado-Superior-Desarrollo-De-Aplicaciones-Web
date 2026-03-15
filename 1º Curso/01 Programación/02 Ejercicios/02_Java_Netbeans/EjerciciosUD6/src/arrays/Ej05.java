package arrays;

/**
 *
 * @author Ulises III
 */
public class Ej05 {
    public static void main(String[] args) {
            int[] ventas = new int [5];
            int nMayor;
            int nMenor;
            int menor=0;
            int mayor=0;
            int total=0;
            // asignación por índice
            ventas[0]=10; // valor de la venta , valor de cada indice
            ventas[1]=30;
            ventas[2]=20;
            ventas[3]=50;
            ventas[4]=4;
            
                    
            // asignar el numero Mayor
            
            nMayor =ventas[0]; // apuntado al indice 0
            nMenor = ventas[0]; //
            
        System.out.println("Resultados: ");
            // comparación
            for (int i = 0; i < ventas.length; i++) {
            
                if (ventas[i] > nMayor) {
                    nMayor = ventas[i]; // valor
                    mayor = i; // indice 
                }
                if (ventas[i] < nMenor) {
                    nMenor = ventas[i];
                    menor=i;
                }
                 total += ventas[i];
        }
            //Resultados // indice y valor 
            System.out.println("La tienda que mas vendio fue la " + (mayor + 1) + " con " + nMayor + " €");
           System.out.println("La tienda que menos vendio fue la " + (menor + 1) + " con " + nMenor + " €");
         System.out.println("El total de las ventas es: " + total + " €");
    }
}
