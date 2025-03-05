<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>vista Instalación</title>
</head>
<body>

<h1 style="text-align: center;">Instalación</h1>
<form action="crearDatos.php" method="POST">


<input style="text-align: center; text-align: center;
    width: 200px;
    height: 50px;
    margin-left: 550px;
    justify-content: center;
    border-radius: 10px;
    box-shadow: 2px 2px 2px black;
    align-content: center;" type="submit" value="Crear Datos de ejemplo">
</form>
    
<!-- Pruebo la plantilla y blade -->
{{$name}}
{{$instalacion}}

</body>
</html>