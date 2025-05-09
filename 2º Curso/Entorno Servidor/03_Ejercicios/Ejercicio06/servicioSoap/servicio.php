<?php
require '../vendor/autoload.php';
$uri = "http://localhost/servicioSoap/";
$parametros = ['uri' => $uri];
try {
    $server = new SoapServer(NULL, $parametros);
    $server->setClass('Clases\Operaciones');
    $server->handle();
} catch (SoapFault $f) {
    die("error en server: " . $f->getMessage());
}