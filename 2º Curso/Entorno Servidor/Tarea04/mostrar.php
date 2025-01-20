<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" href="style.css">
    <link rel="stylesheet" href="FontAwesome/fontawesome-free-6.7.2-web/css/all.min.css">
    <title>mostrar</title>
</head>
<body>

<?php session_start();

/**$idiomaRecibido = $_SESSION['idiomaSelect'];
$perfilRecibido = $_SESSION ['perfilSelect'];
$zonahoraRecibida = $_SESSION ['zonaSelect'];*/
?>

<div class="contenedorPadre">

    <div class="contenedorHijo">

        <div class="contenedorMostrar">

        <i class="fa-solid fa-user-gear fa-lg"></i><h2> Preferencias </h2>
                <label for="idioma">idioma:</label>
           
<?php
                    if(isset($_SESSION['idiomaSelect']) && !empty($_SESSION['idiomaSelect'])) {
                        echo $_SESSION['idiomaSelect'] ."<br><br>";
                    } else {
                        echo "no establecido" ."<br><br>";
                    }
                ?>

                <label for="perfil_público">Perfil público:</label>
                <?php
                    if(isset($_SESSION['perfilSelect']) && !empty($_SESSION['perfilSelect'])) {
                        echo $_SESSION['perfilSelect'] ."<br><br>";
                    } else {
                        echo "no establecido" ."<br><br>";
                    }
                ?>

                <label for="zona_horaria">Zona horaria:</label>
                <?php
                    if(isset($_SESSION['zonaSelect']) && !empty($_SESSION['zonaSelect'])) {
                        echo $_SESSION['zonaSelect'];
                    } else {
                        echo "no establecido";
                    }
                ?>

                     <form action="mostrar.php" method="POST">

                        <a href="preferencias.php">  <button type="button" value="Volver">Volver a establecer</button></a>
                        <input type="submit" name="borrar" value="borrar">
                       

                       <?PHP 
                       if ( $_SERVER ['REQUEST_METHOD'] === 'POST' ){

                        if ( isset($_POST['borrar'])){
                            unset($_SESSION ['idiomaSelect'] );
                            unset($_SESSION['perfilSelect']);
                            unset($_SESSION ['zonaSelect']);
    
                                echo " <p style = 'color: red '; >Los datos han sido borrados correctamente </p> ";

                            }else { echo "<p style ='color:red' ; > los datos no fueron borrados </p>";}
                            /** si vuelvo a pulsar el boton y los datos estan no establecidos o vacíos */

                            if(isset($_POST['borrar'])){
                                if (empty($_SESSION['idiomaSelect'])&& empty($_SESSION['perfilSelect'])&& empty($_SESSION['zonaSelect']) ){
                               
                                echo " <p style = 'color: red '; >Debes fijar primero las preferencias  </p> ";

                                }
                            }

                       }
                        ?>
                     </form>
                     


        </div>

    </div>

</div>
    
</body>
</html>