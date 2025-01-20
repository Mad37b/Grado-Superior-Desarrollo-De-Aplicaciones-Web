<?php


// Condicional 'if' clásico
$edad = 25;

if ($edad >= 18) {
    echo "Eres mayor de edad.";
} else {
    echo "Eres menor de edad.";
}


// Estructura alternativa con 'endif'
if ($edad >= 18):
    echo "Eres mayor de edad.";
else:
    echo "Eres menor de edad.";
endif;


// Condicional 'else if'
$hora = date("H");

if ($hora < 12) {
    echo "Buenos días.";
} elseif ($hora < 18) {
    echo "Buenas tardes.";
} else {
    echo "Buenas noches.";
}

// Operador ternario
$mensaje = ($edad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
echo $mensaje;

// Operador de fusión de null
$nombre = $_GET['nombre'] ?? 'Invitado'; // Establece el valor de $nombre como el valor proporcionado en $_GET['nombre'], y si $_GET['nombre'] es nulo o no está definido, se utiliza 'Invitado' como valor predeterminado
echo "Hola, $nombre";


// Número dado
$numero = 8;

// Comprobar si el número es par o impar usando if-elseif
if ($numero % 2 == 0) {
    echo "El número $numero es par.";
} else {
    echo "El número $numero es impar.";
}

echo "<br>";

// Usar un switch para mostrar un mensaje basado en el valor del número
switch ($numero) {
    case 1:
        echo "El número es igual a 1.";
        break;
    case 2:
        echo "El número es igual a 2.";
        break;
    case 3:
        echo "El número es igual a 3.";
        break;
    default:
        echo "El número no es 1, 2 ni 3.";
}

echo "<br>";

// Usar un for para mostrar los números del 1 al 5
echo "Números del 1 al 5 usando un for: ";
for ($i = 1; $i <= 5; $i++) {
    echo "$i ";
}

echo "<br>";

// Usar un do-while para mostrar números del 1 al 5
echo "Números del 1 al 5 usando un do-while: ";
$j = 1;
do {
    echo "$j ";
    $j++;
} while ($j <= 5);

echo "<br>";

// Usar un while para mostrar números del 1 al 5
echo "Números del 1 al 5 usando un while: ";
$k = 1;
while ($k <= 5) {
    echo "$k ";
    $k++;
}
?>
