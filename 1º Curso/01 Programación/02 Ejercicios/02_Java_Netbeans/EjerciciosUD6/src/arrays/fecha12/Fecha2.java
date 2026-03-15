package arrays.fecha12;

/**
 *
 * @author Ulises III
 */
public class Fecha2 {

//metodo mesLetra para pasar el mes de numero a letra
    private int dia;
    private int mes;
    private int anyo;

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Fecha2(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public Fecha2() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2013;
    }

    public void asignate(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public void incrementate(int d) {
        for (; d > 0; d--) {
            dia++;
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia == 31) {
                        mes++;
                        dia = 1;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia == 32) {
                        mes++;
                        dia = 1;
                        if (mes == 13) {
                            anyo++;
                            mes = 1;
                        }
                    }
                    break;
                case 2:
                    if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) { //bisiesto
                        if (dia == 30) {
                            mes++;
                            dia = 1;
                        }
                    } else {
                        if (dia == 29) {
                            mes++;
                            dia = 1;

                        }
                    }
            }
        }
    }

    private String mesLetra() {
      // Cambios aqui , tenerlo en cuenta Como se declara
        String[] mesArray = { 
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        return mesArray[mes-1]; // se pone en -1 para que cuente del 1 al 12 // para que no empiece a 0
    }

    public void imprimete() {
        System.out.println(dia + "-" + mesLetra() + "-" + anyo);
    }

    public void imprimete(int fecha) {
        System.out.println(dia + "-" + mes + "-" + anyo);
    }

    public String getFecha() {
        return dia + "-" + mesLetra() + "-" + anyo;
    }
}
