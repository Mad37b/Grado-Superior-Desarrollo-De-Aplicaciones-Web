// # Ejercicio 1  - click y doble click
document.addEventListener("DOMContentLoaded" , () => {

    const pulsar = document.getElementById("simpleClickBtn");
    const doblePulsar =  document.getElementById("doubleClickBtn");
    const mensaje = document.getElementById("clickMessage");
    const div = document.getElementById("container");


    pulsar.addEventListener("click" , ()=>{

        mensaje.innerHTML="has pulsado una vez";

    });
    doblePulsar.addEventListener("dblclick" , ()=>{
   

            mensaje.innerHTML="has pulsado dos veces";
            return;
      
      
    });
});