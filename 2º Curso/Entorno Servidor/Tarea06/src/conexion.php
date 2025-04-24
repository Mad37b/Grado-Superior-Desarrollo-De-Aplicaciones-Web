<?php
namespace Tarea06;

use PDO;

/** Tarea05 -  Conexion con PDO */


class conexion {
    private $PDO;

    public function obtenerConexion(){
    
    $usuario="gestor";
    $host="localhost";
    $nombreBD="tarea6";
    $contraseña="";
    $conexion ="mysql:host=$host;dbname=$nombreBD;charset=utf8";

        try {
            $this->PDO = new \PDO($conexion, $usuario, $contraseña);
            echo "<h3> Se ha establecido la conexion </h3>" ;
            if(!isset($this->PDO) ){
            // echo "<h3> no se ha establecido la conexion con la base de datos<h3><br><br>" ;
            }

        } catch (\PDOException $e) {
            echo "<h3>Catch : No se ha establecido una base de datos: " . $e->getMessage()."<h3>";
        }
        return $this->PDO;
    }

}
$conexion = new conexion;
$establecer = $conexion->obtenerConexion();

?>