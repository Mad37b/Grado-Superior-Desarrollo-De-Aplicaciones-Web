<?php
/** está página es el "action" del formulario para crear un jugador. Controlaremos errores para no introducir un dorsal que ya existe, que nombre y apellidos no esté vacios**/
   
/** será un controlador de crear Jugadores con insert */
require_once __DIR__. "/../src/jugador.php";
require_once __DIR__. "/../src/config.php";
require_once __DIR__. "/../src/conexión.php";

use Tarea05\jugador;
use Tarea05\config;
use Tarea05\conexion;

class insertOneJugadorController{
public $pdo;

function __construct($pdo)
{
$this ->pdo = $pdo;
}
 
function agregarJugador($nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam){

/** instancia de la clase Jugador */

$insertarJugador = new jugador($this->pdo);
$insertarJugador->insertarJugadores($nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam);

 }
 function actualizarJugador($nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam){
  $actualizarJugador = new jugador($this->pdo);
  $actualizarJugador->actualizarJugadores($nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam);

 }

}

    if ( $_SERVER["REQUEST_METHOD"] == "POST"){

        $nombre = $_POST["nombre"] ??"sin asignar";
        $apellido = $_POST["apellido"] ?? "sin asignar";
        $dorsal = $_POST["dorsal"] ?? " sin asignar";
        $posicion = $_POST ["posicion"] ?? "sin asignar";
        $codigoBarras = $_POST["codigoBarras"] ?? " sin asignar";
        echo "<h3> Muestro los datos que me llegan del Formulario Vista </h3>
        <p> " . $nombre ."-".$apellido." - ".$dorsal." - ". "- ".$posicion." - ".$codigoBarras ." - "."</p>";

    /** Creo la conexion para añadir jugadores */
      $conexion = new conexion ();
      $pdo = $conexion ;
/** Creo la instancia para añadir jugadores */
        $añadirJugador = new insertOneJugadorController($pdo);
        $nuevoJugador = $añadirJugador->agregarJugador($nombre,$apellido,$posicion,$dorsal,$codigoBarras);

        // usar update para actualizar los datos
        /**$actualizarJugador = new insertOneJugadorController($pdo);
        $modificarJugador = $actualizarJugador->actualizarJugador($nombre,$apellido,$posicion,$dorsal,$codigoBarras);**/

// CONTROL DE ERRORES Y VALIDACIONES
 /**Controlaremos errores para no introducir un dorsal que ya existe, que nombre y apellidos no esté vacios.**/
/** Evitar que se inserten datos cada vez que se reinicie la pagina */
 /** controlar las repeticiones  */
        if (empty($dorsal)){

            $dorsal ="sin asignar" ; 
          
          }

           if ( isset($dorsal)){
            $dorsal = $_POST["dorsal"];


           }

           if (empty($nombre)){

             $nombre = " vacio";
           }

           if (empty($apellido)){

            $apellido = " vacio ";
           }
             /** Vista */
           $consultarJugadores = new jugador();
           $jugadores = $consultarJugadores->obtenerJugadores();
       
       
           echo $blade->view()->make('vistajugadores', ['jugadores' => $jugadores,"codigo"=>$codigoBarras])->render();
    }

 
    
 