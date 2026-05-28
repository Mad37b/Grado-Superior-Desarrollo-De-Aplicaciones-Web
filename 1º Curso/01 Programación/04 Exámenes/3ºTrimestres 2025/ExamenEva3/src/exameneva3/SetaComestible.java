package exameneva3;

import java.util.Random;

/**
 * Ejercicio 2 : SetaComestible
 *
 * @author dawdi : Miguel Ángel Domínguez Llorente
 */
public class SetaComestible extends Seta {

    private Random aleatorio = new Random();
    private int nivelSabor; //1 al 10 
    private boolean venenoLeve;
    private int diasConservacion; // dias desde su recoleccion

    public SetaComestible() {
    }

    // constructor con las propiedades del padre y el hijo toma valores aleatorios 
    public SetaComestible(String nombre, String especie, double peso) {
        super(nombre, especie, peso);
        this.nivelSabor = aleatorio.nextInt(10) + 1;
        this.venenoLeve = aleatorio.nextBoolean();
        this.diasConservacion = aleatorio.nextInt(7);

    }

    // constructor con las 6 propiedades 
    public SetaComestible(int nivelSabor, boolean venenoLeve, int diasConservacion, String nombre, String especie, double peso) {
        super(nombre, especie, peso);
        this.nivelSabor = nivelSabor;
        this.venenoLeve = venenoLeve;
        this.diasConservacion = diasConservacion;
    }

    public int indiceSeguridad() {
        setVenenoLeve(venenoLeve);
        // penalización peso 
        double penalizacionPeso = getPeso() / 10;
        //nivel Sabor
        double nivelSabor = (10 - getNivelSabor()) * 5;
        double penalizacionConservacion = getDiasConservacion() - 3;
        double total = penalizacionPeso + nivelSabor + penalizacionConservacion;

        if (venenoLeve == true ) {
            return (int)total - 25  ;
        }
        
        return (int) total;
    }

    public void visualizarSeta() {

        System.out.println("Nombre: " + getNombre() + " - Especie: " + getEspecie() + " - Peso: " + getPeso() + "g - Sabor:" + getNivelSabor() + " - Venenosa leve:" + isVenenoLeve() + " -Dias: " + getDiasConservacion() + " - Seguridad:" + indiceSeguridad());

    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getNivelSabor() {
        return nivelSabor;
    }

    public void setNivelSabor(int nivelSabor) {
        this.nivelSabor = nivelSabor;
    }

    public boolean isVenenoLeve() {
        return venenoLeve;
    }

    public void setVenenoLeve(boolean venenoLeve) {
        this.venenoLeve = venenoLeve;
    }

    public int getDiasConservacion() {
        return diasConservacion;
    }

    public void setDiasConservacion(int diasConservacion) {
        this.diasConservacion = diasConservacion;
    }

}
