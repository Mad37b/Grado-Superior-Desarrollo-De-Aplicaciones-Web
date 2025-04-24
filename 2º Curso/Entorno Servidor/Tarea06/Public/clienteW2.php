<?php

// Apartado 7 : probar el nuevo servicio con la clase generada 

use Tarea06\Tarea06operacionesService;

  $parametros = [

    "trace" => 1,"exception" => true
];

require_once __DIR__ . '/../src/Clase1/Tarea06operacionesService.php';

 //use Tarea06\Clase1\ Tarea06operacionesService;
 $wsdl = "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.wsdl";

$cliente = new Tarea06operacionesService($parametros,$wsdl);
 try{

//Parametros 
$idParam =(int) 1 ; 
$familiaProductosParam = "CONSOL";
// instancia de metodos 


$precio = $cliente -> getPVP(1);
$familia= $cliente -> getFamilia();
$stock= $cliente -> getStock(1,1);
$codigoFamilia = $cliente ->getcodigoFamilia('3DSNG');

echo "<h1>Estoy en el cliente SOAP W2</h1>";
echo "<p><strong>Respuesta del servidor:</strong> $precio</p>";
echo "<p><strong>Respuesta del servidor:</strong>$stock</p>";
echo "<p><strong>Respuesta del servidor:</strong> $familia</p>";
var_dump($familia);
echo "<p><strong>Respuesta del servidor:</strong> $codigoFamilia</p>";

echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";


 } catch(SoapFault $e){

    echo "<p><strong>Error SOAP Cliente W2:</strong> " . $e->getMessage() . "</p> \n";
    var_dump($e->getMessage()); echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";
 }