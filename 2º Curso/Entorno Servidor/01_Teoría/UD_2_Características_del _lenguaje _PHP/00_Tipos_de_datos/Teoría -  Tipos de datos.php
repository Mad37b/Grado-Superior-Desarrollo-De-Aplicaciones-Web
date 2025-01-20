<?php 
//Tipos de datos en PHP
// Entero
$numero = 42;

// Flotante
$precio = 19.99;

// Cadena de texto
$nombre = "Juan";

// Booleano
$activo = true;

// Array
$colores = array("rojo", "verde", "azul");

// Null
$nulo = null;

// Recurso (ejemplo: abrir un archivo)
$archivo = fopen("archivo.txt", "r");

// Objeto
class Persona {
    public $nombre;
    public $edad;
}

$persona = new Persona("Maria", 18);
$persona->nombre = "María";
$persona->edad = 30;

// Callable (función anónima)
$funcion = function ($nombre) {
    echo "Hola, $nombre";
};

$funcion("Pedro");

// Recurso de Base de Datos (ejemplo con MySQLi)
$conexion = new mysqli("localhost", "usuario", "contraseña", "basededatos");


//declaración de variables

$double = 4.5;
$cadena = "cadena";
$bool = True ;

echo 'El tipo de la variable $double es ', gettype($double), "<br/>";
echo"<br>";

echo ' El tipo de $bool es ', var_dump($bool), "<br/>"; // muestra el contenido de la variable $bool
echo"<br>";

//cambiamos el tipo de las variables
$double = 5;
echo 'Ahora el tipo de la variable $double es ', gettype($double), "<br/>";
echo"<br>";

$bool = "Ahora soy una cadena";
echo "Ahora la variable bool es un  ", gettype($bool), "<br/>";

//podemos convertir un double en un integer

$double = 5.5;
$entero = 4;
$suma_enteros = (int)$double + $entero;
// fijaros en lo que ocurre si utilizamos las comillas dobles. Nos da el valor de la variable. Si utilizamos las comillas simples nos da el nombre
echo  "El resultado final de la suma es = $suma_enteros" . "<br>" . "<br>"; 

// Algunos valores para los int
print '<h3>Valores para los enteros </h3>' ;
echo PHP_INT_SIZE . '<br>';
echo PHP_INT_MIN . '<br>';
echo PHP_INT_MAX . '<br>';

/* Hacer pruebas con las funciones:
is_bool(): Comprueba si una variable es de tipo booleano.
is_float(): Comprueba si el tipo de una variable es float.
is_numeric(): Comprueba si una variable es un número o un string numérico.
is_string(): Comprueba si una variable es de tipo string.
is_array(): Comprueba si una variable es un array.
is_object(): Comprueba si una variable es un objeto.

Os va a devolver un booleano, el cual es muy útil para utilizar en condicionales que veremos más adelante
*/