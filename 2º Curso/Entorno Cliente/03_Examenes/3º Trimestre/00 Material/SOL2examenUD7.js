/*  
    Desarrollo web en entorno cliente
    DAW Distancia - Curso 24-25
    Examen UD7 - 250521
*/

document.addEventListener("DOMContentLoaded", function () {

 // Crear la solicitud AJAX
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost/municipios.php", true);

    xhr.onload = () => {
            let tabla = document.getElementById("tabla");
        
            const filaCero = document.createElement('tr');
            const encabezadoNombre = document.createElement('th');
                encabezadoNombre.textContent = "Municipio";
            const encabezadoGentilicio = document.createElement('th');
                encabezadoGentilicio.textContent = "Gentilicio";
            const encabezadoPoblacion = document.createElement('th');
                encabezadoPoblacion.textContent = "Población";
            const encabezadoExtension = document.createElement('th');
                encabezadoExtension.textContent = "Extensión [Km2]";
            
            filaCero.appendChild(encabezadoNombre);
            filaCero.appendChild(encabezadoGentilicio);
            filaCero.appendChild(encabezadoPoblacion);
            filaCero.appendChild(encabezadoExtension);

            tabla.appendChild(filaCero);

            let datos = JSON.parse(xhr.responseText);

            datos.forEach((municipio) => {
                const fila = document.createElement('tr');
 
                const celdaNombre = document.createElement('td');
                const textoNombre = document.createTextNode(municipio.nombre);
                celdaNombre.appendChild(textoNombre);
                fila.appendChild(celdaNombre);

                const celdaGentilicio = document.createElement('td');
                const textoGentilicio = document.createTextNode(municipio.gentilicio);
                celdaGentilicio.appendChild(textoGentilicio);
                fila.appendChild(celdaGentilicio);

                const celdaPoblacion = document.createElement('td');
                const textoPoblacion = document.createTextNode(municipio.poblacion);
                celdaPoblacion.appendChild(textoPoblacion);
                fila.appendChild(celdaPoblacion);

                const celdaExtension = document.createElement('td');
                const textoExtension = document.createTextNode(municipio.extension_km2);
                celdaExtension.appendChild(textoExtension);
                fila.appendChild(celdaExtension);

                tabla.appendChild(fila);

            })

    };

    xhr.send();
});