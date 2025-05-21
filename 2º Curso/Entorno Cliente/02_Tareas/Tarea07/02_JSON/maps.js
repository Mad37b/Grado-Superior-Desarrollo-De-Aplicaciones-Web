/**
 *  Tarea 07 : Ajax y XML
 * 
 * 1. Creamos el mapa ( google maps )
 * 2. creamos los marcadores y array de labels marcadores
 * 3. creamos los marcadores personalizados y nos devuelven los datos , damos la opcion de borrar 
 * 4. recogemos los datos por array 
 * 5. enviamos los datos a PHP 
 * 6. codificamos los datos en XML 
 * 7.los devolvemos mediante un boton en html 
 */

document.addEventListener("DOMContentLoaded",()=>{
async function initMap() {
    // 1.  Librerias Google Maps
    const { Map, InfoWindow } = await google.maps.importLibrary("maps");
    const { AdvancedMarkerElement, PinElement } = await google.maps.importLibrary("marker");
    // 2. Creamos el mapa
    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 3,
      center: { lat: 40.423045, lng:  -3.689083}, //España, Madrid 
      mapId: "DEMO_MAP_ID",
    });
    const infoWindow = new google.maps.InfoWindow({
      content: "Mapa con Ajax",
      disableAutoPan: true,
    });
    // Create an array of alphabetical characters used to label the markers.
    const labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const locations = [{lat: 27.986065, lng:86.922623}]; // everest
    // Add some markers to the map.
    const markers = locations.map((position, i) => {
      const label = labels[i % labels.length];
      const pinGlyph = new google.maps.marker.PinElement({
        glyph: label,
        glyphColor: "blue",
      });
      const marker = new google.maps.marker.AdvancedMarkerElement({
        position,
        content: pinGlyph.element,
      });
  
      // markers can only be keyboard focusable when they have click listeners
      // open info window when marker is clicked
      marker.addListener("click", () => {
        infoWindow.setContent(position.lat + ", " + position.lng);
        infoWindow.open(map, marker);
      });
      return marker;
    });
  
    const markerCluster = new markerClusterer.MarkerClusterer({ markers, map });
    // Add a marker clusterer to manage the markers.
    //new MarkerClusterer({ markers, map });
  
// ----------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------

// 2. Mis Propios marcadores
    // Creando marcador pulsado
    // Variables
  let borrarMarcadores = document.getElementById("borrarMarcadores");
  let arrayMarcadores = []
    function crearMarcador(nombre,latitud,longitud){
      const etiquetas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      let Nombre =nombre;
      const Latitud = parseFloat(latitud);
      const Longitud = parseFloat(longitud);

  if (isNaN(Latitud) || isNaN(Longitud)) {
    console.error("Coordenadas inválidas:", latitud, longitud);
    return;
  }
      let ubicacion = [{ lat: Latitud, lng: Longitud }];

      // Caracteristicas del grupo de marcadores

      const marcadores = ubicacion.map((position,i) => {
        const etiqueta = etiquetas[i % etiquetas.length];
        const pinGlyph = new google.maps.marker.PinElement({
          glyph: etiqueta,
          glyphColor: "blue",
        });


        const marcador = new google.maps.marker.AdvancedMarkerElement({

  
          position:{ lat:latitud,lng:longitud},        // aqui consigo los datos de latitud y longitud 
          map:map,
          title:nombre,
          content: pinGlyph.element,
        });
        
        marcador.addListener("gmp-click",()=>{
          infoWindow.setContent(`<strong>${nombre}</strong><br>Lat: ${latitud}<br>Lng: ${longitud}`);
          infoWindow.open(map,marcador)

        })




        return marcador;
      });
      
      // Resultado Marcadores Personalizados  , Almacenamiento y envio de datos 
      let contador =0;
      arrayMarcadores.push({Nombre: nombre, Latitud: latitud, Longitud: longitud});
      // enviamos los datos a XML
      enviarDatosJSON(Nombre,Latitud,Longitud);
      //console.log("Marcador :"+Nombre+" creado en: " +  Latitud + " - " + Longitud)
      console.log("contador array" + contador)
      console.log(arrayMarcadores);
    }

    function imprimirMarcador(evento){
      const etiquetas ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // aun sin usar
      const lat = evento.latLng.lat();
      const long = evento.latLng.lng();
      crearMarcador("Marcador personalizado", lat, long);
    }
    borrarMarcadores.addEventListener("click",()=>{
      arrayMarcadores.splice(0, arrayMarcadores.length);


    })

map.addListener("click",imprimirMarcador)

// AJAX con GET y JSON
const peticion = new XMLHttpRequest();

function enviarDatosJSON(Nombre,Latitud,Longitud){


  let datos ="nombre=" + encodeURIComponent(Nombre) +"&latitud="+encodeURIComponent(Latitud)+"&longitud="+encodeURIComponent(Longitud); 
  peticion.open('GET', "http://localhost/ejerciciosEntornoCliente/Tarea07/02_JSON/lista.php?"+datos);
  peticion.send();
  peticion.addEventListener("load",cargarTabla);// cargada
  console.log("peticion Ajax enviada");
const div2 = document.getElementById("resultados");
div2.innerHTML = ""; 
const p2=document.createElement("p");
p2.textContent="Cargando...";
div2.appendChild(p2);

}

// hacer un boton que muestre los datos del ajax, si los datos estan vacio , mensaje , si hay un dato , muestra tabla , si hay varios datos , añade igualmente  
// 3. Resultado de Ajax



function cargarTabla () {

if(!peticion.responseText){
console.warn("Los datos del xml no han sido recibidos");
const nodoParrafo = document.createElement("p");
nodoParrafo.node
nodoParrafo.textContent="Los datos no han sido Cargados, haz click en cualquier parte del mapa para establecer las coordenadas"
nodoParrafo.setAttribute("class","no-cargado");
const div1 = document.getElementById("resultados");
div1.appendChild(nodoParrafo);
return;
}


  //document.getElementById("resultados").innerHTML = peticion.responseText ; // propiedad del xmlhttprequest
  let tabla =""
  let contenido = JSON.parse(peticion.responseText);
  tabla += "<table>";
  tabla +="<thead>" + "<tr>";
  tabla +="<th>" + "Nombre" + "</th>" + "<th>" +"Latitud"+ "</th>" +  "<th>" + "Longitud" + "</th>"+ "<tr>"+"</thead>";
  tabla +="<tbody>"
  for (let i = 0 ; i < contenido.length; i++){
    let nombre = contenido[i].nombre; 
    let latitud = contenido[i].latitud;
    let longitud = contenido[i].longitud;
   
    tabla += `<tr><td>${nombre}</td><td>${latitud}</td><td>${longitud}</td></tr>`;
   
  }

 
    tabla += "</tbody>"+"</table>"
 
    document.getElementById("resultados").innerHTML = tabla;
}

cargarTabla();
  }//fin
 
initMap();//Google maps


// si existe archivo xml , cargar los datos
// crear metodo cargarDatos 


});
