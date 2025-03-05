<?php namespace Tarea05; ?>
<?php 
/** Tarea05 -  Conexion con PDO */


$usuario="root";
$host="localhost";
$nombreBD="Jugadores";
$contraseña="";

$conexion ="mysql:host=$host;dbname=$nombreBD;charset=utf8";

try {
    $PDO = new \PDO($conexion, $usuario, $contraseña);

    if(isset($conexion) ){
    echo "<h3>Conexion establecida con la base de datos<h3><br><br>".$conexion;}else { echo " No se ha establecido conexion con la base de datos";}

} catch (\PDOException $e) {
    echo "<h3>Catch : No se ha establecido una base de datos: " . $e->getMessage()."<h3>";
}
?>