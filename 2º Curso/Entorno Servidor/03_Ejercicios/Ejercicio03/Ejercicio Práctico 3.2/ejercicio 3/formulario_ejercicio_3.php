<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Nueva Tienda</title>
</head>
<body>

<form action="mysqli_ejercicio_3.php" method="post">
    <label for="nombre_tienda">Nombre de la Tienda:</label>
    <input type="text" id="nombre_tienda" name="nombre_tienda" required>

    <label for="telefono_tienda">Teléfono de la Tienda:</label>
    <input type="text" id="telefono_tienda" name="telefono_tienda">

    <button type="submit">Agregar Nueva Tienda</button>
</form>

</body>
</html>

