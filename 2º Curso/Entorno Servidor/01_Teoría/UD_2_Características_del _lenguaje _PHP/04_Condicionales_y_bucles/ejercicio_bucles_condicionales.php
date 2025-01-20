<?php 

/*
Enunciado: Escribe un programa en PHP que solicite al usuario el ingreso de dos números enteros desde la consola. Luego, el programa debe determinar y mostrar la siguiente información:

Si ambos números son pares.
Si ambos números son impares.
Si el primer número es positivo, negativo o cero.
Si el segundo número es positivo, negativo o cero.
*/

// Solicitar al usuario dos números enteros desde la consola
echo "Ingrese el primer número entero: ";
$numero1 = (int)readline();

echo "Ingrese el segundo número entero: ";
$numero2 = (int)fgets(STDIN);


// Verificar si ambos números son pares
if ($numero1 % 2 == 0 && $numero2 % 2 == 0) {
    echo "Ambos números son pares.";
} else {
    echo "Al menos uno de los números no es par.";
}

// Verificar si ambos números son impares
if ($numero1 % 2 != 0 && $numero2 % 2 != 0) {
    echo "Ambos números son impares.";
} else {
    echo "Al menos uno de los números no es impar.";
}

// Determinar si el primer número es positivo, negativo o cero
if ($numero1 > 0) {
    echo "El primer número es positivo.";
} elseif ($numero1 < 0) {
    echo "El primer número es negativo.";
} else {
    echo "El primer número es cero.";
}

// Determinar si el segundo número es positivo, negativo o cero
if ($numero2 > 0) {
    echo "El segundo número es positivo.";
} elseif ($numero2 < 0) {
    echo "El segundo número es negativo.";
} else {
    echo "El segundo número es cero.";
}
echo    "<br>";
echo    "<br>";

/*
Enunciado:
Escribe un programa en PHP que funcione como una calculadora simple. El programa debe solicitar al usuario que ingrese dos números y luego seleccionar una operación entre suma (+), resta (-), multiplicación (*), y división (/). Utiliza una estructura switch para realizar la operación seleccionada y mostrar el resultado. Asegúrate de manejar adecuadamente la división por cero. El programa debe repetirse, permitiendo al usuario realizar múltiples cálculos hasta que decida salir.
*/

do {
    echo "Calculadora Simple";
    echo   "<br";

    // Solicitar al usuario que ingrese el primer número
    echo "Ingresa el primer número: ";
    $num1 = floatval(readline());
    echo   "<br";

    // Solicitar al usuario que ingrese el operador
    echo "Ingresa el operador (+, -, *, /): ";
    $operador = readline();
    echo   "<br";

    // Solicitar al usuario que ingrese el segundo número
    echo "Ingresa el segundo número: ";
    $num2 = floatval(readline());
    echo   "<br";

    // Utilizar una estructura switch para realizar la operación según el operador ingresado
    switch ($operador) {
        case '+':
            $resultado = $num1 + $num2;
            echo "Resultado: $num1 + $num2 = $resultado";
            break;
        case '-':
            $resultado = $num1 - $num2;
            echo "Resultado: $num1 - $num2 = $resultado";
            break;
        case '*':
            $resultado = $num1 * $num2;
            echo "Resultado: $num1 * $num2 = $resultado";
            break;
        case '/':
            // Verificar si el divisor es 0 antes de la división
            if ($num2 != 0) {
                $resultado = $num1 / $num2;
                echo "Resultado: $num1 / $num2 = $resultado";
            } else {
                echo "Error: No se puede dividir por cero.";
            }
            break;
        default:
            echo "Error: Operador no válido.";
            break;
    }

    // Preguntar al usuario si desea realizar otro cálculo
    echo "¿Quieres hacer otro cálculo? (si/no): ";
    $respuesta = strtolower(readline());

} while ($respuesta == 'si');

echo "¡Hasta luego!";
echo    "<br>";
echo    "<br>";

//-------------------------------------------------------------------------------------------------------------------
/*
Enunciado:
Desarrolla un programa en PHP que simule un juego de adivinanza. El programa debe generar un número aleatorio entre 1 y 100 y permitir al usuario intentar adivinar ese número. Utiliza un bucle while para dar al usuario múltiples oportunidades de adivinar. Proporciona pistas indicando si el número ingresado es demasiado alto o demasiado bajo. Además, utiliza la declaración continue para manejar situaciones en las que el usuario ingrese valores no numéricos. El juego debe finalizar cuando el usuario adivine correctamente el número o decida salir.
*/

echo "¡Bienvenido al Juego de Adivinanzas!";

// Generar un número aleatorio entre 1 y 100
$numero_secreto = rand(1, 100);

while (true) {
    // Solicitar al usuario que ingrese un número
    echo "Intenta adivinar el número (1-100): ";
    $intento = readline();

    // Verificar si el usuario quiere salir
    if (strtolower($intento) == 'salir') {
        echo "¡Gracias por jugar! El número secreto era $numero_secreto.";
        echo    "<br>";
        break;
    }

    // Verificar si la entrada es numérica
    if (!is_numeric($intento)) {
        echo "Error: Ingresa un número válido. Intenta nuevamente.";
        echo    "<br>";
        continue;
    }

    // Convertir la entrada a un número entero
    $intento = intval($intento);

    // Verificar si el número adivinado es correcto
    if ($intento == $numero_secreto) {
        echo "¡Felicidades! ¡Has adivinado el número secreto ($numero_secreto)!";
        echo    "<br>";
        break;
    } elseif ($intento < $numero_secreto) {
        echo "El número es demasiado bajo. Intenta nuevamente.";
        echo    "<br>";
    } else {
        echo "El número es demasiado alto. Intenta nuevamente.";
        echo    "<br>";
    }
}

//---------------------------------------------------------------------------------------------------------------
/*
Enunciado:
Desarrolla un programa en PHP que tome como entrada un array de números enteros y calcule la suma de los elementos en posiciones pares del array. Utiliza un bucle for para realizar esta tarea.
$array_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/

// Función para calcular la suma de elementos en posiciones pares de un array
function sumaElementosPares($array) {
    $suma = 0;

    // Utilizar un bucle for para recorrer el array y sumar los elementos en posiciones pares
    for ($i = 0; $i < count($array); $i += 2) {
        $suma += $array[$i];
    }

    return $suma;
}

// Ejemplo de uso
$array_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

echo "Array de números: " . implode(", ", $array_numeros) . "<br>";
$resultado = sumaElementosPares($array_numeros);
echo "La suma de elementos en posiciones pares es: $resultado " . "<br>";
?>



