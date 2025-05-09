<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Stock</title>
</head>
<body>

<form action="mysqli_ejercicio2.php" method="post">
    <label for="producto_id">ID del Producto:</label>
    <input type="text" id="producto_id" name="producto_id" required>

    <label for="tienda_id">ID de la Tienda:</label>
    <input type="text" id="tienda_id" name="tienda_id" required>

    <button type="submit">Consultar Stock</button>
</form>

</body>
</html>
