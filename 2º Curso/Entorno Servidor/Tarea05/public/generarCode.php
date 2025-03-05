<?php

/**Está página me genera un código de barras EAN-13 válido y que además no exista en la base de datos */
require '../vendor/autoload.php';

use Illuminate\Support\Facades\Redirect;
use \Milon\Barcode\DNS1D;
use \Tarea05\jugador;
session_start();

/** Instanciamos la clase jugador para obtener el codigo de barras de la base de datos  */

class controladorCodigoBarras {

private $codigo ;
  


/** metodo set */
    public function establecerCodigoBarras (){
    
      
        $mostrarCodigo = new jugador ();
        $resultado = $mostrarCodigo->obtenerCodigoBarras();

        if (isset($resultado[0]['Código_de_barras'])) {
            $this->codigo = $resultado[0]['Código_de_barras']; // Establece el código de barras desde la base de datos
        } else {
            echo "No se encontró el código de barras en la base de datos.";
            return;
        }
        /**$codigoBarras = $Codigo;**/
        return " - codigo obtenido del controlador con el metodo establecerCodigoBarras  ; " . $this->codigo;


    }

    public function mostrarCodigoBarras (){
    
        if (!$this->codigo) {
            echo "Error: No se ha establecido un código de barras en el metodo mostrarCodigoBarras."."<br><br>";
            return;
        }
      
        $d = new DNS1D();
        $d->setStorPath(__DIR__.'/cache/');
        $barraCode = $d->getBarcodeHTML($this->codigo, 'EAN13');
  
    
      return $barraCode;
    }   

    public function generarCodigoBarras(){
        $crearCodigo = rand(1000000000000 ,9000000000000);
       $_SESSION['codigoBarras'] = $crearCodigo;
       /**  header ( "Refresh:3 ; url=views/vcrear.blade.php"); */
        
        echo " EstablecerCodigoBarras  ; estoy probando mi metodo aleatorio : " . $crearCodigo; 
        return $crearCodigo ;
    }
}

/**
*$controlador = new controladorCodigoBarras();
*echo"<h1> Generar Codigo </h1> ";
*echo $controlador->establecerCodigoBarras();
*echo $controlador->mostrarCodigoBarras();
 */


 $controllerCreate = new controladorCodigoBarras (); 
 $creoCodigo = $controllerCreate-> generarCodigoBarras();
 echo $creoCodigo;
?>
 