<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<!-- -->
<form action="usuario.php" method="get" name="datos_usuario"  onsubmit="return validar_email()">
<input type="text" id="email" />
</form>

<script>

function validar_email() {
    valor = document.getElementById("email").value;
    pos_arroba = valor.indexOf("@");
    pos_punto = valor.lastIndexOf(".");
    if (pos_arroba < 1 || pos_punto < pos_arroba+2 || pos_punto+2>=valor.length) {
        alert('Dirección de correo no válida.');
        return false;
    }
    return true;
}
    </script>

</body>
</html>