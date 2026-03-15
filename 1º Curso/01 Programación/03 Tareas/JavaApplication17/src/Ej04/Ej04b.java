package Ej04;
import java.util.Scanner;
/**
 * https://aceptaelreto.com/problem/statement.php?id=462
 * @author Ulises III
 */
public class Ej04b {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    long total ;
    long dias;
    long resto;
    long horas;
    long minutos;
    long segundos;
    long segundosTotales;
    int veces;
    int casos;
    
        casos = teclado.nextInt();
        for (int i = 0; i < casos; i++) {

         veces = teclado.nextInt();

          
           String tiempo = teclado.next();
           horas = Integer.parseInt(tiempo.substring(0,2));
           minutos = Integer.parseInt(tiempo.substring(3,5));
           segundos = Integer.parseInt(tiempo.substring(6,8));

        total = (horas *3600L)+( minutos *60L) + segundos;
        segundosTotales = veces*total;

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