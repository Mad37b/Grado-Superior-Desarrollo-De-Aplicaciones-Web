# Apuntes sobre la Tarea 07

errores gestionado con ajax ( lo ultimo)

No tengo por ahora puestas claves foraneas (hecho )

1. src 

conexion.php - hecho

producto.php - hecho 

 metodo 

usuario.php

votar.php

miVoto () - ajustar

pintarEstrellas () - hacerlo 

2. Public 

index.html (acabado)

login.php ( queda ajax?)

listado.php 
    arreglar voton votar 
    instanciar pintarEstrellas desde clase voto en vez que sea directo
    arreglar contador
    arreglar que cuando voto en una fila , solo vote en esa fila según el id , no en todas las filas 
        - obtener el id de la fila votada , iterar y luego guardar ?
        - llevar los datos del id_producto seleccionado con su voto desde listado a votar.php
    arreglar persistencia de sesiones cuando vote no se pierda el usuario 


    ---


    cantidad = nº votos de la tabla votos
    idProductos= id del producto de la tabla productos en la tabla votos
    idUsuarios= id del usuario de la tabla usuarios en la tabla votos
    fk_votos_usuario =º veces que el usuario voto dicho producto con el id en la tabla votos
    fk_votos_productos = nº veces que el producto fue votado , en la tabla votos