<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="style.css">
    <title>Login</title>
</head>
<body>
<?php session_start(); 

if(isset($_SESSION["usuario"])){
header("Location:listado.php");

}
?>
<div class="contenedorLogin">

<form id="form" class="login" action="listado.php" method="POST">
<h2 class="h2_login">Login</h2>
<label for="nombre">Nombre</label>
<input id="nombre" type="text" name="nombre" placeholder="introduce un nombre">
<!-- -->
<label for="nombre">Contraseña</label>
<input id="contraseña" type="text" name="contraseña" placeholder="introduce una contraseña">


<input type="submit" value="enviar">
</form>
</div>
<script src="/..//ejerciciosEntornoServidor/Tarea07/Script/script.js"></script>
</body>
</html>