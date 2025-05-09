<?php
// Apartado 2
$parametros = [
    "location" => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/servicio.php",
    "uri" => "http://localhost/ejerciciosEntornoServidor/Tarea06/servidorSoap/",
    "trace" => true,"exception" => false
];


try {
  $cliente = new SoapClient(null, $parametros);
} catch (SoapFault $e) {
  echo "<p><strong>Error SOAP Cliente:</strong> " . $e->getMessage() . "</p> \n";
  var_dump($e->getMessage()); echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
  echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";
}
  echo "<h1>Estoy en el cliente SOAP</h1>";
  // 1. Parametros
    // parametro de pvp y de la tabla productos -> id :   tiene que ser Int 
      $idparam = 5; 
    // parametro de stock
    $codigoParam = 1 ; 
    $codigo2Param = 2 ;
    // parametro familiaProductos
    $familiaProductosParam = "CONSOL";
    //familia no recibe parametros 

  //2. SoapCall
    $pvp = $cliente->__soapCall('getPVP',["id" => $idparam]);
  
    echo "<p><strong>Los datos del precio son:</strong> $pvp";
    //
    $cantidad = $cliente->__soapCall('getStock',['producto'=>1,'tienda'=>1]);
    // 
    $familia = $cliente->__soapCall('getFamilia',[]);
    $productoFamilia = $cliente->getcodigoFamilia($familiaProductosParam);    
      echo "<p><strong>Los datos del stock son :</strong> $cantidad</p>";

      echo "<p><strong>Los datos de la familia son:</strong>";
      
    echo"<table border='1' style='text-align: center; margin:0 auto'>";
    echo "<th>Productos</th>"."<th>Tienda</th>"."<th>Unidades</th>";

      foreach ( $familia as $usuario){
        echo "<tr>";
          echo "<td>".$usuario[0] ."</td>";
          echo "<td>".$usuario[1] ."</td>" ;
          echo "<td>".$usuario[2] ."</td>";
          echo "</tr>";
      }
      echo " </table>";
      echo  "</p>" ; 

      echo "<p><strong>Los datos del producto Familia son:</strong></p>";

      echo"<table border='1' style='text-align: center; margin:0 auto'>";
      echo "<th>Nombre</th>"."<th>Nombre_Corto</th>"."<th>Precio</th>";
    
        foreach ( $productoFamilia as $producto){
          echo "<tr>";
            echo "<td>".$producto[0] ."</td>";
            echo "<td>".$producto[1]."</td>" ;
            echo "<td>".$producto[2] ."€"."</td>";
            echo "</tr>";
        }
        echo " </table>";
        echo  "</p>" ; 
  
    // Debug de las cabeceras SOAP 
    echo "<pre>Solicitud SOAP:\n" . htmlspecialchars($cliente->__getLastRequest()) . "</pre>";
    echo "<pre>Respuesta SOAP:\n" . htmlspecialchars($cliente->__getLastResponse()) . "</pre>";


?>