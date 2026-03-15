/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD5 - 250312
*/

document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("examenForm");
    const usuarioInput = document.getElementById("usuario");
    const postalInput = document.getElementById("postal");
    const webInput = document.getElementById("web");
    const mensajeTextarea = document.getElementById("mensaje");
    const erroresDiv = document.getElementById("errores");

    // Ejercicio 1. Evento: Convertir el nombre de usuario a mayúsculas cuando pierde el foco
    


    // Ejercicio 2. Validación: Código postal solo debe contener números y pertener a ourense (32XXX)
    function validarPostal() {
  

        
    }

    // Ejercicio 3. Validación: Validar formato web 
    function validarWeb() {



    }

    // Ejercicio 4. Evento: Contar la cantidad de caracteres en el mensaje y mostrar una alerta si supera los 100



   


    // Manejo del envío del formulario
    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Evita que el formulario se envíe

        erroresDiv.innerHTML = ""; // Limpia los mensajes de error
        let errores = [];

        const errorPostal = validarPostal();
        if (errorPostal) errores.push(errorPostal);

        const errorWeb = validarWeb();
        if (errorWeb) errores.push(errorWeb);

        if (errores.length > 0) {
            erroresDiv.innerHTML = errores.join("<br>");
        } else {
            alert("Formulario enviado correctamente.");
            form.submit();
        }
    });
});

