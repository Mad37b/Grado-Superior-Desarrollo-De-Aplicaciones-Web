package tarea10;

import java.util.Random;

/**
 *
 * @author Ulises III
 */
public class Dado {

    private int dado;
    private Random aleatorio = new Random();

    public Dado(int dado) {
        this.dado = dado;
    }

    public Dado() {
        
        this(0);
    }
    
    public int tirarDado(){
        dado=aleatorio.nextInt(6)+1;
        System.out.println("el dado ha sido tirado:" + dado);
        return dado;
    }
}
