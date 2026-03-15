package Ej18;
/**
 *
 * @author Ulises III
 */
public class main {
    
    public static void main(String[] args) {
        TarjetaPrepago cliente = new TarjetaPrepago("1111","2222",20);
        Tiempo tiempo = new Tiempo (6,33);
       
        // Establecer tiempo
        
        //Somos un cliente que tiene un numero de telefono , nif y saldo
        
        // queremos consultar el saldo 
        
        cliente.consultarNumero();
        cliente.añadirSaldo(20.0);
        cliente.añadirSaldo(20.0);
        cliente.añadirSaldo(20.0);
        cliente.añadirSaldo(20.0);
        System.out.println(cliente.getSaldo());
        cliente.consultarNumero();
        System.out.println("Ahora voy a enviar mensajes");
        // ahora quiero enviar 2 mensajes ( gastar ) 
        
        cliente.enviarMensaje(7);
        System.out.println("despues de gastar mensajes");
        cliente.consultarNumero();
        
        cliente.setConsumo(new Tiempo (4,26)); // establezco el consumo 4 minutos 26 segundos
        // hago la llamdada
        
        cliente.llamadaRealizada(2,6);
        System.out.println("Datos después de la llamada");
        cliente.consultarNumero();
       
       
        
    }
    
}
