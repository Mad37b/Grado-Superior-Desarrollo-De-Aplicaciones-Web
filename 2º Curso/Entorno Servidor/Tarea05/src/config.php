<?php namespace Tarea05; ?>
<?php 

/** Configuramos las dependencias para llamarlas en los scripts */

/** Según los apuntes
 * 
 * Esto me cargaría la vista "vista.blade.php" de la carpeta "views".
 * Fíjate que solo hace falta poner el nombre de la vista y no la extensión ".blade.php".
 * 
 * 
 */
/**require_once '../vendor/autoload.php';**/
require_once __DIR__ . '/../vendor/autoload.php';


use Philo\Blade\Blade;
use Milon\Barcode;
/** use Philo\laravel-blade;  el que me piden es philo\laravel-blade */
use fzaninotto\faker;
$views = __DIR__ . '/../views';
$cache = __DIR__ . '/../cache';
$blade = new Blade ($views,$cache);
?>