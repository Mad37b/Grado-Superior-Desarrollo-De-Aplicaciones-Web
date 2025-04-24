<?php


 function autoload_384b6bcbcdcee62b756e365249ebc643($class)
{
    $classes = array(
        'Tarea06\Tarea06operacionesService' => __DIR__ .'/Tarea06operacionesService.php'
    );
    if (!empty($classes[$class])) {
        include $classes[$class];
    };
}

spl_autoload_register('autoload_384b6bcbcdcee62b756e365249ebc643');

// Do nothing. The rest is just leftovers from the code generation.
{
}
