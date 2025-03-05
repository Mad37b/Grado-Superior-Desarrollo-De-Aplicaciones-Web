<a href="generarCode.php" class="btn btn-primary">Generar Código de Barras</a>
<?php
require_once __DIR__. "/../src/config.php";
use Tarea05\jugador;

/**  Es el formulario para crear el jugador. Llama a la vista: "vcrear.blade.php".
 *  A parte de los botones normales pondremos un botón para generar un código de barras válido ("href" a la página "generarCode.php"). 
 * El campo para el código de barra lo pondremos de sólo lectura (atributo "readonly")*/




class controllerForm {

function __construct(){
  
}}




 /** vista  
  * 
    * plantilla de vista

 **/




echo $blade->view()->make('vcrear')->render();

 ?>