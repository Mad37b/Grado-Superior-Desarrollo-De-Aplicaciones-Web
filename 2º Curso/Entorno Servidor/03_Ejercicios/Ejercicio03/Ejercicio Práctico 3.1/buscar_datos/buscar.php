<!-- buscar.php -->
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

$consulta = "SELECT * FROM ejerciciospracticos3 WHERE nombre='$nombre'";
$resultado = mysqli_query($conexion, $consulta);

if ($resultado) {
    while ($fila = mysqli_fetch_assoc($resultado)) {
        echo "ID: " . $fila['ID'] . "<br>";
        echo "Nombre: " . $fila['Nombre'] . "<br>";
        echo "Correo: " . $fila['correo'] . "<br>";
        echo "-------------------------<br>";
    }
} else {
    echo "Error al buscar usuario: " . mysqli_error($conexion);
}

mysqli_close($conexion);
?>
