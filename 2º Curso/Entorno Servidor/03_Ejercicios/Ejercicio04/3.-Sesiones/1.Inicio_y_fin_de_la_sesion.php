<?php


/**
 * 1.- Explicamos como se incia la sesion por primera vez 
 *      con session_start
 * 
 */

session_start();

// comprobamos si existe la variabe $_SESSION['visitas']
// su valor cada vez que se reinicia la pagina se reinicia
$_SESSION['visitas'];
if(isset($_SESSION['visitas'])){
    $_SESSION['visitas']++;
    echo " la variable existe por lo tanto subimos su valor :";
    echo $_SESSION['visitas'];
    if ($_SESSION['visitas'] == 40){
        echo "<br> el valor de la sesion ya ha llegado a 40 veces , reiniciamos la sesion ";
        session_reset();
        session_unset();

    }
}else{
    $_SESSION['visitas']=0;
echo " la variable no existe por lo tanto le pasamos a valorar como 0";
}

?>