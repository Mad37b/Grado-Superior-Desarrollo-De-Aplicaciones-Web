<?php 
$db = 'proyecto';
$user = 'gestor';
$pass = 'secreto';
$host = 'localhost';

$conexion = new mysqli($host,$user,$pass, $db);



if ($conexion->connect_error)
{
    die("Error de conexión" . $conexion->error);

}
echo 'Conexión establecida <br>';
