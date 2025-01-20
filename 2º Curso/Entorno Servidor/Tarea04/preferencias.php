<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="FontAwesome/fontawesome-free-6.7.2-web/css/font-awesome.min.css">
    <link rel="stylesheet" href="FontAwesome/css/all.min.css">
    <link rel="stylesheet" href="FontAwesome/fontawesome-free-6.7.2-web/css/all.min.css">


    <link rel="stylesheet" href="style.css">
    <!--https://fontawesome.com/v4/get-started/-->
    <title>preferencias</title>
</head>
<body>

<!-- Crear un formulario para que el usuario pueda establecer sus preferencias guardadas en una sesion del usuario  -->
<!-- 1. - Declarar las variables del script de preferencias.php -->
<?php 
session_start();


session_status();
echo "el estado de la sesión ;" . session_status()."<br><br>";


$guardar = false ; 


$usuarioSession = [];


if ($_SERVER["REQUEST_METHOD"] == "POST"){

    $idioma =$_SESSION['idiomaSelect'];
$perfil = $_SESSION['perfilSelect'];
$zonaHoraria=$_SESSION['zonaSelect'];

$usuarioSession = [
   
    'idioma' => $idioma,
    'perfil' => $perfil,
    'zona' => $zonaHoraria
];

setcookie('idioma', $_POST['idiomaSelect'], time() + 3600);
setcookie('perfil',$_POST['perfilSelect'], time() + 3600);
setcookie('zona', $_POST['zonaSelect'], time() + 3600);

/** 1. Guardar el valor de las variables */

$_SESSION['idiomaSelect'] = $_POST['idiomaSelect'];
$_SESSION['perfilSelect'] = $_POST['perfilSelect'];
$_SESSION['zonaSelect'] = $_POST['zonaSelect'];

header("Location: " . $_SERVER['PHP_SELF']);

}

//** Fijamos los valores en el select con el atributo Select según cual elijamos */

$idiomaSeleccionado = $_SESSION['idiomaSelect'];
$perfilSeleccionado = $_SESSION['perfilSelect'];
$zonaSeleccionado = $_SESSION['zonaSelect'];

?>

<div class="contenedorPadre">

    <div class="contenedorHijo">

        <div class="contenedorMostrar">

            <h2> Preferencias de usuario</h2>
        
            <form action="preferencias.php" method="POST">
            <i class="fa-solid fa-language"></i>
                <label for="idioma">idioma:</label>
                <select name="idiomaSelect" id="id_idiomaSelect">
                    <option value="Inglés" <?php if($idiomaSeleccionado == "Inglés" ){ echo 'selected'; } ?>>Inglés</option>
                    <option value="Español" <?php if($idiomaSeleccionado == "Español"){ echo 'selected'; } ?>>Español</option>
                    <option value="Francés" <?php if($idiomaSeleccionado == "Francés"){ echo 'selected'; } ?>>Francés</option>
                </select>
                <i class="fa-solid fa-users"></i>
                <label for="perfil">Perfil público:</label>
                <select name="perfilSelect" id="idperfilSelect">
                    <option value="Si" <?php if($perfilSeleccionado == "Si"){echo 'selected';} ?>>Si</option>
                    <option value="No"<?php if($perfilSeleccionado == "No"){echo 'selected';} ?>>No</option>
                </select>
                <i class="fa-regular fa-clock"></i>
                <label for="zona_horaria">Zona horaria:</label>
                <select name="zonaSelect" id="id_zonaSelect">
                    <option value="GMT+2" <?php if($zonaSeleccionado == "GMT+2"){echo 'selected';} ?>>GMT+2</option>
                    <option value="GMT+1" <?php if($zonaSeleccionado == "GM+1"){echo 'selected';} ?>>GMT+1</option>
                    <option value="GMT" <?php if($zonaSeleccionado == "GMT"){echo 'selected';} ?>>GMT</option>
                    <option value="GMT-1" <?php if($zonaSeleccionado == "GMT-1"){echo 'selected';} ?>>GMT-1</option>
                    <option value="GMT-2" <?php if($zonaSeleccionado == "GMT-2"){echo 'selected';} ?>>GMT-2</option>
                  
        <!-- ir a la pagina mostrar.php y mostrar las preferencias -->

        <!-- guardar las preferencias del usuario en la sesion-->
        <input type="submit" value="Establecer preferencias"></button>
        <a href=mostrar.php ><input type="button" value="mostrar preferencias"></a>
        </form>
        <?php
if( $usuarioSession ){
    echo " <p style = 'color:blue' ; > preferencias de usuario guardadas</p>";
 }else {
     echo " preferencias de usuario no establecidas ";
 }
?>
        </div>

    </div>

</div>
    <?php ?>
</body>
</html>