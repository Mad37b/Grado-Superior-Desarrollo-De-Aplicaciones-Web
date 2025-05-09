<?php
$cliente = new SoapClient(null, [
    'location' => 'http://localhost:3000/servicioSoap/servicio.php',
    'uri' => 'http://localhost/servicioSoap/',
    'trace' => 1,
]);
echo "Request: " . $cliente->__getLastRequest();
echo "Response: " . $cliente->__getLastResponse();
echo $cliente->saludar("Miguel oniichan uwu 😳");

// este codigo funciona 

// 1. ejecute  php -S localhost:8000 para levantar un nuevo servicio en la terminal

// no sabemos por que razon no lo hace funcionar con el puerto 3000 que trae por defecto php