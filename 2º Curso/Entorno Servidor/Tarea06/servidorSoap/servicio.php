<?php
// Apartado 1 de la tarea 06
/**logica del servicio web con soap sin documento wsdl */ 
// se define el servicio web de forma manual , y se llama a los metodos antes de pasar por public para que se renderice a vista
require '../vendor/autoload.php';
use Tarea06\operaciones;
class operacionesFake {
    public function getStock() {
        return "Producto 1 - Tienda 1";
    }
}
$parametros = ['uri' => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/"];
$servidor = new SoapServer(null,$parametros);

try {
  
    $servidor->setClass("Tarea06\operaciones");
    //$servidor->setClass("operacionesFake");
    $servidor->handle();

 
  
 
} catch (SoapFault $f) {
    die("error en server: " . $f->getMessage());
}

