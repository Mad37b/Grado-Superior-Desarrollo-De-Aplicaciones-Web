<?php namespace Tarea05; ?>

<?php

/** Consulta y obtiene los datos de los jugadores */


require 'conexión2.php';

use Tarea05\conexion;
// Establecer conexion con la clase conexion 
// Clase jugadores 

class jugador {

    /** Variables de la base de datos */
    private $id;
    private $nombre;
    private $apellido;
    private $dorsal;
    private $posicion;
    private $codigoBarras;
    // Variables de la conexion 
    public $PDO;

    /** Variables para sql  */
 public function __construct() {
  
    $conexion = new conexion (); 
    $nuevaConexion = $conexion->obtenerConexion();
    $this->PDO = $nuevaConexion;
    echo "Conexion establecida en el constructor de jugador <br><br>";

 }

/** get y query de jugadores */
public function obtenerJugadores (){

   $sqlQuery = " SELECT * FROM `listajugadores`";
   $estado = $this->PDO->prepare($sqlQuery);
   $estado->execute();
   return $estado->fetchAll();
}

public function obtenerCodigoBarras (){
    $codigoBarrasParam = 0;
    $codigo = 
    $sqlQuery = " SELECT * FROM `listajugadores`LIMIT 1 ";
    $estado = $this->PDO->prepare($sqlQuery);
    $estado->execute();

    $resultado =$estado->fetchAll($this->PDO::FETCH_ASSOC);

// Verificamos si obtenemos un resultado
if ($resultado) {
    // Accedemos a los datos
    echo "Código de barras: " . $resultado[0]['Código_de_barras'];
} else {
    echo "No se encontraron resultados.";
}
    return $resultado;



}
public function insertarJugadores ($nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam){
    $this->nombre = $nombreParam;
    $this->apellido = $apellidoParam;
    $this->dorsal = $dorsalParam;
    $this->posicion = $posicionParam;
    $this->codigoBarras = $codigoBarrasParam;
    
    $sqlInsert = "INSERT INTO `listajugadores` (`Nombre` ,`Apellido`, `Dorsal`,`Posición`,`Código_de_barras`) VALUES ('$nombreParam','$apellidoParam','$dorsalParam','$posicionParam','$codigoBarrasParam')";
    $estado = $this->PDO->prepare($sqlInsert);
    $estado->execute();


}

public function actualizarJugadores($idParam,$nombreParam,$apellidoParam,$dorsalParam,$posicionParam,$codigoBarrasParam){
    $this->id = $idParam;
    $this->posicion = $posicionParam;
    $this->nombre = $nombreParam;
    $this->apellido = $apellidoParam;
    $this->dorsal = $dorsalParam;
    $this->codigoBarras = $codigoBarrasParam;
    $sqlUpdate = " UPDATE `listajugadores` SET `Nombre` = '$nombreParam'  ,`Apellido` = '$apellidoParam' , `Dorsal` = $dorsalParam , `Posición`=$posicionParam , ` Código_de_barras` = '$codigoBarrasParam' WHERE `id` =$idParam ";
    $estado = $this->PDO->prepare($sqlUpdate);
    $estado->execute();
   

}
public function borrarJugadores($nombreParam,$apellidoParam,$dorsalParam,$codigoBarrasParam){
    $this->nombre = $nombreParam;
    $this->apellido = $apellidoParam;
    $this->dorsal = $dorsalParam;
    $this->nombre = $codigoBarrasParam;
    $sqlDelete = "DELETE FROM `listajugadores` WHERE  `nombre` = '$nombreParam'";
    $estado = $this->PDO->prepare($sqlDelete);
    $estado->execute();
}

}

/** Resultado de la consulta */

?>