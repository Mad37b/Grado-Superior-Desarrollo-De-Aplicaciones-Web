package Ej16;

/**
 *
 * @author Ulises III
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anno;
    
    public Fecha (int dia,int mes,int anno){
       this.dia = dia;
        this.mes = mes ;
        this.anno = anno;
    
        //asignar(int dia , int mes int anno);
    
    }
    
   public Fecha (){
   
   this.dia = 1;
   this.mes = 1;
   this.anno= 2013;
   }
    
   // Queremos contar los meses del calendario 
   
   // febrero 28 +1 marzo el año cae cada 4  y 400 , febrero 29
   public void calendario (){ // pasandolo al metodo incremetar por dia 
       boolean esBisiesto= true;
   /**while ( mes <=0 || >=13 )
       Enero, marzo, mayo,julio ,agosto , octubre, diciembre 31
       // saber cuantas vueltas das y actualizar datos por cada vuelta
       // actualizar a año nuevo  ( mes 13 y dia 32 )
       Abril,Junio, septiembre, noviembre 30
       
       febrero 28 , si es bisiesto 29
       
       if (esBisiesto) {
           true
       }else{
        false   
       }
       **/
       System.out.println("La nueva fecha a sido " + dia  + " mes " + mes + " año + " +anno );
               
   }
    // get
    public void asignar(int dia , int mes , int anno){
        this.dia = dia;
        this.mes = mes ; 
        this.anno = anno;
        System.out.println(dia + " - "+ mes + " - " + anno);
    }
    
    public String incrementar (int diaIntroducido){
    String mesS="";
    int diaIncrementado = diaIntroducido;
    int diaActual = this.dia ;
    
    int suma = 0 ;
    int resta = 0 ; 
    int total = 0;
    int vueltas = 0 ;
    // 1  ) dias totales 
        suma = diaActual + diaIncrementado;
        resta = suma;  
if( mes >= 13){
  
       while ( mes >= 13){ 
             mes = mes - 12 ;
             vueltas++;
              
            }
       
       anno =anno + vueltas;  
        vueltas = 0;
 }
    System.out.println("prueba  mes2 " + mes);
            if (mes ==1||mes==3 || mes== 5 || mes == 7 || mes ==8 || mes == 9 || mes ==10 || mes == 12){
                while (resta > 31){ 

                 System.out.println("Prueba 0 - dia " +resta);
                 resta = resta -31 ; 
                 mes++;
                 System.out.println("Prueba 1 - dia " + resta +" mes " + mes);
                 
                }
                if(resta< 31){
                total = resta; // si es menor 
                System.out.println("Prueba 2 - dia " + total +" mes " + mes);
                 
                }
            }

            if (mes==3 || mes== 4 || mes==6 || mes ==11){
                   
                 while (resta > 30){ 
                 resta = resta -30 ; 
                 mes++;
                
                }
                if(resta< 30){
                total = resta; // si es menor 
                
                }
            }
            
            if (mes == 2) {
                while (resta > 28){ 
                 resta = resta -28 ; 
                 mes++;
                 
                }
                if(resta< 28){
                total = resta; // si es menor 
                
                }  
            }
            
            // si el año es bisiesto
            if (anno %4 ==0 || anno %100 == 0 || anno %400 == 0) {
               if (mes == 2) {
                while (resta > 29){ 
                 resta = resta -29; 
                 mes++;
                 
                }
                if(resta< 29){
                total = resta; // si es menor 
                
                }      
             }
            }
    if( mes >= 13){
  
       while ( mes >= 13){ 
             mes = mes - 12 ;
             vueltas++;
              
            }
       
       anno =anno + vueltas;  
       vueltas = 0;
       
 }
         System.out.println("antes del swicht: "+ mes);
            switch (mes) {
                case 1:  mesS="Enero"; break; //sout , "Enero" return 
                case 2:  mesS="Febrero"; break;
                case 3:  mesS="Marzo"; break;
                case 4:  mesS="Abril"; break;
                case 5:  mesS="Mayo"; break;
                case 6:  mesS="Junio"; break;
                case 7:  mesS="Julio"; break;
                case 8:  mesS="Agosto"; break;
                case 9:  mesS="Septiembre"; break;
                case 10: mesS="Octubre"; break;
                case 11: mesS="Noviembre"; break;
                case 12: mesS="Diciembre"; break;
                default: System.out.println("Mes no introducido"); break;
               }
            
            // cuando pasamos a año nuevo
            
        
         
        
    return "Resultado Incrementar(): "+ total +" - "+ mesS +" - " + anno;
    }
    public void imprimir(){ /** formato : 5-Febrero-1010 **/
    
     System.out.println("Fecha Imprimida sin argumentos: "+ dia +" - "+ mes +" - " + anno );
    
    }
    
    
    
    
    public void imprimir(int dia , int mes , int anno){
        System.out.println("Fecha Imprimida con argumentos: "+ dia +" - "+ mes +" - " + anno );
    }

    public String getFecha(){
    String fecha ="Fecha Obtenida: "+ dia +" - "+ mes +" - " + anno;
    return fecha;
    }
    // getters y setters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    
}
