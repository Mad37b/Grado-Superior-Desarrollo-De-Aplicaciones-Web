<?php
namespace Tarea07;
use Tarea07\Conexion;
use PDO;
require_once "conexion.php";
// clase conexion es padre y hereda los metodos de conexion a usuario ( hijo )
// parent : accede a a las clases padres heredadas , parent requiere extends para funcionar

class Usuario extends Conexion{

private  $id;
private $nombreUsuario;
private $contraseña;
private $PDO ;

public function __construct() {
    //$PDO = new PDO();
    $this->PDO= parent::obtenerConexion();
}

public function consultarUsuario($paramNombre){
    $nombre =$paramNombre;
    $sql = "SELECT id FROM usuario WHERE nombre ='$nombre'";
    $estado = $this->PDO->prepare($sql);
    $estado->execute();
    $resultado =$estado->fetch(PDO::FETCH_ASSOC) ; 
    return $resultado['id'];
}



// crear usuario insert into
public function insertarUsuario($paramUsuario,$paramContraseña){

    $this->nombreUsuario= $paramUsuario  ;
   $this->contraseña=  $paramContraseña ;

   $consulta="SELECT COUNT(*) FROM usuario WHERE Nombre =:nombre";
   $estado2=$this->PDO->prepare($consulta);
   $estado2->bindParam(":nombre",$this->nombreUsuario);
   $estado2->execute();
    $resultado2= $estado2->fetchColumn();
    if ($resultado2 > 0) {
        echo "<p>Este nombre ya está registrado. $resultado2</p>";
        return false;
    }else{
        $insert = "INSERT INTO usuario (Nombre,Contraseña) VALUES ('$this->nombreUsuario','$this->contraseña') ";
        $estado=$this->PDO->prepare($insert);
        $estado->execute();
        echo "<p>usuario agregado por primera vez </p>";

    }
   
}

// consultar si el usuario existe 

}

?>