
// código de la tarea 04

// 1. Crear una función que cree una ventana no redimensionable de tamaño 400x400

document.write("<h1>Tarea DWEC04</h1>");
const abrir = document.getElementById("abrirVentana")

function ventanaNoRedimensionable() {

 /** Creamos la ventana no redimensionable  */
    var ventana = window.open("", "", "width=400, height=400, resizable=no");
    var protocolo = window.location.protocol;
    var hostname = window.location.hostname;
    var pathname = window.location.pathname;
    var url = protocolo + "//" + hostname + pathname;
    var nombreNavegador = navigator.appCodeName;
    // insertar texto en la ventana
 


 
        abrir.onclick = ventanaNoRedimensionable;
        
        if(ventana){
        ventana.document.write("<h3>Ventana no redimensionable</h3>");
        ventana.document.write("<h3>URL de la página: " + url + "</h3>");   
        ventana.document.write("<h3>Nombre del navegador: " + nombreNavegador + "</h3>");
        }else{
        alert("No se ha podido abrir la ventana");
         }
   
} 

/**  2 . Crea una función que crea la ventana si yo hago clic en el boton para controlar el flujo de ventanas abiertas cada
 que se reinicie la pagina web. **/

abrir.addEventListener("click",ventanaNoRedimensionable);

// 2º apartado : escribir fuera de la función para que se ejecute la segunda ventana

var nombre = prompt("Introduce tu nombre: ");
var edad = prompt("Introduce tu edad: ");
var diaPedido = prompt("Introduce tu dia de nacimiento: ");
var mesPedido = prompt("Introduce tu mes de nacimiento: ");
var añoPedido = prompt("Introduce tu año de nacimiento: ");
/** Convierte las cadenas de texto del prompt a fecha */

var fecha = new Date(añoPedido, mesPedido - 1, diaPedido);

var dia = fecha.getDate();
var mes = fecha.getMonth();
var año = fecha.getFullYear();

var formatoFecha = dia + " - " + mes + " - " + año;

/** depuración de formatoFecha por consola */
console.log(formatoFecha);

var primeraLetra = nombre.charAt(0);
var ultimaLetra = nombre.charAt(nombre.length - 1);

var ventanaDatos = window.open("", "", "width=400, height=400, resizable=no");

// datos de la segunda nueva ventana 
ventanaDatos.document.write("<h3>buenos días " + nombre + "</h3>");
ventanaDatos.document.write("<h3>Fecha de nacimiento: " + formatoFecha + "</h3><br><br>");
ventanaDatos.document.write("<h3>Día de nacimiento: " + diaPedido + "</h3><br><br>");
ventanaDatos.document.write("<h3>Tu nombre tiene " + nombre.length + " caracteres incluido espacios</h3><br><br>");
ventanaDatos.document.write("<h3>La primera letra " + primeraLetra + " de tu nombre está en la posición"+nombre.indexOf(primeraLetra)+"</h3><br><br>");
ventanaDatos.document.write("<h3>La última letra " + ultimaLetra + " de tu nombre está en la posición " + nombre.lastIndexOf(ultimaLetra) + "</h3><br><br>");
ventanaDatos.document.write("Tu nombre menos las 3 primeras letras es: " + nombre.slice(3) + "<br><br>");
ventanaDatos.document.write("Tu nombre todo en mayúsculas es: " + nombre.toUpperCase() + "<br><br>");
ventanaDatos.document.write("Tu edad es: " + edad + " años<br><br>");
ventanaDatos.document.write("Naciste un feliz " + mesPedido + " del año " + añoPedido + "<br><br>");
ventanaDatos.document.write("El coseno de 180 es " + Math.cos(180) + "<br><br>");
ventanaDatos.document.write("El número mayor de (34,67,23,75,35,19) es: " + Math.max(34,67,23,75,35,19) + "<br><br>");
ventanaDatos.document.write("Ejemplo de número al azar: " + Math.random() + "<br><br>");

