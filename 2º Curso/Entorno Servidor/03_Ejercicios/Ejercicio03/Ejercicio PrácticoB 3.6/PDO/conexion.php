<?php
namespace Apuntes;

use PDO;

/** Tarea07 -  Conexion con PDO */


class Conexion {
    private $PDO;

    public function obtenerConexion(){
    
    $usuario="gestor";
    $host="localhost";
    $nombreBD="tarea07";
    $contraseña="";
    $conexion ="mysql:host=$host;dbname=$nombreBD;charset=utf8";

        try {
            
   
            if(!isset($this->PDO) ){
           
            $this->PDO = new \PDO($conexion, $usuario, $contraseña);
            $this->PDO->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING);
            echo "<h3> Se ha establecido la conexion</h3><br><br>" ;
            }

        } catch (\PDOException $e) {
            echo "<h3>Catch : No se ha establecido una base de datos: " . $e->getMessage()."<h3>";
        }
        return $this->PDO;
    }

}

$conexion = new Conexion ();
$nuevaConexion = $conexion->obtenerConexion();
print_r( $nuevaConexion);
?>