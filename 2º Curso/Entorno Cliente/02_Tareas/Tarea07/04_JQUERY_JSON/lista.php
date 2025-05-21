<?php
	header("Content-Type: application/json"); // Ahora con json
	sleep(3);
	$Nombre = htmlspecialchars($_GET['nombre'] ?? '');
	$Latitud = htmlspecialchars($_GET['latitud'] ?? '');
	$Longitud = htmlspecialchars($_GET['longitud'] ?? '');
	$file = 'localizaciones.json';
	$datos = [];

	if (file_exists($file)) {
		$contenido = file_get_contents($file);
		$datos = json_decode($contenido, true); // Lo pasamos a array
	}
	$datos[] = [
        'nombre' => $Nombre,
        'latitud' => $Latitud,
        'longitud' => $Longitud
    ];

// Guardar datos en el archivo JSON
file_put_contents($file, json_encode($datos, JSON_PRETTY_PRINT));

// Imprimir JSON
echo json_encode($datos);
?>