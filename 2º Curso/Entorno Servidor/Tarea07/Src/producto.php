<?php
namespace Tarea07;
//require_once __DIR__ . '/vendor/autoload.php';
require_once "conexion.php";
use PDOException;
use PDO;

class Producto extends conexion{

    private $id; //int
    private $nombre; //varchar
    private $nombre_corto; //varchar
    private $decripcion; //varchar
    private $precio; //double
    private $familia;//varchar
    private $PDO;

    public function __construct(){
        $this->PDO=parent::obtenerConexion();
    }

    public function obtenerTodosProductos (){
   
        try{
        $query="SELECT * FROM productos";
        $estado=$this->PDO->prepare($query);
        $estado->execute();
        $resultado=$estado->fetchAll(PDO::FETCH_ASSOC);

       return $resultado;
    }catch(PDOException $e){
       echo $e->getMessage();
       return[];
    }
    }
}

?>