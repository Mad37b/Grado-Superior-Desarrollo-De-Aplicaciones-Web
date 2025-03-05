<?php

/**require_once __DIR__. "/../src/jugador.php";**/
require_once __DIR__. "/../src/config.php";

 
$instalacion = "Listo para la instalación";
/**Carga la vista "vinstalacion.php" básicamente un botón para ir a "crearDatos.php" y crearnos datos de ejemplo. */


echo $blade->view()->make('vInstalación', ['instalacion' => $instalacion,'name' =>'Adolfo'])->render();
?>