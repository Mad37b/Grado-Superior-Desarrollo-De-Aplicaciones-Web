<?php
namespace Tarea07;
require_once "conexion.php";

use Tarea07\Conexion;
use PDO;
use PDOException;
//session_start();
class Votar extends Conexion{
    private $PDO;
    public function __construct(){
        $this->PDO=parent::obtenerConexion();

    }

/** Utilizaremos Xajax para presentar en tiempo real los cambios en la valoración cada vez que un cliente vote por un producto.
 *  Para ello implementaremos el  método PHP "miVoto" que insertará el voto, si es la primera vez que el cliente valora un producto, y devolverá:
 *  La valoración de ese producto (la media de las valoraciones)
 *  False si el usuario ya ha valorado ese producto. **/

    function miVoto ($paramCantidad_Votos,$paramUsuario,$paramProductos,){
        //$usuarioParam,$votoParam,$idParam,$productosParam,$paramidUsuario
        //variables de la tabla votos
            // parametros de votos
    
        $valoracionCantidad=$paramCantidad_Votos; //sql : cantidad
        $idProductos=$paramProductos; //sql : productos
        $idUsuario = $paramUsuario;// usuario 

    
        $query = "SELECT * FROM votos WHERE idUsuarios='$idUsuario' AND idProductos =$idProductos";
        $estado=$this->PDO->prepare($query);
        var_dump($idProductos,$idUsuario,$valoracionCantidad);
        $estado->execute();
        $resultado=$estado->fetch(PDO::FETCH_ASSOC); // tal vez sea buena idea fetch solo , ya que solo buscamos un resultado
        


        if($_SERVER["REQUEST_METHOD"]=="POST"){

            if(!$resultado){
        
        $queryInsert = "INSERT INTO votos(cantidad,fk_votos_productos,fk_votos_usuario)VALUES(?,?,?)";
        $estado=$this->PDO->prepare($queryInsert);
        $estado->execute([$valoracionCantidad, $idProductos,$idUsuario]);
        
        }
            }
             
    }
    //devolver el número de clientes que han valorado ese producto y las estrellas que se pintarán.
    function pintarEstrellas ($paramSelect){

        // devuelve la cantidad de votos y la media de estrellas 
        //ruta absoluta donde esta las imagenes estrella1,2,3,....png
        //http://localhost/ejerciciosEntornoServidor/Tarea07/Public/
        $votoObtenido = $paramSelect;
        $ruta="/ejerciciosEntornoServidor/Tarea07/Public/estrella". $votoObtenido . ".png";
  

        echo "<img src='$ruta' alt='estrellas'></img>";
    }

}
/**
 * $mirarVotos = $prueba->pintarEstrellas(5);
 * $prueba = new Votar ();
*echo $mirarVotos;
*/

