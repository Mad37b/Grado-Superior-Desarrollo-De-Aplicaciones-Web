package Ej04;
import java.util.Scanner;
/**
 * https://aceptaelreto.com/problem/statement.php?id=462
 * @author Ulises III
 */
public class Ej04 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int total ;
    int dias;
    int resto;
        int casos = teclado.nextInt();
        for (int i = 0; i < casos; i++) {

         int veces = teclado.nextInt();

           teclado.nextLine();
           String tiempo = teclado.nextLine();
            int horas = Integer.parseInt(tiempo.substring(0,2));
               int minutos = Integer.parseInt(tiempo.substring(3,5));
                  int segundos = Integer.parseInt(tiempo.substring(6,8));

        total = (horas *3600)+( minutos *60) + segundos;
        int segundosTotales = veces*total;

        dias = segundosTotales/86400;
        resto = segundosTotales%86400;
        horas = resto/3600;
        resto = resto%3600;
        minutos= resto / 60;
        resto = resto%60;
        segundos = resto;
        System.out.printf("%d %02d:%02d:%02d\n", dias, horas, minutos, segundos);
    
        }
    }
}