<?php
	header("Content-Type: text/xml"); 
	sleep(3);
	$Nombre = $_GET['nombre'];
	$Latitud = $_GET['latitud'];
	$Longitud = $_GET['longitud'];
	$file = 'localizaciones.xml';
	// nueva linea 
	if (file_exists($file)) {
		// Cargar archivo existente
		$xml = simplexml_load_file($file);
	} else {
		// Crear estructura inicial
		$xml = new SimpleXMLElement('<?xml version="1.0" encoding="utf-8"?><LOCALIZACIONES></LOCALIZACIONES>');
	}

// Escapamos caracteres peligrosos para XML
$Nombre = htmlspecialchars($Nombre);
$Latitud = htmlspecialchars($Latitud);
$Longitud = htmlspecialchars($Longitud);
// Crear el objeto XML raíz


// Agregar la localización
$localizacion = $xml->addChild("LOCALIZACION");
$localizacion->addChild("NOMBRE", $Nombre);
$localizacion->addChild("LATITUD", $Latitud);
$localizacion->addChild("LONGITUD", $Longitud);

$xml->asXML($file);

// Imprimir XML
echo $xml->asXML();
?>