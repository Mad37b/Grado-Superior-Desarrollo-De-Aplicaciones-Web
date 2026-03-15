package Ej01;

import Ej01.*;

/**
 *
 * @author Ulises III
 */
public class Duracion {
    
    private int minutos ;
    
    private int segundos;

    public Duracion() {this(0,0);}

    public Duracion(int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
        int vuelta = 0; 
        int total=0;
        
        if ( segundos >=60){
        
         while (this.segundos >= 60){
     
         total = this.segundos - 60;
         this.segundos= total;  
         this.minutos++;
         vuelta++;
         
        }

        }
     
    }
    
    public void formato (){} // borrable

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
     public int devolverSegundos(int segundos) {
        this.segundos = segundos;
        return this.segundos;
    }

    @Override
    public String toString() {
        return "Duracion{" + "minutos=" + minutos + ", segundos=" + segundos + '}';
    }
     
}
