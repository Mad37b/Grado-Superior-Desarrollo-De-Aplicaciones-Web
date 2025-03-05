/** Tarea05 - Validación de un formulario   */

/** 01. Programar el script en un fichero independiente como este */

/**02 . Cookies */

document.addEventListener("DOMContentLoaded",()=>{

    /** variables globales */
    /** queremos con estas variables capturar los valores del formulario y pasarselas luego a las cookies por un objeto */

    let nombre ="";
    let apellido = ""
    let fecha =""
    let hora = "" ; 
    let telefono = "";
    let edad = 2;
    let provincias = ""
    let nif = "";
    const ruta ="\/";
    let contenedorErrores = document.getElementById("errores");
    /** Funciones  */

    const guardarCookie=()=>{
        var formulario = document.getElementById("formulario");
        var contenedorIntentos = document.getElementById("intentos");
        var cookies = document.cookie;
        var nIntentos = 0;
    
        /** Guardamos la cookie en un objeto */
    formulario.addEventListener("submit",(evento)=>{
        let objetoCookie  = { Nombre: nombre, Apellido:apellido,Telefono:telefono,Nif :nif,
            Edad:edad,Hora:hora,provincia:provincias,fecha:fecha,path:ruta }; 
        /** Javascript cookies con json anoto */
        cookies = JSON.stringify(objetoCookie);
        evento.preventDefault();
        nIntentos++;
       
        console.log("pruebo aqui cookie");
        alert(" has pulsado en el botón enviar, nº de veces que lo has hecho " + nIntentos);
        contenedorIntentos.innerHTML="<p style = color:blue;> Intentos - Se ha enviado " + nIntentos + " vez/veces el formulario \n\n los datos enviados por cookies son :" + cookies;

        alert(cookies);
        console.log(cookies);

        
         

    })
  
    }
    const convertirMayuculas =(textoInput) => {
     document.addEventListener("DOMContentLoaded",()=>{
        var frase =textoInput.value.toUpperCase();
        textoInput.value = frase;
        console.log(frase);

     })

    }

    /** focus */

    // Gana el foco con focus y lo pierde con blur 
    /**04. validar nombre y apellido */
    /** hacer un validador de letras  */

    function perderFoco(){
       
        
            var inputNombre = document.getElementById("nombre");
            var inputApellido =document.getElementById("apellidos");
        
       
        
        
        
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
        
                inputApellido.addEventListener("input",function(){ apellido=inputApellido.value;console.log("el nuevo apellido es :" + apellido);
                });
                inputApellido.addEventListener("blur",function(){ console.log("pierdo el foco");convertirMayuculas(inputApellido);
                   
                });
            }
                     
                }
 /**05. validar edad  */
    function validarEdad (){

        var inputEdad =document.getElementById("edad");
    
        /** asignamos con  la propiedad value el valor del input de la edad */
        
        console.log("val2")
        
        inputEdad.addEventListener("blur",() => {
        console.log("val")
        edad = inputEdad.value;
            if ( edad >= 106 || edad <= 0){
        
                contenedorErrores = document.getElementById("errores");
                contenedorErrores.innerHTML = " <p style = color:red;> Error edad - la edad es mayor a 105 años : " + edad + "</p>";
                edad = inputEdad.value;
                inputEdad.addEventListener("focus",()=>{
                    contenedorErrores.innerHTML = "";
                    edad = inputEdad.value;
                    console.log("edad actualizada :" + edad )
        
                })
            }else{
            edad = inputEdad.value; 
            contenedorErrores.innerHTML = "<p style = color:green;> Perfecto - la edad es menor  a 105 años : " + edad + "</p>";
            console.log ( " la edad es de :" + edad );}
        })
        
        }

/** Regex */
/** 06. validad NIF */

function validarNif(){
    
    
        var regexNif = new RegExp("^\\d{8}[A-Z]$");
        var inputNif = document.getElementById("nif");
    
    // cuando pierde el foco es cuando valida
    
    inputNif.addEventListener("blur", ()=> {
    // trim () elemina los espacios en blanco 
    nif = inputNif.value.trim();
    
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
    
    
    
    }
   

/** 07. validad email */
 function validarEmail() {


    /** "/^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/ " */
    /**"^[a-zA-Z0-9]+@(gmail|hotmail)\\.(com|es)$/" */
        var regexEmail =new RegExp("^\\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/ ");
        var email = new String;
        var inputEmail = document.getElementById("email");
       
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
     }
    
    /** 08. validar provincias */
    
    function validarProvincias () {
    
        let provinciasInput = document.getElementById("provincia");
        let texto = provinciasInput.options[provinciasInput.selectedIndex].text;
        let valor = provinciasInput.options[provinciasInput.selectedIndex].value;
    
            provinciasInput.addEventListener("blur", () => {
                console.log("salgo de foco de provincias ")
                console.log ( texto )
                return  alert(`Datos de la opción seleccionada:\n\nTexto: ${texto}\nValor: ${valor}`);
            })
          
        
        /** cada vez que haya un cambio ,la variable funciona  */
        provinciasInput.addEventListener("change", () => {
            console.log("hacemos el cambio -> "+ provinciasInput )
            provincias=texto;
       
        });
    
    
        
    
    }
   
    /** 09. validar fecha  */
    function validarFecha(){
    
    /**^\d{2}/\d{2}/\d{2}$ */
    /** ^\d{1,2}/\d{1,2}/\d{1,2}$" */
        var inputFecha = document.getElementById("fecha");
       /**repasar las \\ en javascript y regex */
        var RegexFecha = new RegExp("^\\d{2}/\\d{2}/\\d{2}$");
      
        console.log("y");
        inputFecha.addEventListener("blur",() => {
            fecha = inputFecha.value.trim();
            if(RegexFecha.test(fecha)){
               
                alert (`Fecha elegida :"\n\n Fecha : ${fecha}\n`)
                console.log("y3");
                contenedorErrores.innerHTML = " <p style = color:green;>  Fecha - la fecha introducida es correcta - " + fecha + "</p>";
            }else{
                contenedorErrores.innerHTML = " <p style = color:red;> Error fecha - la fecha introducida no es correcta - " + fecha + "</p>";
                console.log("y2");
            }
    
    
    
    
        })
    
   
    }
   
    /** 10. validar hora */
    function validarHora (){
        
                var inputHora = document.getElementById("hora");
               /**repasar las \\ en javascript y regex */
                var regexHora = new RegExp("^\\d{2}:\\d{2}$");
              
                console.log("h");
                inputHora.addEventListener("blur",() => {
                   hora = inputHora.value;
                    if(regexHora.test(hora)){
                       
                        alert (`Hora elegida :"\n\n Hora : ${hora}\n`)
                        console.log("h3");
                    }else{
                        contenedorErrores.innerHTML = " <p style = color:red;> Error Hora - la hora introducida no es correcta - " + hora + "</p>";
                        console.log("h2");
                    }
            
            
            
            
                })
    }
   
    /** 11. validar telefono */
    
    function validarTelefono (){
      
            var contenedorErrores = document.getElementById("errores");
                var inputTelefono = document.getElementById("telefono");
               /**repasar las \\ en javascript y regex */
                var regexTelefono = new RegExp("^(\\d{3} ?){2}\\d{3}$");
              
                console.log("t");
                inputTelefono.addEventListener("blur",() => {
                   telefono = inputTelefono.value;
                    if(regexTelefono.test(telefono)){
                       
                        alert (`Hora elegida :"\n\n telefono : ${telefono}\n`)
                        console.log("t3");
                    }else{
                        contenedorErrores.innerHTML = " <p style = color:red;> Error Telefono - el telefono introducida no es correcto - " + telefono+ "</p>";
                        console.log("t2");
                    }
    
                })
    }

    /** 12. validar confirmación  */
    /** metodo confirm en alert para enviar el formulario  */

/** Llamamos a las funciones */

guardarCookie();
perderFoco();
convertirMayuculas();
validarEdad();
validarHora();
validarEmail();
validarNif();
validarProvincias();
validarTelefono();
validarFecha();

})
