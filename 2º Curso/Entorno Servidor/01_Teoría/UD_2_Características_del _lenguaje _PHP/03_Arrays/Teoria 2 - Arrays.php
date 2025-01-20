<?php
/*
-------------------------------------------------------------------------------------------------------------------
25 FUNCIONES MÁS IMPORTANTES CON ARRAYS
-------------------------------------------------------------------------------------------------------------------
1. **count()**: Devuelve el número de elementos en un array.
2. **array_push()**: Agrega uno o más elementos al final de un array.
3. **array_pop()**: Elimina y devuelve el último elemento de un array.
4. **array_shift()**: Elimina y devuelve el primer elemento de un array.
5. **array_unshift()**: Agrega uno o más elementos al principio de un array.
6. **array_merge()**: Combina dos o más arrays en un solo array.
7. **array_slice()**: Extrae una porción de un array y crea un nuevo array.
8. **array_keys()**: Devuelve todas las claves de un array.
9. **array_values()**: Devuelve todos los valores de un array.
10. **in_array()**: Comprueba si un valor existe en un array.
11. **array_search()**: Busca un valor en un array y devuelve la clave correspondiente.
12. **array_unique()**: Elimina valores duplicados de un array.
13. **sort()**: Ordena un array en orden ascendente.
14. **rsort()**: Ordena un array en orden descendente.
15. **asort()**: Ordena un array preservando las asociaciones entre claves y valores.
16. **arsort()**: Ordena un array en orden descendente preservando las asociaciones entre claves y valores.
17. **array_map()**: Aplica una función a todos los elementos de un array.
18. **array_filter()**: Filtra los elementos de un array utilizando una función de devolución de llamada.
19. **array_reduce()**: Reduce un array a un solo valor utilizando una función de devolución de llamada.
20. **array_key_exists()**: Comprueba si una clave existe en un array.
21. **array_reverse()**: Invierte el orden de los elementos en un array.
22. **array_chunk()**: Divide un array en fragmentos más pequeños.
23. **array_diff()**: Calcula la diferencia entre dos o más arrays.
24. **array_intersect()**: Calcula la intersección de dos o más arrays.
25. **array_walk()**: Aplica una función de devolución de llamada a cada elemento de un array.

*/
//-------------------------------------------------------------------------------------------------------------------
/************************************  ORDENAR ARRAYS ***************************************************************/

//1. Ordenación de un Array Indexado Numéricamente:
$miArrayNumerico = [5, 2, 9, 1, 5, 6];

// Ordenar ascendente
sort($miArrayNumerico);
print_r($miArrayNumerico);
echo "<br/>";

// Ordenar descendente
rsort($miArrayNumerico);
print_r($miArrayNumerico);
echo "<br/>";



//2. Ordenación de un Array Asociativo:
$miArrayAsociativo = ["b" => 3, "a" => 1, "c" => 2];

// Ordenar por clave ascendente
ksort($miArrayAsociativo);
print_r($miArrayAsociativo);
echo "<br/>";

// Ordenar por clave descendente
krsort($miArrayAsociativo);
print_r($miArrayAsociativo);
echo "<br/>";

// Ordenar por valor ascendente
asort($miArrayAsociativo);
print_r($miArrayAsociativo);
echo "<br/>";

// Ordenar por valor descendente
arsort($miArrayAsociativo);
print_r($miArrayAsociativo);
echo "<br/>";
echo "<br/>";




//3. Ordenación de un Array Multidimensional:
// Array multidimensional
//La función usort de PHP utiliza el valor devuelto por la función de comparación personalizada (la que defines) para determinar cómo se deben ordenar los elementos del array.
$miArrayMultidimensional = [
    ["nombre" => "Juan", "edad" => 25],
    ["nombre" => "Ana", "edad" => 30],
    ["nombre" => "Carlos", "edad" => 22]
];

// Ordenar por edad ascendente
usort($miArrayMultidimensional, function ($a, $b) {
    //Los parámetros $a y $b son convenciones comunes que se utilizan para referirse a los dos elementos que se están comparando.
    return $a["edad"] - $b["edad"]; //Compara la edad de dos personas y devuelve un int
});
print_r($miArrayMultidimensional);
echo "<br/>";
echo "<br/>";


