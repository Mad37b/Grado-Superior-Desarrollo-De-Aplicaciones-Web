<?php 
/*
Agregar un nuevo usuario:

Enunciado: Crea un formulario que permita agregar un nuevo usuario a una tabla llamada usuarios con campos nombre y correo.
*/
?>
<!-- formulario.php -->
<form action="procesar.php" method="post">
    Nombre: <input type="text" name="nombre"><br>
    Correo: <input type="text" name="correo"><br>
    <input type="submit" value="Agregar Usuario">
</form>
