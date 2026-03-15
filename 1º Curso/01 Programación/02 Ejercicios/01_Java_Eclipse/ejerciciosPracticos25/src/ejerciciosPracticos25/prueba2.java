package ejerciciosPracticos25;

public class prueba2 {
	
	
	public static void main (String [] arg) {
		
		
		// Problemas lógicos 
		
		// nivel 1 - principiante 
		
		// 1. numeros par e impar
		
		
		int numero = 8;
		
		// numero  - operador modular - divisor == 0 , si es 0 es par , si es 1 el resto es impar
		
		// el % operador modulo lo que hace es darno el resto de la division , si estamos dividiendo pero el resultado es el resto
		
		if (numero % 2 == 0) {
			
			System.out.println("el número es par");
		}else {
			
			System.out.println("el numero es impar");
		}
		
		
		// 2. numero mayor
		
		if ( 2 < 7 ) {
			
			System.out.println("es un numero menor");
		}else {
			
			System.out.println("es un mumero mayor");
		}
		
		
		// 3. tabla de multiplicar
		System.out.println("Tabla de multiplicar del 2");
		for ( int i = 1; i<11 ; i++) {
			
			int resultado = 2 * i ;
			
			System.out.println("resultado : " +resultado);
		}
		
		// 4. Suma los dígitos de un numero
		
		// usamos 10 por el sistema decimal 
		
		int numerosDigitos = 1546;
		int suma=0;
		while ( numerosDigitos > 0) {
			
			
			int digito = numerosDigitos % 10 ; 
			
			 suma += digito;
			
			numerosDigitos = numerosDigitos / 10;
			
			System.out.println("Suma de numeros decimales" + numerosDigitos);
		}
		System.out.println("Suma total = " + suma );
		
		// Nivel Intermedio
		
		// 5. numeros primos 
		
		// si da 0 , no es primo , no debe ser divisible
		
		
		
		for ( int i = 2 ; i < 11 ; i++ ) {
			
			
			if ( numero % i == 0) {
				
				
			}
			
			
			
			
		}
		
		
		
		}
		
		
		
		
		
		
	}


