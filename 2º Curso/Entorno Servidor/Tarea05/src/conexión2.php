<?php namespace Tarea05; ?>
<?php 
/** Tarea05 -  Conexion con PDO */

class conexion {
    private $PDO;

    public function obtenerConexion(){
    
    $usuario="root";
    $host="localhost";
    $nombreBD="Jugadores";
    $contraseña="";
    $conexion ="mysql:host=$host;dbname=$nombreBD;charset=utf8";

        try {
            $this->PDO = new \PDO($conexion, $usuario, $contraseña);
            
            if(!isset($this->PDO) ){
            echo "<h3> no se ha establecido la conexion con la base de datos<h3><br><br>" ;
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