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

    
    // 1. Evento: Convertir el nombre de usuario a mayúsculas cuando pierde el foco
    usuarioInput.addEventListener("blur", function () {
        usuarioInput.value = usuarioInput.value.toLowerCase();
    });

    // 2. Validación: Código postal solo debe contener números y pertener a ourense (32XXX)
    function validarPostal() {
        const postal = postalInput.value.trim();
        if (!/^\d+$/.test(postal) || postal < 32000 || postal > 32999) {
            return "El código postal no pertenece a la provincia de Ourense";
        }
        return "";
    }
    
    // 3. Validación: Validar formato web 
    function validarWeb() {
        const web = webInput.value.trim();
        const webRegex = /^(https?:\/\/)(www\.)?[\w.-]+\.[a-zA-Z]{2,3}(\/\S*)?$/;
        if (!webRegex.test(web)) {
            return "La web no tiene un formato válido.";
        }
        return "";
    }

    // 4. Evento: Contar la cantidad de caracteres en el mensaje y mostrar una alerta si supera los 100
    mensajeTextarea.addEventListener("input", function () {
        if (mensajeTextarea.value.length > 100) {
            alert("El mensaje no puede tener más de 100 caracteres.");
            mensajeTextarea.value = mensajeTextarea.value.substring(0, 100);
        }
    });


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

