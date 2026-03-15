package Ej14;

/**
 * Ejercicio 14
 * @author Ulises III
 */
public class Cuenta {
    
    private String titular; // nombre???
    private double saldo;
    
    
    public double ingresar (double ingreso){
    double suma;
    
    suma = saldo + ingreso;    
    saldo = suma; // actualiza el valor 
    return saldo;
    }
    
    public double retirar ( double retirar){
     double resta ;    
     resta = saldo  - retirar;
     saldo = resta;
     return saldo;
    }
    
    public void visualizar(){
        
    System.out.println("Titular :" + titular +"\n"+ " saldo :" + saldo + " €");  
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
