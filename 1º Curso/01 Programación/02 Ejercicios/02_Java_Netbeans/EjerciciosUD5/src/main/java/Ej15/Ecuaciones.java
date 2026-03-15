
package Ej15;

/**
 * Ejercicio 15
 * @author Ulises III
 */
public class Ecuaciones {
    
    // Formula segundo grado ax2 +bx+c=0, 
    int a;
    int b;
    int c;
    
    //b
    public Ecuaciones(){}
    
    public Ecuaciones(int a, int b, int c){
     this.a=a;
     this.b=b;
     this.c=c; 
    
    
    }

    //c setCoeficiente
    public void setCoeficientes(int a, int b, int c) {
     // toma los valores
     this.a=a;
     this.b=b;
     this.c=c; 
    }
    
  
    // ver Solucion
   
    

     // faltaba el discriminante por eso no iba 
     public double obtenerSolucion1() {
    // b al cuadrado es Math.pow(b, 2)
    return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
}

    public double obtenerSolucion2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
     
    public String averiguar (){
        boolean esSolucionable = true ; 
        double discriminante = Math.pow(b, 2)-4*a*c;
        String solucion="";
        double x1= (-b+Math.sqrt(discriminante))/(2*a);
        double x2= (-b-Math.sqrt(discriminante))/(2*a);
        
        // restricciones
        
        if (discriminante < 0) {// no puede ser negativo
           solucion="Error 1 : No hay solucion real: " + discriminante;
             esSolucionable = false;
             return solucion;
        }
        
        if (a == 0) {
            solucion="Error 2 : no es una ecuacion de segundo grado";
             esSolucionable = false;
               return solucion;
        }
        solucion="Solucion "+ "\n" + "Si fuera suma:"+ x1 +"\n" + "Si fuera resta: " + x2; 
        return solucion;
    
    }

    // D y E
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }  
}