
package Ej13;

/**
 * Ejercicio 13
 * @author Ulises III
 */
public class Cuenta {
    
    private String titular; // nombre???
    private double saldo;
    
    
    public void visualizar(){
        
    System.out.println("Titular :" + titular +"\n"+ " saldo :" + saldo);;   
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
