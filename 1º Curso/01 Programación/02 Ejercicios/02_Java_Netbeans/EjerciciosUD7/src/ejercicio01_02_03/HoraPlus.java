package ejercicio01_02_03;

import java.util.Random;

/**
 * Ejercicio 2
 * @author Ulises III
 */
public class HoraPlus extends Hora {

   private int centesima;

    public HoraPlus() {
        Random aleatorio = new Random();
       centesima = aleatorio.nextInt(98)+1;
        
      
    }

    public HoraPlus(int hora, int minutos, int segundos, int centesima) {
        super(hora, minutos, segundos);
       
           if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59 || centesima < 0 || centesima > 99) {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
            this.centesima = 0;
        }
    }

  
    @Override
    public String visualizarHora (){
    String format = String.format("%02d:%02d:%02d:%02d", hora, minutos, segundos,centesima);
   
        return format;
    }

    public int getCentesima() {
        return centesima;
    }

    public void setCentesima(int centesima) {
        this.centesima = centesima;
    }


}