// Ordenar por nombre ascendente
usort($miArrayMultidimensional, function ($a, $b) {
    return strcmp($a["nombre"], $b["nombre"]); //Devuelve < 0 si $a["nombre"] es menor que $b["nombre"]; > 0 si $a["nombre"] es mayor que $b["nombre"] y 0 si son iguales.
});
print_r($miArrayMultidimensional);
echo "<br/>";
echo "<br/>";



//Enunciado: Dado un array de números, ordena los elementos en orden descendente y elimina duplicados.

$numeros = [5, 2, 8, 2, 9, 5];
rsort($numeros);
$uniqueNumbers = array_unique($numeros);
var_dump($uniqueNumbers);
echo "<br/>";
echo "  <br/> ";


/*************************************   INCLUSIONES Y ELIMINACIONES  ***********************************/

/*Enunciado: Dado un array escalar de números, realiza las siguientes operaciones en orden:

1-Agrega un nuevo número al final del array.
2-Agrega otro número al principio del array.
3-Elimina el último número del array.
4-Elimina el primer número del array.
*/

$numbers = [1, 2, 3, 4];

// Paso 1: Agregar un número al final
array_push($numbers, 5);
// ESTO DARÍA ERROR, PERO NO CON ARRAY_PUSH  $numbers [] = 6,5,9;

// Paso 2: Agregar un número al principio
array_unshift($numbers, 0);

var_dump($numbers);
echo "  <br/> ";

// Paso 3: Eliminar el último número
array_pop($numbers);

// Paso 4: Eliminar el primer número
array_shift($numbers);
var_dump($numbers);
echo "  <br/> ";
echo "  <br/> ";


//-------------------------------------------------------------------------------------------------------------------
//Incluir elementos a un array dentro de un bucle

//Array Indexado:
$numeros = [];

for ($i = 1; $i <= 5; $i++) {
    array_push($numeros, $i); // Agregar elementos al final del array. Se podría utilizar cualquier otra función
}

echo "//Incluir elementos a un array dentro de un bucle
";
echo "  <br/> ";

print_r($numeros);

//Lo mismo pero con un foreach
$numeros = [];

foreach (range(1, 5) as $numero) {
    $numeros[] = $numero; // Agregar elementos al final del array
}

echo "  <br/> ";
print_r($numeros);
echo "  <br/> ";

//---------------------------------------------------------------------------------------------------
//Array Asociativo:
$personas = [];

$nombres = ['Alice', 'Bob', 'Charlie', 'David', 'Eva'];
$edades = [28, 35, 42, 29, 36];

for ($i = 0; $i < count($nombres); $i++) {
    $personas[$nombres[$i]] = $edades[$i]; // Asignar nombres como claves y edades como valores
}

print_r($personas);
echo "  <br/> ";


////Lo mismo pero con un foreach
$personas = [];

$nombres = ['Alice', 'Bob', 'Charlie', 'David', 'Eva'];
$edades = [28, 35, 42, 29, 36];

//Cada elemento del array $nombres se asigna a la variable $nombre, y el índice de ese elemento se asigna a la variable $indice
foreach ($nombres as $indice => $nombre) {
    $personas[$nombre] = $edades[$indice]; // Asignar nombres como claves y edades como valores
}

print_r($personas);
echo "  <br/> ";
echo "  <br/> ";

//-------------------------------------------------------------------------------------------------------------
//Array Multidimensional:

$estudiantes = [];

for ($i = 1; $i <= 3; $i++) {
    $estudiante = [
        'nombre' => "Estudiante $i",
        'edad' => 20 + $i,
        'notas' => [rand(70, 100), rand(70, 100), rand(70, 100)],
        'modulos' => ["MME", "DWCS"]
    ];
    array_push($estudiantes, $estudiante);
}

echo "<pre>";
print_r($estudiantes);
echo "  <br/> ";

echo "</pre>";

////Lo mismo pero con un foreach
$estudiantes = [];

