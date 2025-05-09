  // Login 
document.addEventListener("DOMContentLoaded",()=>{
const form = document.getElementById("form");

  form.addEventListener("submit",function enviarAjax(event){
    let nombre =document.getElementById("nombre").value;
    let contraseña = document.getElementById("contraseña").value; 

    // lo hacemos aqui para que al enviar procese la peticion 
    fetch("login.php",{
      //Definimos las propiedades del fetch
      method:'POST',
      mode:'cors',
      cache:'default',
      //credentials:'same-origins',
      headers:{
      
        'Content-type':'application/json'
      }
      
      // obtengo los datos del formulario 
      
      
      });
    event.preventDefault(); // hecho 
    console.log("los datos han sido enviados por ajax/fetch");
    console.log(nombre);
    console.log(contraseña);
  })

  
});
  // Listado