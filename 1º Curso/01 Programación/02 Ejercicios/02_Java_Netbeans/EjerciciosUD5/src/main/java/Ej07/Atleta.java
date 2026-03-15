
package Ej07;

/**
 * Ejercicio 7 - añadir metodo
 * @author Ulises III
 */
public class Atleta {
    
  String nombre;  
  int edad;
  double altura;
  double peso;
  String nif;

    public Atleta(String nombre, int edad, double altura, double peso, String nif) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nif = nif;
    }

    public String visualizar (){

        String texto = "Nombre: "+ nombre +"\n"+" NIF: "+ nif +"\n"+ "Altura: "+ altura+"\n"+" peso: "+peso ;
        if( edad >= 18){
            System.out.println("Es mayor de edad");   
        }else{System.out.println("Es menor de edad");}
        System.out.println(texto);
        return texto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
  
  
    
    
}
