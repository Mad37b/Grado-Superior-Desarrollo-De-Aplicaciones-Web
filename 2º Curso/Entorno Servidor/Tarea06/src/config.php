<?php
 namespace Tarea06; 
// Instalaremos autoload y blade 

require_once __DIR__ . "/../vendor/autoload.php";

/** Blade */

use Philo\Blade\Blade;
use Milon\Barcode;
/** use Philo\laravel-blade;  el que me piden es philo\laravel-blade */
use fzaninotto\faker;
$views = __DIR__ . '/../views';
$cache = __DIR__ . '/../cache';
$blade = new Blade ($views,$cache);

/** SOAP */



use PHP2WSDL\PHPClass2WSDL;

$class = "Tarea06\\Operaciones";
$uri = 'http://localhost/unidad6/servidorSoap/servidorW.php';
$wsdlGenerator = new PHPClass2WSDL($class, $uri);
$wsdlGenerator->generateWSDL(true);
$fichero = $wsdlGenerator->save('../servidorSoap/servicio.wsdl');



?>