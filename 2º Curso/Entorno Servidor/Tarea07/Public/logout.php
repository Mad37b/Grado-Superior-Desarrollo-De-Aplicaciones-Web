<?php
session_start();
$usuario=$_SESSION["usuario"];
echo "Hasta la proxima ".$usuario." nos vamos a la pagina principal";

session_unset();
session_destroy();
header("Location:index.html");
exit;
?>