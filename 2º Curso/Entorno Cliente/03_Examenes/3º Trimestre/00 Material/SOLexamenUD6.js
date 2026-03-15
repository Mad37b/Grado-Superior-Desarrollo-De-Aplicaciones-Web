/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD6 - 250521
*/

document.addEventListener("DOMContentLoaded", function () {
  calculadora();

  function calculadora() {
    const display = document.getElementById("display");
    const historialLista = document.getElementById("historial");
    const botonDeshacer = document.getElementById("deshacer");

    let operacion = "";
    let ultimoNodo = null;

    function actualizarDisplay() {
      display.textContent = operacion || "0";
    }

    function agregar(valor) {
      operacion += valor;
      actualizarDisplay();
    }

    function borrar() {
      operacion = "";
      actualizarDisplay();
      borrarHistorial();
    }

    function retroceder() {
      operacion = operacion.slice(0, -1);
      actualizarDisplay();
    }

    function calcular() {
      try {
        const resultado = eval(
          operacion.replace(/×/g, "*").replace(/÷/g, "/")
        );
        agregarAlHistorial(`${operacion} = ${resultado}`);
        operacion = resultado.toString();
        actualizarDisplay();
      } catch (error) {
        operacion = "";
        display.textContent = "Error";
      }
    }

    function agregarAlHistorial(texto) {
      const li = document.createElement("li");                 
      const textoNodo = document.createTextNode(texto);        
      li.appendChild(textoNodo);                               
      historialLista.appendChild(li);                         
      ultimoNodo = li;                                         
    }

    function borrarHistorial() {
      while (historialLista.firstChild) {
        historialLista.removeChild(historialLista.firstChild);
      }
      ultimoNodo = null;
    }

    function deshacer() {
      const listaItems = historialLista.children;
      if (listaItems.length === 0) {
        alert("No hay operaciones para deshacer");
        return;
      }

      const ultimo = listaItems[listaItems.length - 1];
      historialLista.removeChild(ultimo);

      ultimoNodo = historialLista.lastElementChild || null;

      if (ultimoNodo) {
        const nodoTexto = ultimoNodo.firstChild;

        if (nodoTexto && nodoTexto.nodeType === Node.TEXT_NODE) {
          const texto = nodoTexto.nodeValue;
          const partes = texto.split(" = ");
          if (partes.length === 2) {
            operacion = partes[1]; 
            actualizarDisplay();
          }
        }
      } else {
        operacion = "";
        actualizarDisplay();
      }
    }


    document.querySelectorAll(".boton").forEach((boton) => {
      boton.addEventListener("click", () => {
        const valor = boton.textContent;
        switch (valor) {
          case "C":
            borrar();
            break;
          case "←":
            retroceder();
            break;
          case "=":
            calcular();
            break;
          default:
            agregar(valor);
            break;
        }
      });
    });

    botonDeshacer.addEventListener("click", deshacer);
  }
});

