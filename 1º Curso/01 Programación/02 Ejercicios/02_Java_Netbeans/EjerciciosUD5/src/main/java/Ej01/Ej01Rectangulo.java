
package Ej01;

/**
 * Ejercicio01-Rectángulo
 * @author Ulises III
 */
public class Ej01Rectangulo {

 private double largo;
 private double alto;
 
   
 
    public void setAlto(double alto) {
    this.alto = alto;
    }
    public void setLargo(double largo) {
    this.largo = largo;
    }
    public double getAlto() {
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
    public void visualiza() {
    System.out.println("largo: " + largo);
    System.out.println("alto: " + alto);
    System.out.println("superficie: " + superficie());
    System.out.println("perímetro: " + perimetro());
    }

   
}