foreach (range(1, 3) as $i) {
    $estudiante = [
        //Está creando un estudiante
        'nombre' => "Estudiante $i",
        'edad' => 20 + $i,
        'notas' => [rand(70, 100), rand(70, 100), rand(70, 100)]
    ];
    $estudiantes[] = $estudiante; //incluye el estudiante en el array estudiantes
}

echo "<pre>";
print_r($estudiantes);
echo "  <br/> ";

echo "</pre>";

//------------------------------------------------------------------------------------------------------------------
// Asignación con list() y "asignación por desestructuración"

//Ejemplo con list():
//Enunciado: Dado un array con tres valores, asigna cada valor a tres variables utilizando list()
$miLista = [10, 20, 30];
list($valor1, $valor2, $valor3) = $miLista;
echo "El valor del primer array es igual a: " . $valor1 . "<br>";
// Ahora, $valor1 tiene 10, $valor2 tiene 20 y $valor3 tiene 30.

/*Ejemplo con asignación por desestructuración:
Enunciado: Dado un array con tres valores, asigna cada valor a tres variables utilizando asignación por desestructuración.
*/
$miLista = [10, 20, 30];
[$valor1, $valor2, $valor3] = $miLista;
// Ahora, $valor1 tiene 10, $valor2 tiene 20 y $valor3 tiene 30.

/*
Ejemplo con foreach y list():
Enunciado: Dado un array de arrays que contiene información de empleados, utiliza un bucle foreach junto con list() para mostrar los nombres y salarios de cada empleado.
*/

$empleados = [
    ["nombre" => "Juan", "salario" => 50000],
    ["nombre" => "María", "salario" => 45000],
    ["nombre" => "Carlos", "salario" => 60000]
];

foreach ($empleados as $empleado) {
    list("nombre" => $nombre, "salario" => $salario) = $empleado;
    echo "Nombre: $nombre, Salario: $salario<br>";
}

//Ahora sin list

$empleados = [
    ["nombre" => "Juan", "salario" => 50000],
    ["nombre" => "María", "salario" => 45000],
    ["nombre" => "Carlos", "salario" => 60000]
];

foreach ($empleados as $empleado) {
    $nombre = $empleado["nombre"];
    $salario = $empleado["salario"];
    echo "Nombre: $nombre, Salario: $salario<br>";
}

echo " <br>";
echo " <br>";

/************************************* OTRA MANERA DE RECORRER ARRAYS  ***********************************/
/*
Enunciado: Supongamos que tenemos un array en PHP que almacena información sobre empleados de una empresa, y deseamos recorrer y mostrar los nombres y salarios de los empleados utilizando las funciones reset(), next(), prev(), end(), current(), y key().
*/

echo "OTRA MANERA DE RECORRER ARRAYS";
echo " <br>";

$empleados = array(
    'Juan' => 50000,
    'María' => 55000,
    'Pedro' => 48000,
    'Luis' => 52000
);

// Inicializa el puntero interno al comienzo del array
reset($empleados);

// Recorremos el array e imprimimos el nombre y el salario de cada empleado
while ($empleado = current($empleados)) {
    $nombre = key($empleados);
    $salario = current($empleados);

    echo "Nombre: $nombre, Salario: $salario<br>";

    // Avanza el puntero interno una posición.
    next($empleados);

    $nombreSiguienteEmpleado = key($empleados);
    $salarioSiguienteEmpleado = current($empleados);

    echo "Después de $nombre va: " . $nombreSiguienteEmpleado . " que cobra: " . $salarioSiguienteEmpleado . "<br>";
}

// Sitúa el puntero interno al final del array
end($empleados);
echo "Puntero al final del array<br>";

// Movemos el puntero interno una posición hacia atrás
prev($empleados);
$nombre = key($empleados);
$salario = current($empleados);
echo "Nombre: $nombre, Salario: $salario<br>";




/*************************************      FUNCIONES         ***************************************** */


//Enunciado: Dado un array asociativo con nombres y edades, filtra los nombres de las personas mayores de 30 años. A continuación, guarda en un nuevo array los nombres.

