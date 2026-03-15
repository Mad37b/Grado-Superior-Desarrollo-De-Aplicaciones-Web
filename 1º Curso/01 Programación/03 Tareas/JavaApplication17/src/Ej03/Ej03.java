package Ej03;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);
    int perimetro =0;
    int area =0;
    int suma = 0;
    int escudos=0;
       
        while(true){
            int legionarios =teclado.nextInt();
            if (legionarios == 0) {
                break;
            }else{
                escudos = 0;
                while (legionarios > 0) {

                    int lado = (int) Math.sqrt(legionarios);
                    area=lado*lado; 
                    perimetro = 4 *lado;
                    escudos = escudos+(area + perimetro);
                    legionarios -=area;
                }             
            }
              System.out.println(escudos);
        }
    }
}