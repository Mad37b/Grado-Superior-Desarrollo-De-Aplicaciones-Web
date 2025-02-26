/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD2 - 241228
    Solución propuesta
*/

document.write("<h1> Examen UD2 - 241228</h1>");

// Ejercicio 1: Coeficientes
a = prompt("Inserte el coeficiente a");
b = prompt("Inserte el coeficiente b");
c = prompt("Inserte el coeficiente c");


// Ejercicio 2: Validación a,b,c <> 0
while(a == 0){
    a = prompt("El coeficiente a es cero. Por favor, introduzca un nuevo valor");
}

while(b == 0){
    b = prompt("El coeficiente b es cero. Por favor, introduzca un nuevo valor");
}

while(c == 0){
    c = prompt("El coeficiente c es cero. Por favor, introduzca un nuevo valor");
}


// Ejercicio 3: cálculo discrminante
discriminante = b*b - 4*a*c
alert("El discriminante es: " + discriminante);

// Ejercicio 4: cálculo solución en función del discriminante
if (discriminante > 0) {
    document.write("La ecuación tiene dos soluciones");
} else if (discriminante === 0) {
    document.write("La ecuación tiene una solución");
} else {
    document.write("La ecuación no tiene solución");
}