// Tarea06 DWEC
document.addEventListener("DOMContentLoaded" , () => { 

   // Variables de la paleta
  
  let tablaPaleta = document.getElementById("paleta"); // tabla
  //llamar a la tabla buen hijo 
  let celdasPaletaTabla = tablaPaleta.getElementsByTagName("td"); // celdas de la primera tabla 

  // Variables del pincel
  let pincelSeleccionado = document.getElementById("pincel"); // celda texto color

  // Variable de la tabla
  let tablero = document.getElementById("zonadibujo");
  let colorSeleccionado = null;
  

  // array colores y colores
  const colores = {
    "color1": "yellow",  // Amarillo
    "color2": "green",   // Verde
    "color3": "black",   // Negro
    "color4": "red",     // Rojo
    "color5": "blue",    // Azul
    "color6": "white"    // Blanco
};


    function seleccionarColorPaleta (index){
      // 1. iteramos cada celda
      /** Celdas de color */
      console.log(celdasPaletaTabla)
      for ( let celda of celdasPaletaTabla){
          celda.addEventListener("click",(eventoColor) =>{     
              console.log(celda)
              for (let otraCelda of celdasPaletaTabla) {
                  otraCelda.classList.remove("seleccionado");
              } 
       
              if(celda.classList.contains("seleccionado")){
                  celda.classList.remove("seleccionado");
                  console.log("entro aqui 2");
                  pincelSeleccionado.innerHTML = " Color desactivado ";
              }else{
                celda.classList.add("seleccionado");
                pincelSeleccionado.innerHTML = " Color activado ";
                let claseColor = celda.classList[0];
                colorSeleccionado = colores[claseColor];
           
                   
                       }
          
      }); 
      // Cuando se pulsa fuera de la tabla, 

  }
  }

// 3 . Creamos el elemento del tablero de dibujo

function crearTablero (){
 
  const tabla =document.createElement("table");
  let esPresionado = false;
  /**  */
  
  tabla.style.border="2px solid black";
  tabla.style.margin="0 auto";
  tabla.style.borderCollapse="collapse";
  // columnas
  for(let i = 0; i<30 ; i++){
      const fila = document.createElement("tr");
      fila.style = "width:100px";
      // filas 
      for(let j = 0; j<30 ; j++){
         
          const celda = document.createElement("td");
          celda.style.width="20px";
          celda.style.height="20px";
          celda.style.border="2px solid black";
          fila.appendChild(celda);

          // 4 . Evento pintar
          // si se presiona el raton , sera verdadero y se le pasa a la condicional 
          celda.addEventListener("mousedown",(eventoPresionar)=>{
           
            console.log("he dado click a la tabla paint");
            esPresionado = true;
            console.log ("he presionado - " + esPresionado);
            
          });
          celda.addEventListener("mouseup", (eventoParar) => {
            esPresionado = false; // Dejar de pintar cuando se suelta el ratón
           
            console.log ("he dejado de presionar - " + esPresionado)

        });
          celda.addEventListener("mousemove", (eventoMover) => {
            if ( colorSeleccionado && esPresionado ) {
                celda.style.backgroundColor = colorSeleccionado;
                
            }

            if ( eventoMover.buttons === 0){
              esPresionado = false;
              console.log("se ha presionado fuera o mal X")
            }
        });     
      }
      tabla.appendChild(fila);
  }
  tablero.appendChild(tabla);
  }
  crearTablero();
  seleccionarColorPaleta();
});
