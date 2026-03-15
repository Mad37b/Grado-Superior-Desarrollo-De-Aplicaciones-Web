
package Ej02;

/**
 * Ejercicio01-Rectángulo
 * @author Ulises III
 */
public class Ej02Rectangulo {

 private double largo;
 private double alto;
 
   public Ej02Rectangulo (){}
   
   public Ej02Rectangulo (double largo,double alto){
    Ej02Rectangulo rectangulo = new Ej02Rectangulo();  
    this.alto = alto;   
    this.largo = largo;
       
    
   
   }
 
    public void setAlto(double alto) {
    this.alto = alto;
    }
    public void setLargo(double largo) {
    this.largo = largo;
    }
    public double getAlto(double n) {
    return alto;
    }
    public double getLargo() {
    return largo;
    }

    public double superficie() {
    double sup;

    sup = alto * largo;
    return sup;
    }
    public double perimetro() {
    return (alto * 2) + (largo * 2);
    }
    public void visualizar() {
    System.out.println("largo: " + largo);
    System.out.println("alto: " + alto);
    System.out.println("superficie: " + superficie());
    System.out.println("perímetro: " + perimetro());
    }

   
}

