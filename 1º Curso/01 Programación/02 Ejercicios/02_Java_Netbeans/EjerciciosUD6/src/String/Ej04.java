
package String;
import java.util.Scanner;
/**
 * @author Ulises III
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        String fecha;
        char letra;
        String dia= "";
        String barra= "";
        String mes = "";
        String barra2 = "";
        String anno = "";
        //
        int nDia;
        int nMes;
        int nAnno;
        // 1. Escribe la fecha
        fecha = teclado.nextLine();
       
            for (int i = 0; i < fecha.length(); i++) {
                letra = fecha.charAt(i);
                dia= fecha.substring(0, 2);
                barra= fecha.substring(2,3);
                mes = fecha.substring(3,5);
                barra2 = fecha.substring(5, 6);
                anno = fecha.substring(6, 10);// correcto

            }
            
            System.out.println("compruebo : " + dia+barra+mes+barra2+anno);
        
      
                        // no espacios 
                        // Cosas que quedan por hacer
                        /**
                         * Que no contenga espacios 
                         * mes y fecha no puede empezar en cero
                         **/
                        
                      // 2. Compruebo la longitud de la cadena 
                if (fecha.length() == 10 ){
                    
                    System.out.println("ok, longitud correcta");
                            nDia = Integer.parseInt(dia);
                            nMes = Integer.parseInt(mes);
                            nAnno = Integer.parseInt(anno);
                            
                    if ((nDia !=0 || nDia>=31 && nDia < 0)  && nMes !=0 && nMes >=12) {
                            System.out.println("ok valor dia y mes");
                        }else{System.out.println("formato incorrecto dia y mes ");}
 
                    if (Character.isDigit(nDia) && nDia <=31 || nDia > 0 ) {
                        System.out.println("si es un digito" + nDia);
                    }
                    //mes
                      if (Character.isDigit(nMes) && nMes <=12 || nMes > 0) {
                        System.out.println("si es un digito " + nMes);
                    }
                    
                    // año
                      if (Character.isDigit(nAnno) && nAnno >0) {
                        System.out.println("si es un digito " + nAnno);
                    }
                    
                    // 2.2 compruebo las barras
                     if ((barra.equals(fecha.substring(2,3)) && barra.equals(fecha.substring(5,6)) ) &&  barra.contains("/")) {
                              System.out.println("ok caracter; " +barra);

                     }else{System.out.println("Error en las barras: no son barras invertidas");}
    
              }else{System.out.println("Error en el formato: dd/mm/aaaa");}

        }       
    }