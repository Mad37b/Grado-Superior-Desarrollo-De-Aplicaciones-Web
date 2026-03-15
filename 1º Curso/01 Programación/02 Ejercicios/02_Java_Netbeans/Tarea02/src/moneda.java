
/**
 *
 * @author Ulises III
 */


public class moneda {
    
    public static void main(String[] args) {
        System.out.println("Cara o Cruz" + "\n");
         int contadorCara= 0;
        for (int i = 1; i <= 60; i++) {
               int dado = (int)(Math.random()*6)+1;
               String moneda = Math.random() < 0.5 ? "Cara" : "Cruz"; 
               String Estrella="";
             
                if ( dado == 6 && moneda == "Cara"){ Estrella ="*"; contadorCara++;} 
            System.out.println("Intento "+i +"\t"+ moneda + " : " + dado + Estrella);

        }
        
      
        System.out.println("Numero de veces que salio Cara y 6 :" + contadorCara);
  
    }
    
    
    
}
