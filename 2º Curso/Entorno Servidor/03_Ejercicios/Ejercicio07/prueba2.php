<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

//Versión 3.5.0 jQuery CDN jQuery
<script src="https://code.jquery.com/jquery-3.5.0.min.js"integrity="sha256xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ="crossorigin="anonymous"></script>

 <script>
 function validar_email() {
    valor = document.getElementById("email").value;
    // Aquí iría el código de validación
    $.ajax({
        type: "POST", url: "email.php", data: "email=" + valor,
        statusCode: {
        404: function() { alert('Página no encontrada'); }
        },
        success: function(result) { alert( "Resultado: " + result ); }
    });
    return false;
}
    </script>
</body>
</html>