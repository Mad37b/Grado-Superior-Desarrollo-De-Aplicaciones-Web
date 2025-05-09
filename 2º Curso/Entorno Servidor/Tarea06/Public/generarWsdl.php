<?php
// Apartado 3
//genera un documento WSDL que se guardara en la carpeta ServidorSoap

//utilizamos el autoload de composer
require '../vendor/autoload.php'; 

// $class = \Tarea06\operaciones::class;
$class = "Tarea06\operaciones";


$serviceURI = "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicioW.php";

$wsdlGenerator = new PHP2WSDL\PHPClass2WSDL($class, $serviceURI);
// Generate the WSDL from the class adding only the public methods that have @soap annotation.
$wsdlGenerator->generateWSDL(false);
// Dump as string
$wsdlXML = $wsdlGenerator->dump();
// Or save as file
$wsdlXML = $wsdlGenerator->save('../servidorSoap/servicio.wsdl');

?>