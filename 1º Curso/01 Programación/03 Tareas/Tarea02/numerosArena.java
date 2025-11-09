import java.util.Scanner;

public class numerosArena {  
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero ;
        while((numero = teclado.nextInt()) != 0 ){
            for (int i = 0; i < numero; i++) {
                System.out.print("1");
            }
            System.out.println();
        }       
    }
}