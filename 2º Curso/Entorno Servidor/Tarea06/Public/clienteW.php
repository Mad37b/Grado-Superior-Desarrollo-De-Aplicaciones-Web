<?php
// Apartado 2
$options = [
    'location' => 'http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicioW.php',
    'uri' => 'http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/',
];
$wsdl = "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.wsdl";

try{
    $cliente = new SoapClient($wsdl,$options);

} catch (SoapFault $e) {
    echo "<p><strong>Error SOAP Cliente:</strong> " . $e->getMessage() . "</p> \n";
    var_dump($e->getMessage()); echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";
}

   //parametro de pvp
    $idparam = 5;
   //parametro de stock

   // parametro familiaProductos
   $familiaProductosParam = "CONSOL";
    //instancias 
    

    $pvp = $cliente->__soapCall('getPVP',["id" => $idparam]);
    $pvp2 = ($pvp == null) ? "no existe el producto " : $pvp;
    echo "el codigo producto es : " . $pvp ; 

    var_dump($precio);
    $cantidad = $cliente->getStock(1,1);
    $familia = $cliente->getFamilia();
    $productoFamilia = $cliente->getcodigoFamilia($familiaProductosParam);    

    echo "<p><strong>Respuesta del servidor:</strong> $pvp</p>";
    echo "<p><strong>Respuesta del servidor:</strong> $cantidad</p>";
    echo "<p><strong>Respuesta del servidor:</strong> $familia</p>";
    echo "<p><strong>Respuesta del servidor:</strong> $productoFamilia</p>";
    echo "<p>Estoy en el cliente SOAP</p>";
    echo "<p><strong>getPVP:</strong> "; var_dump($pvp); echo "</p>";
    echo "<p><strong>getStock:</strong> "; var_dump($cantidad); echo "</p>";
    echo "<p><strong>getFamilia:</strong> "; var_dump($familia); echo "</p>";
    echo "<p><strong>getcodigoFamilia:</strong> "; var_dump($productoFamilia); echo "</p>";
    
    // Debug de las cabeceras SOAP 
    echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";


   
?>