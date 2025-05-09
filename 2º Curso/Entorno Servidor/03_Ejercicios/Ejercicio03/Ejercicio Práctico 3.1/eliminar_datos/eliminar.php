<!-- eliminar.php -->
<?php
$user = 'gestor';
$host = 'localhost';
$db = 'ejercicio3';
$pass = '';

$conexion = mysqli_connect($host, $user, $pass, $db);

if (!$conexion) {
    die("Error en la conexión: " . mysqli_connect_error());
}

$id = $_POST['id'];

$consulta = "DELETE FROM usuarios WHERE id=$id";
if (mysqli_query($conexion, $consulta)) {
    echo "Usuario eliminado correctamente";
} else {
    echo "Error al eliminar usuario: " . mysqli_error($conexion);
}

mysqli_close($conexion);
?>
