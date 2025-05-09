# Apuntes Paso a paso 

19 de marzo de 2025

## 1. Composer 

 - Instalación

 - Preparacion y configuracion de dependencias

  1. Preparar composer.json

  2. luego de tenerlo preparado tenemos que ejecutar composer install, creando la carpeta vendor y composer.lock de forma automáticamente

  3. creamos el archivo config.php para que sea mas ameno el uso de las dependencias en la carpeta src

  para actualizar se usa composer update

## 2. phpmyadmin

    1. Creamos la base de datos y insertamos los datos copiando los archivos .sql

## 3. creamos las clase operaciones y sus getters
 - Debemos poner el soap

20 de marzo de 2025

## 4. Apartado 1

2 al 6 de Abril de 2025

- el primer servicio no usara wsdl

 - ADVERTENCIA

 - 1. Cuidado con usar php server para soapClient y soapServer con el puerto por defecto 3000 que incorpora la extensión de Visual Studio por que no lo detecta aunque pongamos en la ruta " localhost:3000"

  Explicacion 

  Solucion 

     Abrir un nuevo puerto en la terminal con php -s localhost:8000 pero esto solo funciona cuando visual studio esta abierto

     Trabajar siempre directamente desde XAMPP y Apache 

     Crear una ruta de proyecto con apache 

     ¿Como se hace ? 

      Explicacion de como se hace 

  - 2. Cuidado al usar echo y HTML en el codigo src de la base de datos o de los servicios soap por que rompe el XML generado por el método hadle ()
   Explicacion

   Solucion  

- Cierro advertencia

llamamos a los métodos creados en operaciones.php en cliente.php, donde tenemos la clase soapClient y en soapServer, llamamos a la clase con el metodo getClass ( )

## 5. Apartado 2

 - comprobar la correcta ejecución del servicio con la clase operaciones en cliente.php con soapclient 

 - Crear el documento wsdl con php2wsdl

  php2wsdl instalado en composer.json y por terminal 

## 6. Apartado 3

 - Crear las clases generadas con Wsdl2PhpGenerator en public , con rutas relativas y que apunte a src / Clase1 para guardar la clase generada 

## 7. Apartado 4

 - llamar a los métodos de la clase generada con __soapCall y comprobar que funcionen