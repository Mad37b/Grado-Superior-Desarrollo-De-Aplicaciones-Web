package tarea10;

import java.util.Arrays;
import java.util.Random;

/**
 * Tarea 10
 *
 * @author Ulises III
 */
public class Loteria {

    private int numero; // 6 numeros principales
    private int complementario; // 1 complementario
    private int reintegro; // 1 complementario
    private Random aleatorio = new Random();
    private int cupon[] = new int[6];

    public Loteria() {
        mostrarLoteria();
        //getCupon();

    }

    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        //System.out.println(loteria.mostrarLoteria());
        System.out.println(loteria.getCupon());
    }

    // Solo queda quitar duplicados al cupón
    public int[] mostrarLoteria() {

        complementario = aleatorio.nextInt(49) + 1;
        reintegro = aleatorio.nextInt(49) + 1;

        int resultado[] = new int[6];

        for (int i = 0; i < cupon.length; i++) {
            numero = aleatorio.nextInt(49) + 1;
            resultado[i] = numero;

            for (int j = 0; j < i; j++) {
                if (resultado[i] == resultado[j]) {
                    i--; // 
                    break; 
                }
                
             

            }
        }
            setNumero(numero);
            setCupon(resultado);
            setComplementario(complementario);
            setReintegro(reintegro);

            return resultado;
        }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getComplementario() {
        return complementario;
    }

    public void setComplementario(int complementario) {
        this.complementario = complementario;
    }

    public int getReintegro() {
        return reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int[] getCupon() {

        for (int numero : this.cupon) {

            System.out.print(numero + ",");

        }
        return this.cupon;
    }

    public String getCuponFormateado() {
        String texto = "";
        for (int n : this.cupon) {
            // Concatenamos el número y un espacio (o coma)
            texto += n + "  ";
        }
        return texto.trim(); // .trim() quita el último espacio sobrante
    }

    public void setCupon(int[] cupon) {
        this.cupon = cupon;
    }

}
