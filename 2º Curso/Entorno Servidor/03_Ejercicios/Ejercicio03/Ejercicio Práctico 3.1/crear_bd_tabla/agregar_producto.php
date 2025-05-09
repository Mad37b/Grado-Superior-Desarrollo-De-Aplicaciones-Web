<?php
$user = 'tu_usuario';
$host = 'localhost';
$db_name = 'tienda';
$pass = 'tu_contraseña';

$conexion = new mysqli($host, $user, $pass);

if ($conexion->connect_error) {
    die("Error en la conexión: " . $conexion->connect_error);
}

// Crear la base de datos si no existe
$crearDB = "CREATE DATABASE IF NOT EXISTS $db_name";
if ($conexion->query($crearDB) === TRUE) {
    echo "Base de datos '$db_name' creada correctamente o ya existía.";
} else {
    die("Error al crear la base de datos: " . $conexion->error);
}

// Seleccionar la base de datos
$conexion->select_db($db_name);

// Crear la tabla si no existe
$crearTabla = "CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL
)";
if ($conexion->query($crearTabla) === TRUE) {
    echo "Tabla 'productos' creada correctamente o ya existía.";
} else {
    die("Error al crear la tabla: " . $conexion->error);
}

$nombre = $conexion->real_escape_string($_POST['nombre']);
$descripcion = $conexion->real_escape_string($_POST['descripcion']);
$precio = $conexion->real_escape_string($_POST['precio']);

// Insertar el nuevo producto en la tabla
$consulta = "INSERT INTO productos (nombre, descripcion, precio) VALUES ('$nombre', '$descripcion', '$precio')";
if ($conexion->query($consulta) === TRUE) {
    echo "Producto agregado correctamente";
    //header("Location: index.php");
    ?>
    <button type="submit">
    <a href="index.php"> Volver a introducir artículos</a>
    </button>
    <?php 
} else {
    echo "Error al agregar producto: " . $conexion->error;
}

$conexion->close();
