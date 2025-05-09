// validar.js Tema 7 : Aplicaciones dinamicas con PHP y Javascript

function validarNombre(){
    if(nombre.val().length < 4) {
    errorNombre.removeClass("oculto");
    return false;
    }
    errorNombre.addClass("oculto");
    return true;
   }

   function validarEmail(){
   // match para validar las direcciones de email
   }
   function validarPasswords(){
    
   }
   function validar(){
    return validarNombre() & validarEmail() & validarPasswords();
   }
   