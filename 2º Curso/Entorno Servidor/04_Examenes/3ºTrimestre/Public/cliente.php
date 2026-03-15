<?php

$wsdl = "http://localhost/ejerciciosEntornoServidor/EjercicioRepaso/3%c2%baTrimestre/soap/servicioW.wsdl" ; 

try{
 $cliente = new SoapClient($wsdl);

}catch (SoapFault $e) {

echo " Message error " . $e;
}

// Respuesta

// Parametros

// 2. SoapClient


?>