<?php
require_once 'C:\xampp\htdocs\ejercicios\msqli_ejercicios.php\conexion\mysqli_conexion.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Obtener los valores del formulario
    $nombre_tienda = $_POST['nombre_tienda'];
    $telefono_tienda = $_POST['telefono_tienda'];


    // Insertar nueva tienda en la base de datos
    $query = "INSERT INTO tiendas (nombre, tlf) VALUES ('$nombre_tienda', '$telefono_tienda')";
    $result = $conexion->query($query);

    if ($result) {
        echo 'Nueva tienda creada con éxito.';
        ?>
        <br>
        <button type="submit"><a href="formulario_ejercicio_2.php">Volver al formulario</a></button>
        <?php
    } else {
        echo 'Error en la consulta: ' . $conexion->error;
        ?>
        <br>
        <button type="submit"><a href="formulario_ejercicio_2.php">Volver al formulario</a></button>
        <?php
    }

    $conexion->close();
} else {
    // Manejar el caso en el que se accede a este script directamente sin enviar el formulario
    echo 'Acceso no permitido.';
}
?>
