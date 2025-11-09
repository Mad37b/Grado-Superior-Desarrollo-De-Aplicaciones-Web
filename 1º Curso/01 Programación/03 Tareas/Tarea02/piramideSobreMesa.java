import java.util.Scanner;

public class piramideSobreMesa {
    public static void main(String[] args) {        
        Scanner teclado = new Scanner (System.in);
        int numero;
        while((numero = teclado.nextInt()) !=0){
        int formula= (3 * (numero * (numero + 1)))/2;
            System.out.println(formula);    
        }
    }
}