$people = array(
    'Alice' => 28,
    'Bob' => 35,
    'Charlie' => 42,
    'David' => 29,
);
$array_mayores_30 = array_filter($people, function ($age) {
    return $age > 30;
});

$array_nombres_mayores = array_keys($array_mayores_30); // Se queda solo con los nombres y los guarda en un array

var_dump($array_nombres_mayores);
echo "  <br/> ";

//Enunciado: Dados dos arrays de frutas, encuentra las frutas comunes entre ambos y ordénalas alfabéticamente.
$frutas1 = ["manzana", "naranja", "plátano", "pera"];
$frutas2 = ["naranja", "uva", "manzana", "pera"];
$frutas_comunes = array_intersect($frutas1, $frutas2);
sort($frutas_comunes);
$frutas_resultado = implode(', ', $frutas_comunes); // Ahora es un string
echo $frutas_resultado;
echo "  <br/> ";
var_dump($frutas_resultado);
echo "  <br/> ";


//Enunciado: Dado un array de números, suma todos los números y devuelve el resultado.

$numeros = [1, 2, 3, 4, 5];
$sum = array_reduce($numeros, function ($carry, $item) {
    return $carry + $item;
}, 0);

var_dump($sum);
echo "  <br/> ";


//Enunciado: Dado un array de palabras, agrega la palabra "Prefijo_" al principio de cada palabra.
$palabras = ["manzana", "naranja", "plátano"];
$prefixedpalabras = array_map(function ($iterator) {
    return "Prefijo_" . $iterator;
}, $palabras);
var_dump($prefixedpalabras);
echo "  <br/> ";


//Enunciado: Inserta un elemento en una posición específica de un array escalar y desplaza los elementos existentes para hacer espacio.
$numeros = [1, 2, 4, 5];
array_splice($numeros, 2, 0, 3); // Inserta el número 3 en la tercera posición.
$numeros[] = 6;

$numeros_resultado = implode(', ', $numeros);
echo "El resultado de insertar el 3 es: " . $numeros_resultado . " pero no elimina ningún dato";
echo "  <br/> ";
echo "  <br/> ";


//Enunciado: Inserta un nuevo elemento al final de un array asociativo y lo asocia con una nueva clave.
$estudiante = [
    'nombre' => 'Elena',
    'edad' => 20,
];
$estudiante['carrera'] = 'Historia';
var_dump($estudiante);
echo "  <br/> ";
echo "  <br/> ";

//Enunciado: Elimina un elemento específico de un array asociativo (edad) y reorganiza las claves.

$person = [
    'nombre' => 'Carlos',
    'edad' => 28,
    'ciudad' => 'Madrid',
];
unset($person['edad']);
echo "  <br/> ";
echo "Claves asociativas <br>";
var_dump($person); //Claves asociativas 
echo "  <br/> ";

$person = array_values($person); // Reorganiza las claves para que sean numéricas.
echo "Claves numéricas <br>";
var_dump($person);
echo "  <br/> ";
echo "  <br/> ";


$claves = ["a","b","c"];
$valores = ["ana", "maria", "elena"];

$array_final = array_fill_keys($claves, $valores);
var_dump($array_final);
echo "<br>";
echo "<br>";
//----------------------------------------------------------------------------------------------------------------
//******************************Combinar dos arrays  ************************************************************/
//Combina dos arrays en un solo array asociativo

echo "<pre>";
$comidas = ["pizza", "hamburguesa", "helado"];
$precio = [20, 30, 5];

$menuAsociativo = [];

foreach ($comidas as $key => $value) {
$menuAsociativo[$value] = $precio[$key];
}
print_r($menuAsociativo);
echo "<br>";
echo "<br>";

//Combina dos arrays en un array multinivel

echo "<pre>";
$comidas = ["pizza", "hamburguesa", "helado"];
$precio = [20, 30, 5];

$menuAsociativo = [];

foreach ($comidas as $key => $value) {
$menuAsociativo[] = [$value => $precio[$key]];
//$menuAsociativo[] = [comidas[$value] => $precio[$key]];
// array_push($menuMultinivel, [$value => $precio[$key]]);
}
print_r($menuAsociativo);
echo "<br>";
echo "<br>";