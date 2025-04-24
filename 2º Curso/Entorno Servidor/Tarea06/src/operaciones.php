<?php
namespace Tarea06;

use MessageFormatter;
use PDOException;
use Tarea06\productos;
use Tarea06\stock;
use Tarea06\familia;
use Tarea06\conexion;
/**
 * 
 * 1. Definimos las clases productos ,stock , y familia en operaciones y creamos nuevos metodos para tener la consulta
 * 
 * 
 */

require_once "productos.php";
require_once "stock.php";
require_once "familia.php";
//require_once "conexion.php";

class operaciones {

    public $PDO;
    public $producto=0;
    // instancia de objetos de las clases productos , stock , familia



    public function __construct() {
        $productos = new productos();
        $stock = new stock();
        $familia = new familia();
       $conexion = new conexion();
       $nuevaConexion = $conexion->obtenerConexion();
       $this->PDO =  $nuevaConexion;
   }
// tabla productos

// obtener codigo = id de un producto ? 

/**
 * @soap
 * @param int $idparam
 * @return anyType
 */
function getPVP(int $idparam){
   try{

   // $this->producto = $codigoProducto;
    $id = (int)$idparam;
    $query = "SELECT * FROM productos WHERE $id = id"; 
    $estado = $this->PDO->prepare($query);
    $estado->execute();

    $resultado = $estado->fetchAll($this->PDO::FETCH_ASSOC);
  
    foreach($resultado as $fila){

       $linea = "<strong>id </strong>==>".$fila["id"] . " - Precio :" . $fila["pvp"] . " €";
    }

return $linea;
   
   }catch(PDOException $e){
    echo" error en el metodo getPVP ;". $e->getMessage() . "<br>" ;

   }
        }

        /** @soap
         *  @param int $codigoProducto
         *  @param int $codigoTienda
         *  @return anyType
         */

function getStock($codigoProducto,$codigoTienda){

    try{
        $cProducto = (int)$codigoProducto;
        $cTienda = (int)$codigoProducto;
        $query = "SELECT * FROM stocks WHERE producto = $cProducto AND tienda = $cTienda"; 
        $estado = $this->PDO->prepare($query);
        $estado->execute();
    
        $resultado = $estado->fetchAll ($this->PDO::FETCH_ASSOC);


        foreach ( $resultado as $fila){
    
          $linea = "<b> producto</b> " . $fila["producto"] . " - " . "<b> tienda </b>:" . $fila["tienda"]. " Unidades " .$fila["unidades"]."<br><br>";
        
        }

        return $linea;

    }catch(PDOException $e ){

        return  $e->getMessage() ;
    }

    }
    // codigo de todas las familias 

    /** @soap
     *  @return string[][]
     */
    function getFamilia(){
        $arrayFamilia = [];
    $query = "SELECT * FROM stocks "; 
    $estado = $this->PDO->prepare($query);
    $estado->execute();

    $resultado = $estado->fetchAll ($this->PDO::FETCH_ASSOC);

    // por array 

    foreach ( $resultado as $fila){

        $arrayFamilia [] = [$fila["producto"], $fila["tienda"], $fila["unidades"]];
    }

    return $arrayFamilia;
    
    }

    /**
     * @soap
     * @param string $paramFamilia
     * @return string[]
     */
    
    function getcodigoFamilia ($paramFamilia){

         $arrayCodigoFamilia = [];
        // tabla productos y familia 
        $query = "SELECT * FROM `productos` WHERE  familia = '$paramFamilia'  "; 
        $estado = $this->PDO->prepare($query);
        $estado->execute();
    
        $resultado = $estado->fetchAll ($this->PDO::FETCH_ASSOC);
        
    
         foreach ( $resultado as $fila){

            $arrayCodigoFamilia [] = [$fila["nombre"], $fila["nombre_corto"], $fila["pvp"],$fila["familia"]];
        }

       return $arrayCodigoFamilia;


    }
    }
?>