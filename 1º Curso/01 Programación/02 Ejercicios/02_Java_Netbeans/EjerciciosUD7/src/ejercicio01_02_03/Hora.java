package ejercicio01_02_03;

import java.util.Random;

/**
 * Ejercicio 01
 *
 * @author Ulises III
 */
public class Hora {

  
    protected int hora;
    protected int minutos;
    protected int segundos;

    public Hora() {
        Random aleatorio = new Random();
        hora = aleatorio.nextInt(23) + 1;
        minutos = aleatorio.nextInt(59);
        segundos = aleatorio.nextInt(59);
    }

    public Hora(int hora, int minutos, int segundos) {
       

        if (this.hora < 0 || this.hora > 23 && this.minutos < 0 || this.minutos > 59 && this.segundos < 0 || this.segundos > 59) {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }else{
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        
        }
    }
    
    public String visualizarHora (){
        String nuevoFormato;
        nuevoFormato = String.format("%02d : %02d : %02d", this.hora, this.minutos, this.segundos);
        
        return nuevoFormato;
    
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos;
    }

}
