<?php
namespace Apuntes; // con autoload composer gestiona las rutas
use PDO; // llama a la clase PDO ya creada desde PHP

use PDOException;
require_once "conexion.php";  // si no tenemos autoload , necesitamos require

//Documentación 

//https://www.php.net/manual/en/language.oop5.autoload.php
//https://www.php.net/manual/en/language.namespaces.rules.php

// fetcht modes 
//FETCH_ASSOC , array ( "clave"=> "valor")
//FETCH_NUM 
//FETCH_BOTH , FETCH_ASSOC + FETCH_NUM
//FETCH_OBJ , podemos acceder por instancias de la clase 
//FETCH_CLASS , hacemos que el $resultado como un objeto , es mas concreto y personalizado de definir
//FETCH_COLUM , 
class Consulta extends Conexion{
 
public function obtenerConsulta(){

    try{
        $pdo = $this->obtenerConexion(); // llamo directamente al metodo de la clase conexion gracias a la herencia
        $query="SELECT * FROM productos";
        $estado= $pdo->query($query);
        //$resultado = $estado->fetchAll(PDO::FETCH_ASSOC); // devuelve todo el array en asociativo array("clave"=>"valor");
        $resultado2 = $estado->fetch(PDO::FETCH_ASSOC);

        return $resultado2; // devuelve un array asociativo 
        //Ejemplo de una parte 

        /**Array ( [id] => 1 [nombre] => Nintendo 3DS negro 
         * [nombre_corto] => 3DSNG 
         * [descripcion] => Consola portátil de Nintendo que permitirá disfrutar de efectos 3D 
         * sin necesidad de gafas especiales,
         *  e incluirá retrocompatibilidad con el software de DS y de DSi. */
    }catch(PDOException $e){
        echo $e->getMessage();
        //error("e");
    }
}


}
$consulta = new Consulta ();
$nuevaConsulta = $consulta->obtenerConsulta();
print_r($nuevaConsulta);
?>
