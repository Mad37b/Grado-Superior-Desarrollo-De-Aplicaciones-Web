package Ej17;
/**
 *
 * @author Ulises III
 */
public class Llamada {
    
    String telefono;
    Hora comienzoLlamada;
    Hora finLlamada;
    
    Hora tiempo = new Hora ();

    public Llamada() {
    }

    public Llamada(String telefono, Hora comienzoLlamada, Hora finLlamada) {
        this.telefono = telefono;
        this.comienzoLlamada = comienzoLlamada;
        this.finLlamada = finLlamada;
    }
    
    public void escribirHoraComienzo(){
        
        System.out.println(this.comienzoLlamada + "\n");
    }

    public void escribirHoraFinal(){
        
        System.out.print(this.finLlamada + "\n");
        
    }
    public int duracionLlamada (){
        
        int inicio =(comienzoLlamada.getHora() * 3600) +(comienzoLlamada.getMinutos() * 60) + comienzoLlamada.getSegundos(); // segundos
        int fin = (finLlamada.getHora() * 3600) +(finLlamada.getMinutos() * 60) + finLlamada.getSegundos(); // segundos
        int segundoTotales= fin-inicio ;
        
          if (inicio > fin) {
            return -1;
        }else{
            return segundoTotales ;
          }
    }
    
    public void visualizar (){
        System.out.println("Clase Llamada"+ "\n" + " Telefono:"+this.telefono+"\n" + " Comienzo llamada:" +this.comienzoLlamada + "\n" +" Fin llamada:"+ this.finLlamada);   
    }
    
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Hora getComienzoLlamada() {
        return comienzoLlamada;
    }

    public void setComienzoLlamada(Hora comienzoLlamada) {
        this.comienzoLlamada = comienzoLlamada;
    }

    public Hora getFinLlamada() {
        return finLlamada;
    }

    public void setFinLlamada(Hora finLlamada) {
        this.finLlamada = finLlamada;
    }
 
}
