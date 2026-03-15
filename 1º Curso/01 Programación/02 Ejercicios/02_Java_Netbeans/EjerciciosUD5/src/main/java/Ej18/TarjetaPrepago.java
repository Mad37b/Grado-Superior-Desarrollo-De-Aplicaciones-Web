package Ej18;
/**
 * @author Ulises III
 */
public class TarjetaPrepago {
    private String numeroTelefono;
    private String nif;
    private double saldo;
    private Tiempo consumo;

    public TarjetaPrepago() {
    }

    public TarjetaPrepago(String numeroTelefono, String nif, double saldo) {
        this.numeroTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
    }
    public double añadirSaldo(double saldo){
     this.saldo = this.saldo+saldo;   
     
     return this.saldo;
    }
    
    public int enviarMensaje (int nMensajes){
    
        double resta = this.saldo - nMensajes - 0.09;
        this.saldo = resta;
        return (int)resta;
    }
    public double llamadaRealizada (int minutos, int segundos){ // llamada para nico 
       if (this.consumo == null){
            consumo = new Tiempo(0,0);
            
        }else{
        this.consumo =new Tiempo (minutos,segundos);
       }
    double resta = saldo - 0.15 - (segundos-0.01);
    saldo = resta;
    return saldo;
    }
    
    public void consultarNumero(){
        
        if (this.consumo == null){
            consumo = new Tiempo(0,0);
            
        }
        
        System.out.println("#Datos del cliente");
        System.out.println("Numero de telefono :" + numeroTelefono);
        System.out.println("NIF :" + nif);
        System.out.println("Saldo :" + saldo +"€");
        System.out.println("Tiempo de consumo:" + consumo);
        
        
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Tiempo getConsumo() {
        return consumo;
    }

    public void setConsumo(Tiempo consumo) {
        this.consumo = consumo;
    }
}
