<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="style.css">
    <title>Registrar</title>
</head>
<body>
<?php session_start();
require_once __DIR__ . "/../Src/usuario.php"; 
use Tarea07\Usuario;
// Variabless
$usuario="";
$contraseña="";
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Verifica si se han enviado los datos del formulario
    if (isset($_POST["nombre"]) && isset($_POST["contraseña"])) {

        $usuario = $_POST["nombre"];
        $contraseña = $_POST["contraseña"];

        // Guarda en sesión
        $_SESSION["nombre"] = $usuario;
        $_SESSION["pass"] = $contraseña;

        $nuevoUsuario = new Usuario(); 
        $registrado = $nuevoUsuario->insertarUsuario($usuario, $contraseña);

        if ($registrado) {
            echo "<p>Usuario registrado correctamente.</p>";
             header("Location: listado.php");
        } else {
            echo "<p>El nombre de usuario ya existe. Intenta con otro.</p>";
             header("Location: login.php");
        }

        exit;

    } else {
        echo "<p>Faltan datos del formulario.</p>";
    }
}



?>
<div class="contenedorLogin">

<form class="login" action="registrar.php" method="POST">
<h2 class="h2_login">Registrar</h2>
<label for="nombre">Nombre</label>
<input type="text" name="nombre" placeholder="introduce un nombre">
<!-- -->
<label for="nombre">Contraseña</label>
<input type="text" name="contraseña" placeholder="introduce una contraseña">


<input type="submit" value="enviar">
</form>
</div>
<script src="/Script/script.js"></script>
</body>
</html>