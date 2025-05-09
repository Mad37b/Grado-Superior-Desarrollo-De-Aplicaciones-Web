
<?php 
/*Recupera todas las tiendas y muéstralas 
*/

require_once 'C:\xampp\htdocs\ejercicios\msqli_ejercicios.php\conexion\mysqli_conexion.php';

$consulta ="SELECT * FROM tiendas";
$resultado = $conexion->query($consulta);
echo '<br>';
if($resultado){
    while ($row = $resultado->fetch_array()){
        echo ' ID: ' . $row['id'] . ', Nombre: ' . $row['nombre'] . ', Teléfono: ' . $row['tlf'] . '<br>';
    }
} else {
    echo 'Error en la consulta: ' . $conexion->error; 
}

$conexion->close();