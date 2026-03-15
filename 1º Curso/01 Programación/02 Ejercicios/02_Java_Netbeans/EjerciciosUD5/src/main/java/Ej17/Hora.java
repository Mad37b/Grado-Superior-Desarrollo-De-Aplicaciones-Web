package Ej17;
/**
 * @author Ulises III
 */
public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
    }

    public Hora(int hora, int minutos, int segundos) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
       
        if (this.hora >=25 || this.minutos >= 61 || this.segundos >=61){
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
            
             System.out.println(getHora()+":"+getMinutos() + ":"+getSegundos());  
        }else{
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
            System.out.println(getHora()+":"+getMinutos() + ":"+getSegundos());   
        }
    }

    public String modificarHoras ( int hora, int minutos , int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    
        return "Hora modificada: " + hora + " : " + minutos + " : " + segundos;
    }
    public String visualizar(){
    
        return " Hora establecida" + hora + " : " + minutos + " : " + segundos;
    }
    
    // getters and setters
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
    return hora + ":" + minutos + ":" + segundos;
}
    
    
}
