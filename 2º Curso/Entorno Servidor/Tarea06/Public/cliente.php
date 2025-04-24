<?php
// Apartado 2
$parametros = [
    "location" => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.php",
    "uri" => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/",
    "trace" => true,"exception" => false
];
$cliente = new SoapClient(null, $parametros);

try {
   // parametro de pvp y de la tabla productos -> id :   tiene que ser Int 
    $idparam = 5; 
   // parametro de stock
    $codigoParam = 1 ; 
    $codigo2Param = 2 ;
   // parametro familiaProductos
   $familiaProductosParam = "CONSOL";
   // familia no recibe parametros 
   $pvp = $cliente->__soapCall('getPVP',["id" => $idparam]);
   echo "el codigo producto es : " . $pvp ; 

   
    $precio = $cliente->getPVP($idparam);
    $cantidad = $cliente->getStock(1,1);
    $familia = $cliente->getFamilia();
    $productoFamilia = $cliente->getcodigoFamilia($familiaProductosParam);    

    echo "<p><strong>Respuesta del servidor:</strong> $precio</p>";
    echo "<p><strong>Respuesta del servidor:</strong> $cantidad</p>";
    echo "<p><strong>Respuesta del servidor:</strong>";
    
   echo"<table border='1' style='text-align: center; margin:0 auto'>";
  echo "<th>Productos</th>"."<th>Tienda</th>"."<th>Unidades</th>";

    foreach ( $familia as $usuario){
       echo "<tr>";
        echo "<td>"."producto: ".$usuario[0] ;
        echo "<td>"."tienda: ".$usuario[1] ;
        echo "<td>"."unidades: ".$usuario[2] ."</td>";
        echo "</tr>";
    }
    echo " </table>";
    echo  "</p>" ; 
    echo "<p><strong>Respuesta del servidor:</strong> $productoFamilia</p>";
    echo "<p>Estoy en el cliente SOAP</p>";

  echo " depuro --------------------------<br><br>";
  echo " precio ";
    var_dump($precio);
    echo " <br><br>";
    var_dump($cantidad);
    echo " <br><br>";
    var_dump($familia);
    echo " <br><br>";
    var_dump($productoFamilia);
    echo " <br><br>";
    echo " fin de depurar-----------------------";
    // Debug de las cabeceras SOAP 
    echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";

} catch (SoapFault $e) {
    echo "<p><strong>Error SOAP Cliente:</strong> " . $e->getMessage() . "</p> \n";
    var_dump($e->getMessage()); echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";
}
?>