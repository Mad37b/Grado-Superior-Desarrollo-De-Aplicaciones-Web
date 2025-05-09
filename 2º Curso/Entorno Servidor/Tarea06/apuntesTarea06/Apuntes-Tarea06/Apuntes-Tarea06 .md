# Tarea6 - Servicios web 

se llamará tarea6 la base de datos

tabla tienda? 

 usuario "gestor" y su contraseña "secreto".

 ## Carpetas

    - public se encargará de los servicios web 

    - src se encargará del código fuente como el CRUD y la conexion  ,clases Producto , stock y familia

    - servidorSoap donde se encargara de los servicios y los generamos

    - views renderizará public con blade 

 ## Se requiere 

    - autoload (instalado)
    - php2wsdl
    - wsdl2phpgenerator
    . Todo instalado con composer

## Apartados de la tarea 

     - 1. Creamos el servidor SOAP "servidorSoap" , no tendrá asociado ningún archivo wsdl y
       ofrecerá las siguientes funciones en src/operaciones

       getPVP
       getStock
       getFamilia
       getProductoFamilia

       2. Comprobamos el perfecto funcionamiento del servicio con cliente.php en public:
            - Realiza una llamada a cada una de las funciones programadas y muestre el resultado

        3. con la extension php2wsdl* crea el archivo public/generarWsdl.php :
            - Genera un documento WSDL "servicio.wdsl" que guardaremos en servidorSoap
            - Utilizando este documento nos creamos un nuevo servicioW.php que lo utilice
        4. Para comprobar la correcta ejecucion de este nuevo servicio, programa tambien un cliente con el nombre clienteW.php en la
        carpeta public que realice una llamada a cada una de las funciones programada y muestre el resultado obtenido 

        5. Partiendo de este nuevo servicio y de su descripcion ,crearemos el fichero "public generarCliente.php que utilizará la herramienta wsdl2php para obtener una 
        clase PHP. esta clase la guardaremos en la carpeta Clase1 dentro de src

        6.Crea un nuevo cliente llamado clienteW2.php que se basa en esta clase para probar el nuevo servicio mostrando los resultados obtenidos de forma 
        similar a como en los casos anteriores 