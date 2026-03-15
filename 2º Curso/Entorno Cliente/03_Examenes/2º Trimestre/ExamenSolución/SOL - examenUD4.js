/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD4 - 250312
*/


// Ejercicio 1:
const calcularHipotenusa = () => {
    let catetoA = parseFloat(prompt("Introduce el valor del primer cateto en cm:"));
    let catetoB = parseFloat(prompt("Introduce el valor del segundo cateto en cm:"));

    // Validar que sean números y mayores a 0
    if (isNaN(catetoA) || isNaN(catetoB)) {
        alert("Por favor, introduce valores válidos");
        return;
    }

    // Aplicar el teorema de Pitágoras: h² = a² + b²
    let hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

    // Redondear siempre al siguiente número entero
    let hipotenusaRedondeada = Math.ceil(hipotenusa);
    
    document.getElementById("ej1").innerHTML = "<h3>Resultado Ejercicio 1</h3><br>";
    document.getElementById("ej1").innerHTML += `La hipotenusa del triángulo es: ${hipotenusaRedondeada} cm <hr>`;
};

calcularHipotenusa();


// Ejercicio 2: 
let relojVentana;

const diasSemana = ["domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"];
const meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"];
const hoy = new Date();
const dia = diasSemana[hoy.getDay()];
const fecha = hoy.getDate();
const mes = meses[hoy.getMonth()];
const ano = hoy.getFullYear();

const ahora = new Date();
let horas = ahora.getHours().toString().padStart(2, '0');
let minutos = ahora.getMinutes().toString().padStart(2, '0');
let segundos = ahora.getSeconds().toString().padStart(2, '0');

function relojDigital() {
    if (!relojVentana) {
        relojVentana = window.open("", "Reloj", "width=400,height=200");
        relojVentana.document.body.innerHTML = `<h3>Hoy es ${dia}, ${fecha} de ${mes} de ${ano}</h3>`
        relojVentana.document.body.innerHTML += `<h2>${horas}:${minutos}:${segundos}</h2>`
    }
}

relojDigital();

// Ejercicio 3:
function crearPassword() {
const caracteres = "abcdefghijklmnopqrstuvwxyz0123456789#_-?!";
      let password = ""; // Variable para ir construyendo la contraseña

      // Bucle para generar 8 caracteres aleatorios
      for (let i = 0; i < 8; i++) {
        // Generar índice aleatorio dentro del rango de caracteres
        const indice = Math.floor(Math.random() * caracteres.length);
        // Añadir carácter aleatorio a la contraseña
        password += caracteres.charAt(indice);
      }

      // Mostrar la contraseña generada en un prompt
      alert("Contraseña generada: " + password);
    }
crearPassword();

