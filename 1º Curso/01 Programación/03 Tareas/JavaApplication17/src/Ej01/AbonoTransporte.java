package Ej01;
/**
 * @author Ulises III
 */
public class AbonoTransporte {
    
    private double saldo;
    private String idAbono; 
    private String DNI;
    private Duracion tiempoViaje;
    //añadir

    public AbonoTransporte() {
     this(0.00,"","",new Duracion());// tambien el objeto-variable duracion puede ponerse como null
    }

    public AbonoTransporte(double saldo, String idAbono, String DNI, Duracion tiempoViaje) {
        this.saldo = saldo;
        this.idAbono = idAbono;
        this.DNI = DNI;
        this.tiempoViaje = tiempoViaje;
    }
    
    
    
    public double recargarSaldo ( double saldo){
        if( this.saldo <-1){
            this.saldo= 0;
        }else{
        this.saldo = this.saldo + saldo;
        }
     return this.saldo;   
    }
    
    public String realizarViaje ( int segundos){
       int getMinutos = tiempoViaje.getMinutos();
       int getSegundos = tiempoViaje.getSegundos();
        
       boolean esValido = true; 
       double resta =  this.saldo - 0.50 - (0.02*segundos) ; // quité segundos
       this.saldo = resta;
       // segundos de Duracion  + segundos del parametro
       int segundosTotales = tiempoViaje.devolverSegundos(segundos) + getSegundos;
        tiempoViaje = new Duracion (getMinutos,segundosTotales);     
        System.out.println("# Realizar viaje ()" + "\n"+"Saldo:"+this.saldo + "\n"+ "Tiempo del viaje:" + tiempoViaje.toString());
        String texto =segundosTotales + " segundos" + "\n";
        return texto;
    }
    
    public void usarBonoDiario(){
    int minutos=tiempoViaje.getMinutos();
    int segundos = tiempoViaje.getSegundos();
    double total = this.saldo -3.20;
    
    
    
    if(minutos < 60) {
     saldo = saldo - 3.20;   
      minutos =minutos + 60;
      tiempoViaje.setMinutos(minutos);
    }
        System.out.println("Saldo bono diario :" + String.format("%.2f", total) + " - " + "Tiempo total :"+ minutos + " minutos");
    }
    
    public void consultarAbono(){
        System.out.println("Muestra por pantalla");
        System.out.println("    Identificador del abono:"+this.idAbono);
        System.out.println("    DNI del usuario:"+this.DNI);
        System.out.println("    Saldo disponible:"+String.format("%.2f", this.saldo));
        System.out.println("    Tiempo total de viajes :"+ tiempoViaje.getMinutos()+" minutos,"+ tiempoViaje.getSegundos()+" "+ "segundos.");
        
       
            
            // si es la primera vez da 0 
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdAbono() {
        return idAbono;
    }

    public void setIdAbono(String idAbono) {
        this.idAbono = idAbono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Duracion getTiempoViaje() {
        return tiempoViaje;
    }

    public void setTiempoViaje(Duracion tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }
    
}
