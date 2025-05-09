<!--Crear una base de datos y una tabla de productos:

Enunciado: Crea un formulario que permita ingresar información sobre productos, como el nombre, la descripción y el precio. Los datos deben almacenarse en una base de datos llamada tienda con una tabla llamada productos.-->
<!-- formulario.php -->
<form action="agregar_producto.php" method="post">
    Nombre del producto: <input type="text" name="nombre"><br>
    Descripción: <textarea name="descripcion"></textarea><br>
    Precio: <input type="text" name="precio"><br>
    <input type="submit" value="Agregar Producto">
</form>
