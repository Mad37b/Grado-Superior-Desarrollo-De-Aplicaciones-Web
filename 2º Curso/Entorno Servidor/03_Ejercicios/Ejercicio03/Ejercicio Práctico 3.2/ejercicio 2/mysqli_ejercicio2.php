<?php
/*
Recuperar el stock de un producto en una tienda específica. Los datos se tienen que introducir desde un formulario
*/

require_once 'C:\xampp\htdocs\ejercicios\msqli_ejercicios.php\conexion\mysqli_conexion.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    // Obtener los valores del formulario
    $producto_id = trim($_POST['producto_id']);
    $tienda_id = trim($_POST['tienda_id']);


    // Consultar el stock en la base de datos
    $query = "SELECT * FROM stocks WHERE producto = $producto_id AND tienda = $tienda_id";
    $result = $conexion->query($query);

    if ($result) {
        $row = $result->fetch_assoc();
        if ($row) {
            echo 'Unidades en stock: ' . $row['unidades'];
            ?>
            <br>
            <button type="submit"><a href="formulario_ejercicio_2.php">Volver al formulario</a></button>
            <?php
        } else {
            echo 'No se encontró stock para el producto y tienda proporcionados.';
            ?>
            <br>
            <button type="submit"><a href="formulario_ejercicio_2.php">Volver al formulario</a></button>
            <?php
        }
    } else {
        echo 'Error en la consulta: ' . $conexion->error;
    }

    $conexion->close();
} else {
    // Manejar el caso en el que se accede a este script directamente sin enviar el formulario
    echo 'Acceso no permitido.';
}
?>
