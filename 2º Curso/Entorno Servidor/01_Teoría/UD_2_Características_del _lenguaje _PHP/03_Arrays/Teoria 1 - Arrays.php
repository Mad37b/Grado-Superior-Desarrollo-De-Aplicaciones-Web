<?php
//Arrays indexados o escalares
$arrayNumericoIndexado = array(1, 2, 3); // Crear un array indexado numérico
$arrayNumericoAbreviado = [4, 5, 6]; // Sintaxis abreviada

//Acceso
$valor = $arrayNumericoIndexado[0]; // Acceder al primer valor (1)
echo $valor . "<br/>";

//Arrays asociativos
$arrayAsociativo = array(
    "nombre" => "Juan",
    "edad" => 30
); // Crear un array asociativo




$arrayAsociativoAbreviado = [
    "nombre" => "Ana",
    "edad" => 25
]; // Sintaxis abreviada

//Acceso
$nombre = $arrayAsociativo["nombre"]; // Acceder al valor asociado a la clave "nombre" (Juan)


//Arrays multidimensionales
$arrayMultidimensional = array(
    array(1, 2, 3),
    array("manzana" => 5, "naranja" => 3),
    array("verde", "rojo")
); // Crear un array multidimensional

$arrayMultidimensionalAbreviado = [
    [1, 2, 3],
    ["manzana" => 5, "naranja" => 3],
    ["verde", "rojo"]
]; // Crear un array multidimensional

//Acceso
$valor = $arrayMultidimensional[0][1]; // Acceder al segundo valor en el primer subarray (2)
$fruta = $arrayMultidimensional[1]["manzana"]; // Acceder al valor "manzana" en el segundo subarray (5)
echo $valor . "<br/>";
echo $fruta . "<br/>";

//Array Mixto (Indexado y Asociativo)
$arrayMixto = [
    1,
    2,
    3,
    "frutas" => ["manzana" => 5, "naranja" => 3],
    "colores" => ["verde", "rojo"]
]; // Array multidimensional con elementos mixtos

//Acceso
$tercerValor = $arrayMixto[2]; // Acceder al tercer valor (3)
$color = $arrayMixto["colores"][1]; // Acceder al segundo color "rojo"

//Acceso a la clave según un valor
$valor = 3;
$clave = array_search($valor, $arrayMixto); // Obtener la clave para el valor 3
echo "La clave del  valor $valor es: " . $clave . "<br/>";

//----------------------------------------------------------------------------------------------------------------
//Array Multidimensional Anidado:
$arrayMultidimensionalAnidado = [
    [
        [1, 2, 3],
        ["manzana" => 5, "naranja" => 3]
    ],
    [
        ["azul", "amarillo"],
        ["pera" => 4, "uva" => 7]
    ]
]; // Array multidimensional anidado


//Acceso
$valor = $arrayMultidimensionalAnidado[0][1]["manzana"];
// Acceder al primer valor (índice 0) en el segundo subarray (índice 1) del primer subarray (índice 0)
echo $valor . "<br/>";
$uva = $arrayMultidimensionalAnidado[1][1]["uva"];
// Acceder al valor "uva" en el segundo subarray (índice 1) del segundo subarray (índice 1)
echo $uva . "<br/>";


//Acceso a las clave según su valor

$valor = 7;
$clave = array_search($valor, $arrayMultidimensionalAnidado[1][1]); // Obtener la clave para el valor 7

echo $clave;

//----------------------------------------------------------------------------------------------------------------
/*En PHP, puedes recorrer un array de dos formas principales: 
    ** Iterar por sus valores o 
    ** Iterar por sus claves y valores asociados (clave => valor)
    */

$array = ["manzana", "banana", "cereza"];
foreach ($array as $valor) {
    echo $valor . "<br>";
}

$array = ["nombre" => "Juan", "edad" => 30, "ciudad" => "Madrid"];
foreach ($array as $clave => $valor) {
    echo "Clave: " . $clave . ", Valor: " . $valor . "<br>";
}
