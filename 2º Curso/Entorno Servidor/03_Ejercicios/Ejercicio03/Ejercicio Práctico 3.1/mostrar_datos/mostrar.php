<!-- mostrar.php -->
<?php
$user = 'gestor';
$host = 'localhost';
$db = 'ejercicio3';
$pass = '';

$conexion = mysqli_connect($host, $user, $pass, $db);

if (!$conexion) {
    die("Error en la conexión: " . mysqli_connect_error());
}

$consulta = "SELECT * FROM ejerciciospracticos3";
$resultado = mysqli_query($conexion, $consulta);

if ($resultado) {
    while ($fila = mysqli_fetch_assoc($resultado)) {
        echo "ID: " . $fila['ID'] . "<br>";
        echo "Nombre: " . $fila['Nombre'] . "<br>";
        echo "Correo: " . $fila['correo'] . "<br>";
        echo "-------------------------<br>";
    }
} else {
    echo "Error al mostrar usuarios: " . mysqli_error($conexion);
}

mysqli_close($conexion);
?>