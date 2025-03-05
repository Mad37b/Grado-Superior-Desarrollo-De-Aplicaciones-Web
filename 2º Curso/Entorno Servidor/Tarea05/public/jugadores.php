<?php
require_once __DIR__ . '/../src/config.php'; // Subir un nivel y acceder a src/config.php
require_once __DIR__ . '/../src/jugador.php';
require_once __DIR__ . '/../public/generarCode.php';
use Tarea05\jugador;
use Tarea05\conexion;

/** llama a la vista vjugadores.php */
/**echo $blade->view()->make('vistaJugadores')->render();**/
/**Llama a la vista "vjugadores.php" Muestra en una tabla los datos de los jugadores. Tiene un botón crear que llama al formulario para crear un jugador nuevo. Si un jugador NO tiene dorsal mostraremos "Sin asignar".
*/

class controllerJugadores {

    public $pdo;

    public function controladorObtener (){
        
        $jugador = new jugador($this->pdo);
        $jugadores = $jugador->obtenerJugadores();
        return $jugadores;
    }
}

/** Paso para la lista de jugadores de public a vista */
$conexion = new conexion();
$pdo = $conexion->obtenerConexion();

$controller = new controllerJugadores($pdo);
$jugadores = $controller->controladorObtener();

/** */
$controllerCodigo = new controladorCodigoBarras();
$controllerCodigo->establecerCodigoBarras();
$codigo = $controllerCodigo->mostrarCodigoBarras();

/** Vista */


echo $blade->view()->make('vistaJugadores', ['jugadores' => $jugadores,'codigo' => $codigo])->render();

?>