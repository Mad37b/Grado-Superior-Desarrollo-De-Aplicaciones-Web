/** Tarea05 - Validación de un formulario   */

/** 01. Programar el script en un fichero independiente como este */

/**02 . Cookies */

document.addEventListener("DOMContentLoaded",()=>{

    const nombre ="";
    const apellido = ""
    const fecha =""
    const hora = "" ; 
    const telefono = "";
    const edad = 0;
    const provincia = ""
    const nif = "";
    const ruta ="'\'";
guardarCookie();
perderFoco();
validarEdad();

})

const guardarCookie=()=>{
    var formulario = document.getElementById("formulario");
    var contenedorIntentos = document.getElementById("intentos");
    var cookies = document.cookie;
    /** como estaba antes  */
   /** cookies = "nombre = piter; path=/";
    cookies = "comida_favorita = hamburguesa;path=/"; **/

    /** Guardamos la cookie en un objeto */
var nombre = "juan"
 var objetoCookie  = { Nombre: nombre, Apellido:apellido, Telefono:telefono,Nif :nif,Edad:edad,Hora:hora,provincia:provincia,fecha:fecha,path:ruta }; 
    cookies = JSON.stringify(objetoCookie);
    console.log(cookies);
 /** Javascript cookies con json anoto */
    
        alert(cookies);
   
    var nIntentos = 0;
    formulario.addEventListener("submit",(evento)=>{
        evento.preventDefault();
        nIntentos++;
        console.log("pruebo aqui cookie")
            alert(" has pulsado en el botón enviar, nº de veces que lo has hecho " + nIntentos)
        });



}



const convertirMayuculas =(textoInput) => {

    var frase =textoInput.value.toUpperCase();
    textoInput.value = frase;
    console.log(frase);
}

/** focus */

// Gana el foco con focus y lo pierde con blur 
/**04. validar nombre y apellido */
/** hacer un validador de letras  */
function perderFoco(){
document.addEventListener("DOMContentLoaded",function(){

    var inputNombre = document.getElementById("nombre");
    var inputApellido =document.getElementById("apellidos");

   var nombre =null;
   var apellido = null;


    if(inputNombre){

        inputNombre.addEventListener("input",function(){
            
            nombre=inputNombre.value;
            console.log("el nuevo valor es :" + nombre);

        });
        inputNombre.addEventListener("blur",function(){
            console.log("pierdo el foco")
            convertirMayuculas(inputNombre);
           
        });
    }
    if(inputApellido){

        inputApellido.addEventListener("input",function(){
            
            nombre=inputNombre.value;
            console.log("el nuevo apellido es :" + apellido);

        });
        inputApellido.addEventListener("blur",function(){
            console.log("pierdo el foco")
            convertirMayuculas(inputApellido);
           
        });
    }
     

        }
    
    
    
    
    )}

    
perderFoco();

/**05. validar edad  */

function validarEdad (){

document.addEventListener("DOMContentLoaded", () => {

var inputEdad =document.getElementById("edad");
var edad = new Number ();
/** asignamos con  la propiedad value el valor del input de la edad */

console.log("val2")

inputEdad.addEventListener("blur",() => {
console.log("val")

    if ( edad > 106 || edad <= 0){

        contenedorErrores = document.getElementById("errores");
        contenedorErrores.innerHTML = " <p style = color:red;> Error edad - la edad es mayor a 105 años - " + edad + "</p>";

        inputEdad.addEventListener("focus",()=>{
            contenedorErrores.innerHTML = "";
            edad = inputEdad.value;
            console.log("edad actualizada :" + edad )

        })
    }else{console.log ( " la edad es de :" + edad );contenedorErrores.innerHTML = "";}
    
})

})

}
validarEdad();
/** Regex */
/** 06. validad NIF */

function validarNif(){
document.addEventListener("DOMContentLoaded",()=> {

    var regexNif = new RegExp("^\\d{8}[A-Z]$");

    var inputNif = document.getElementById("nif");

// cuando pierde el foco es cuando valida

inputNif.addEventListener("blur", ()=> {
// trim () elemina los espacios en blanco 
var nif = inputNif.value.trim();

    if ( !regexNif.test(nif)){
        console.log("pierdo el foco Nif 2 ")
        contenedorErrores = document.getElementById("errores");
        contenedorErrores.innerHTML = " <p style = color:red;> Error Nif - el Nif introducido no es correcto - " + nif + "</p>";
    
    }else{ 
        console.log("pierdo el foco Nif 1 "); 
        contenedorErrores = document.getElementById("errores");
        contenedorErrores.innerHTML = " <p style = color:green;> Perfecto, el nif es válido - " + nif + "</p>"; 
    
    }

})

})

}
 
