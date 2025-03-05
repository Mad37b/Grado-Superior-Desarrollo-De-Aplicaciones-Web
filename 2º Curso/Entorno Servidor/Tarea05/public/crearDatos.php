<h1> Prueba crear Datos de ejemplo </h1>
<!-- Establecer los primeros datos sin no hay nada en la base de datos -->
 <!-- insertar datos de forma directa sin Formulario -->
<?php 

require_once __DIR__ ."/../src/conexión2.php";

use Tarea05\conexion;






class controladorjugadorNuevo {


public $conexion;
public $Conexion;

public function __construct() {
    $establecerConexion = new conexion();
    $Conexion = $establecerConexion-> obtenerConexion();
    $this->conexion = $Conexion;

}

    function agregarUnJugador (){

        try{
            
            $insertsql = "INSERT INTO `listajugadores` (`Nombre` ,`Apellido`, `Dorsal`,`Posición`,`Código_de_barras`) VALUES('Aduriz','Vazquez',05,'Delantero',1256344621)";
            $estado = $this->conexion->prepare($insertsql);
            $estado -> execute ();
        }catch (\PDOException $e){
            
                echo "<h3>Catch : No se ha establecido una base de datos:_ " . $e->getMessage()."<h3>";
            }
    }
}






/** vista plantilla  */




?>