package ejercicioArbolUD3;
/**
 *
 * @author Ulises III
 */
public class Ej01Arbol {

 public String especie;
 public double altura;
 public int edad;
 public String tipoHoja;
 public boolean esFrutal;

 public Ej01Arbol(){
   
 }
 
  public Ej01Arbol(String especie,double altura, int edad,String tipoHoja,boolean esFrutal){
   
      this.altura = altura;
      this.especie = especie;
      this.tipoHoja = tipoHoja;
      this.esFrutal = esFrutal;
      this.edad = edad;
 }
 

    public void visualizar() {
    System.out.println("Especie: " + especie);
    System.out.println("Altura: " + altura);
    System.out.println("Edad: " + edad);
    System.out.println("Tipo de hoja: " + tipoHoja);
    System.out.println("Es frutal: " + esFrutal);
        if (esFrutal == true) {
        System.out.println("El arbol es frutal.");
        } else {
        System.out.println("El arbol no es frutal.");
        }
    }
    
 

    public String getEspecie() {
        return especie;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public boolean isEsFrutal() {
        return esFrutal;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    public void setEsFrutal(boolean esFrutal) {
        this.esFrutal = esFrutal;
    }
 
}