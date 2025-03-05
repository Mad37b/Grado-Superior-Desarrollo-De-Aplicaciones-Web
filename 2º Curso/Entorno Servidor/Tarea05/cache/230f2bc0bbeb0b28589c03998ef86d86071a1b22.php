<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"   href="style.css">
    <title>Crear Jugadores Formulario</title>
</head>
<body class="form">
<?php
    session_start(); // Iniciar sesión en Blade
?>
<h1> Crear Jugadores Vista Formulacio </h1>

<div class="contenedor-padre">

    <div class="contenedor-hijo">

        <div class="contenedor-Formulario">

            <form action="/public/crearJugador.php" method="POST">

                <label>Nombre
                <input type="text" placeholder="introduce un nombre" name="nombre"><br><br>
                <label>Apellido
                <input type="text" placeholder="introduce un apellido" name = "apellido"><br><br>
                <label>Dorsal
                    <input type="text" placeholder="introduce un dorsal" name="dorsal"><br><br>
                <label>Posición
                    <input type="text" placeholder="introduce una posición" name="posicion"><br><br>
                <label> Cógido de barras 
                    <input type="text" placeholder="" name="codigoBarras" value = "" readonly><br><br>
                   
                <input type="submit" value="Crear">
                



            </form>
            <a href=""><button>Limpiar</button></a>
            <a href=""><button>Volver</button></a>
            <a href="public/generarCode.php"><button>Generar Barcode</button></a>

        </div>


    </div>


</div>
    
</body>
</html>