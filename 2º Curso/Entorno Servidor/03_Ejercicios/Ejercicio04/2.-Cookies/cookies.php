<?php

// 1. llamar a la funcion pre defininida de cookies

// asi creamos la cookie , con el nombre de la cookie , sus valores y el tiempo estimado con 
// time( )+ ms

setcookie("juan","gonzales",time()+3600);

// 2. Accedemos a la cookie con la superglobal $_COOKIE

echo "la cookie es : ".$_COOKIE['juan'];
// otra forma de declararlo es con variables ya predefinidas 
setcookie($numero,$datos,$tiempo);

?>