<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <link rel="stylesheet" href="style.css">
    <title>listado.php</title>
</head>
<body>

<h1 style="text-align: center;"> Pagina de listado</h1>
<div class="session">
<?php 
session_start();
// repasar esto en logica por que cuando lo borro deja de definirse el array key de uno de los dos
if (isset($_POST["nombre"])) {
    $_SESSION["usuario"] = $_POST["nombre"];
}

if (isset($_POST["contraseña"])) {
    $_SESSION["password"] = $_POST["contraseña"];
}

$nombre =$_SESSION["usuario"];// guarda en una variable
$contraseña= $_SESSION["password"];

if(isset($nombre)){

    echo "<p>"."Sesion Iniciada ,".$nombre." |" . "$contraseña</p>";

}else{

    echo " <p>no se ha cogido o no ha llegado bien el usuario," . $nombre. "| ". $contraseña."</p>";
}

?>
<a href="logout.php"><button>Salir</button></a>

</div>
<h3 style="text-align: center;">  Muestra la tabla de todos los datos de la tienda </h3>
   
<table class="tabla">
    <thead>
        <tr>
            <th>Código</th>
            <th>Nombre</th>
            <th>Valoracion</th>
            <th>Valorar</th>
    
        </tr>
    </thead>
    <tbody>
        <?php 
          use Tarea07\Producto;
          use Tarea07\Usuario;
          use Tarea07\Votar;
        require_once __DIR__ . "/../Src/producto.php";
        require_once __DIR__ . "/../Src/usuario.php";
        require_once __DIR__ . "/../Src/votar.php";
        
   
        // 1. - Obtenemos los productos
        $producto = new Producto();
        $productos = $producto->obtenerTodosProductos();

        // 2.- variables para enviar a la clase Votar
        $idUsuario =$nombre;
        $voto=""; 
        $contadorVotos=0;
        $sinValorar ="sin Valorar";
        // 3. - Instancia de la clase Votar
       
        // 4. - Instancia para pintar las estrellas 
        $estrellas = new Votar ();
        //
        if($_SERVER["REQUEST_METHOD"] == "POST"){
            if (isset( $_POST['voto'])){
            $voto = (int) $_POST['voto'];// del form listado
        }
            if(isset($_POST["id_producto"])){
            $id_Producto_Recogido = (int) $_POST["id_producto"];
            echo "El id recogido a sido " . $id_Producto_Recogido;
            echo ", el nombre del usuario a sido " . $idUsuario;
            echo " el voto del id " . $id_Producto_Recogido. ", a sido " . $voto . " voto Estrellas";
            if($id_Producto_Recogido){
                $miVoto = new Votar ();
                $idNombre = new Usuario ();
                echo "<br>";
                $Obtener = $idNombre->consultarUsuario($nombre);
                echo " obtenemos el id de " . $idUsuario . " - " . $Obtener; 
                echo "<br>";
               
                var_dump($idUsuario);
                echo "<br>";
                var_dump($id_Producto_Recogido);
                echo "<br>";   
                $insertarVotos = $miVoto -> miVoto($voto,$Obtener,$id_Producto_Recogido);
                echo"<br><p>";
                echo "depurar salida";
                var_dump($miVotos);
                echo "</p>";
                }
        }
  
        }?>
               
        <?php foreach ($productos as $fila){ ?>
        <tr>
            <td><?php echo $fila['id'] ?> </td>
            <td><?php echo $fila['nombre'] ?> </td>
            <td><?php if($_SERVER["REQUEST_METHOD"] =="POST" && $_POST["voto"] && $fila["id"] ===$id_Producto_Recogido){ 
                echo $voto;  $pintar = $estrellas->pintarEstrellas($voto);}else{echo $sinValorar;}?></td><!-- Valoraciones -->
            <td> 
                
        <form class="tabla"  method="POST">
        <select name="voto" id="voto" style="width: 50px; text-align: center;"> 
                    <option value="1" <?php echo ($voto == "1") ? 'selected="selected"' : ''; ?>>1</option>
                    <option value="2" <?php echo ($voto == "2") ? 'selected="selected"' : ''; ?>>2</option>
                    <option value="3" <?php echo ($voto == "3") ? 'selected="selected"' : ''; ?>>3</option>
                    <option value="4" <?php echo ($voto == "4") ? 'selected="selected"' : ''; ?>>4</option>
                    <option value="5" <?php echo ($voto == "5") ? 'selected="selected"' : ''; ?>>5</option>
                </select>
                <input type="hidden" name="id_producto" value="<?php echo $fila['id']; ?>">
                <input type="hidden" name="id_voto" value="<?php echo $voto; ?>">

                <input type="submit" name="contador">
            </form> 
        </td>
        
                <?php } ?>  
               
            </td>
        </tr>
        </tr>
    </tbody>
</table>

      <!-- Ajax -->          
    <!--<script src="/Script/script.js"></script> -->
</body>
</html>