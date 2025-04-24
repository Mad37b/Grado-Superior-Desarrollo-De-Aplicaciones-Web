<?php
require '../vendor/autoload.php';

$outputDir = 'C:/Users/Ulises III/Desktop/Estudios Académicos/Grado Superior Distancia/02 Entorno Servidor/03 Ejercicios/Tarea06/src/Clase1';

if (!is_dir($outputDir)) {
    echo " no existe la carpeta o no la encuentra en la ruta puesta"; // Crea la carpeta si no existe
}else {

    echo "anda la ruta es correcta<br><br>";
}

$generator = new \Wsdl2PhpGenerator\Generator();

try {
    $generator->generate(
        new \Wsdl2PhpGenerator\Config(array(
            'inputFile' => 'C:/Users/Ulises III/Desktop/Estudios Académicos/Grado Superior Distancia/02 Entorno Servidor/03 Ejercicios/Tarea06/servidorSoap/servicio.wsdl',
            'outputDir' => 'C:/Users/Ulises III/Desktop/Estudios Académicos/Grado Superior Distancia/02 Entorno Servidor/03 Ejercicios/Tarea06/src/Clase1',
            'namespaceName' => 'Tarea06'
        ))
    );
} catch (\Exception $e) {
    echo "<br><br>";
    echo "Error al generar el código: " . $e->getMessage();
}