validarNif();
validarEdad();

/** 07. validad email */
 function validarEmail() {

document.addEventListener("DOMContentLoaded",() => {
/** "/^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/ " */
/**"^[a-zA-Z0-9]+@(gmail|hotmail)\\.(com|es)$/" */
    var regexEmail =new RegExp("^\\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/ ");
    var email = new String;
    var inputEmail = document.getElementById("email");
    contenedorErrores = document.getElementById("errores");
    inputEmail.addEventListener("blur",() => {
        email = inputEmail.value.trim();

        if (regexEmail.test(email.value)){
            inputEmail.style.backgroundColor ="orange"
           
            contenedorErrores.innerHTML = " <p style = color:red;> Error email - el email introducido no es correcto - " + email + "</p>";
    


        }else{
            inputEmail.style.backgroundColor ="green";
           
            contenedorErrores.innerHTML = " <p style = color:green;> Perfecto, el email es válido - " + email+ "</p>"; 

        }



    })



})

 }
validarEmail();





/** 08. validar provincias */

function validarProvincias () {
document.addEventListener("DOMContentLoaded",() => {
    let provincias = document.getElementById("provincia");

    const consultar = () => {

        let texto = provincias.options[provincias.selectedIndex].text;
        let valor = provincias.options[provincias.selectedIndex].value;

        provincias.addEventListener("blur", () => {
            console.log("salgo de foco de provincias ")
            console.log ( texto )
            return  alert(`Datos de la opción seleccionada:\n\nTexto: ${texto}\nValor: ${valor}`);
        })
      
    }
    /** cada vez que haya un cambio ,la variable funciona  */
    provincias.addEventListener("change", () => {
        console.log("hacemos el cambio ")
        consultar(); 
    });

})
    

}
validarProvincias();
/** 09. validar fecha  */
function validarFecha(){
document.addEventListener("DOMContentLoaded",() =>{
/**^\d{2}/\d{2}/\d{2}$ */
/** ^\d{1,2}/\d{1,2}/\d{1,2}$" */
    var inputFecha = document.getElementById("fecha");
   /**repasar las \\ en javascript y regex */
    var RegexFecha = new RegExp("^\\d{2}/\\d{2}/\\d{2}$");
    var contenedorErrores = document.getElementById("errores");
    console.log("y");
    inputFecha.addEventListener("blur",() => {
        var fecha = inputFecha.value.trim();
        if(RegexFecha.test(fecha)){
           
            alert (`Fecha elegida :"\n\n Fecha : ${fecha}\n`)
            console.log("y3");
        }else{
            contenedorErrores.innerHTML = " <p style = color:red;> Error fecha - la fecha introducida no es correcta - " + fecha + "</p>";
            console.log("y2");
        }




    })

})

}
validarFecha();
/** 10. validar hora */
function validarHora (){
    document.addEventListener("DOMContentLoaded",() =>{
        var contenedorErrores = document.getElementById("errores");
            var inputHora = document.getElementById("hora");
           /**repasar las \\ en javascript y regex */
            var regexHora = new RegExp("^\\d{2}:\\d{2}$");
          
            console.log("h");
            inputHora.addEventListener("blur",() => {
                var hora = inputHora.value;
                if(regexHora.test(hora)){
                   
                    alert (`Hora elegida :"\n\n Hora : ${hora}\n`)
                    console.log("h3");
                }else{
                    contenedorErrores.innerHTML = " <p style = color:red;> Error Hora - la hora introducida no es correcta - " + hora + "</p>";
                    console.log("h2");
                }
        
        
        
        
            })
        
        })

}
validarHora();
/** 11. validar telefono */

function validarTelefono (){
    document.addEventListener("DOMContentLoaded",() =>{
        var contenedorErrores = document.getElementById("errores");
            var inputTelefono = document.getElementById("telefono");
           /**repasar las \\ en javascript y regex */
            var regexTelefono = new RegExp("^(\\d{3} ?){2}\\d{3}$");
          
            console.log("t");
            inputTelefono.addEventListener("blur",() => {
                var telefono = inputTelefono.value;
                if(regexTelefono.test(telefono)){
                   
                    alert (`Hora elegida :"\n\n telefono : ${telefono}\n`)
                    console.log("t3");
                }else{
                    contenedorErrores.innerHTML = " <p style = color:red;> Error Telefono - el telefono introducida no es correcto - " + telefono+ "</p>";
                    console.log("t2");
                }

            })
        
        })

}
validarTelefono();
/** 12. validar confirmación  */
/** metodo confirm en alert para enviar el formulario  */