<!-- actualizar.php -->
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
$nuevo_correo = $_POST['nuevo_correo'];

$consulta = "UPDATE ejerciciospracticos3 SET correo='$nuevo_correo' WHERE id=$id";
if (mysqli_query($conexion, $consulta)) {
    echo "Correo actualizado correctamente";
} else {
    echo "Error al actualizar correo: " . mysqli_error($conexion);
}

mysqli_close($conexion);
?>
