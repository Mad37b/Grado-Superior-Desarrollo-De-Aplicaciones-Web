<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Jugadores</title>
</head>
<body>
<h1 style="text-align: center;"> Index De Jugadores</h1>
<h3> Esta es la pagina principal </h3>
<?php
/**Es la página de inicio, si la tabla jugadores no tiene datos llamará a "instalacion.php"
 * 
 *  para crearnos unos datos de ejemplo, si los tiene cargará la página "jugadores.php"**/
require_once "../src/jugador.php";
require_once "../src/conexión.php";
require_once "../src/conexión2.php";

use Tarea05\jugador;
use Tarea05\conexion;

/** si los datos existen me diriges a la tabla si no haces la consulta  */

class controlladorIndex{
    
    public $PDO ;

 function controllerIndex(){
    $conexion = new conexion();
    $pdo = $conexion->obtenerConexion();
    $indexTabla = new jugador($pdo);
    $this->PDO = $pdo;

return $jugadores = $indexTabla->obtenerJugadores();
var_dump($jugadores);

 }
}
/**vista */ /** pasar los datos obtenidos de la consulta  */

$controladorIndex = new controlladorIndex();
$jugadorIndex = $controladorIndex->controllerIndex();

/** Si tablaJugadores tiene datos , vamos a jugadores.php , si no vamos a instalación */
if (empty($jugadorIndex)){
    echo" <script> alert('nos vamos a instalación en 3 segundos');</script>";
    echo "<script> console.log ('estoy en instalación en 3 segundos' )</script>";
    /** header("Refresh:3; url=instalacion.php");**/
    echo "<button ><a href='instalacion.php'>  vamos instalacion</a> </button>";
    echo var_dump($jugadorIndex);
    exit();
   
}else{
    echo" <script> alert('nos vamos a la tabla de jugadores');</script>";
    echo "<script> console.log ('estoy en jugadores en 3 segundos' )</script>";
    /**header("Refresh:3; url=jugadores.php");**/
    echo "<button ><a href='jugadores.php'>  vamos jugadores</a> </button>";
    echo var_dump($jugadorIndex);
    exit();
}

?>

</body>
</html>


