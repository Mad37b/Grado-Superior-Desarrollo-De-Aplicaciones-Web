<!-- procesar.php -->
<?php
$user = 'gestor';
$host = 'localhost';
$db = 'ejercicio3';
$pass = '';

$conexion = mysqli_connect($host, $user, $pass, $db);

if (!$conexion) {
    die("Error en la conexión: " . mysqli_connect_error());
}

$nombre = $_POST['nombre'];
$correo = $_POST['correo'];

$consulta = "INSERT INTO ejerciciospracticos3 (nombre, correo) VALUES ('$nombre', '$correo')";
if (mysqli_query($conexion, $consulta)) {
    echo "Usuario agregado correctamente";
} else {
    echo "Error al agregar usuario: " . mysqli_error($conexion);
}

mysqli_close($conexion);
?>
