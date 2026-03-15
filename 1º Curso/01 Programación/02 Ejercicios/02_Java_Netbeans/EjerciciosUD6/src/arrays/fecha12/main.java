/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.fecha12;

/**
 *
 * @author Ulises III
 */
public class main {
  public static void main(String[] args) {
 Fecha2 fechaCompra = new Fecha2(30,11,2013);

 fechaCompra.imprimete();
 fechaCompra.imprimete(6);

 //incrementamos la fecha en 32 dias
 fechaCompra.incrementate(32);
 fechaCompra.imprimete();
 fechaCompra.incrementate(365);
 fechaCompra.imprimete();
 }  
}
