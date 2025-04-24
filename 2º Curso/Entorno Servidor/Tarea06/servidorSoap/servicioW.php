<?php
// Apartado 1 de la tarea 06
/**logica del servicio web con soap con documento wsdl */ 
// se define el servicio web de forma automática , y se llama a los metodos antes de pasar por public para que se renderice a vista
require '../vendor/autoload.php';
//$parametros = ['uri' => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/"];

$url = "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.wsdl";

try {
    $servidor = new SoapServer($url);
    $servidor->setClass("Tarea06\operaciones");
    $servidor->handle();
  
} catch (SoapFault $f) {
    die("error en server: " . $f->getMessage());
}