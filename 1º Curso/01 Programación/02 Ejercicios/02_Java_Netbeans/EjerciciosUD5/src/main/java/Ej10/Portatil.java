package Ej10;
/**
 * Ejercicio 10
 * @author Ulises III
 */
public class Portatil {
    
    	public String marca;
	public String cpu;
	public int ram; //en GB
	public int HD; //en Gb, 
	public boolean  esUSBC=true; //indica si tiene usb de tipo C
    public Portatil(){}
    public Portatil(String marca, String cpu, int ram, int HD,boolean usbc) {
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.HD = HD;
        this.esUSBC = usbc;
    }

    public void visualizar() {
    System.out.println("marca: " + marca);
    System.out.println("cpu: " + cpu);
    System.out.println("ram: " + ram + "GB");
    System.out.println("HD: " + HD+ "GB");
        if (esUSBC == true) {
            System.out.println("El usb si es tipo C");
        }else{
            System.out.println("El usb no es tipo C");
        }
    }   
  
    public String getMarca() {
        return marca;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHD() {
        return HD;
    }

    public boolean isEsUSBC() {
        return esUSBC;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public void setEsUSBC(boolean esUSBC) {
        this.esUSBC = esUSBC;
    }
       
}
