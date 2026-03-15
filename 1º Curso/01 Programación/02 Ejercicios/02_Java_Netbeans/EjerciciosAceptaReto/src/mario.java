
/**
 *enlace : https://aceptaelreto.com/problem/statement.php?id=158
 * @author Ulises III
 */
import java.util.Scanner;
public class mario {
    public static void main(String[] args) {
          Scanner teclado = new Scanner (System.in);
          int casos=teclado.nextInt();
          int contador = 0;
          int altura;
          int muros ;
         // salida
          int subida=0;
          int bajada=0;
         
         // subir para arriba y para abajo 
 
             for (int i = 0; i < casos; i++){ // numero de casos
                 System.out.println("anado Muro");
                 muros= teclado.nextInt(); // numeros de  alturas que voy a leer
                
                  int arrayAlturas [] = new int[muros]; // duda : 
                 for (int j = 0; j <= muros; j++) {
                     //System.out.print("resultado array:");
                     altura= teclado.nextInt(); // pido la altura de los muros
                     arrayAlturas[j]=altura;// añado
                     System.out.println("valor array");
                  System.out.print(arrayAlturas[altura]); // resultado de añadir
                 
                 if (i < altura) {
                     
                 }
                 
                 if (i > altura) {
                     
                 }
                 contador++;
                 }
                
             System.out.println(subida +""+bajada);
         }         
    
    }
}