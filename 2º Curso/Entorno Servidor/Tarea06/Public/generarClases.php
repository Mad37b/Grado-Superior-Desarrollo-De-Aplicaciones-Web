<?php
require '../vendor/autoload.php';

$outputDir = __DIR__ . '/../src/Clase1';

if (!is_dir($outputDir)) {
    echo " no existe la carpeta o no la encuentra en la ruta puesta"; // Crea la carpeta si no existe
}else {

    echo "anda la ruta es correcta<br><br>";
    echo $outputDir;
}

$generator = new \Wsdl2PhpGenerator\Generator();

try {
    $generator->generate(
        new \Wsdl2PhpGenerator\Config(array(
            'inputFile' => __DIR__ . "/../servidorSoap/servicio.wsdl",
            'outputDir' => __DIR__ . "/../src/Clase1",
            'namespaceName' => 'Tarea06'
        ))
    );
} catch (\Exception $e) {
    echo "<br><br>";
    echo "Error al generar el código: " . $e->getMessage();
}
