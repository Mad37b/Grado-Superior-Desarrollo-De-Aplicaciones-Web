<?php
$uri='http://localhost/unidad6/servidorSoap';
$parametros=['uri'=>$uri];
try {
    $server = new SoapServer(NULL, $parametros);
    $server->setClass('Operaciones');
    $server->handle();
} catch (SoapFault $f) {
    die("error en server: " . $f->getMessage());
}
