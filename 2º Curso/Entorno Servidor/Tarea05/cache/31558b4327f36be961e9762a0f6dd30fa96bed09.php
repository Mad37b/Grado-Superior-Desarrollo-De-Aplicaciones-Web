<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"   href="style.css">
    <title>vista Jugadores</title>
</head>
<body>
    <h1> pagina de vistaJugadores</h1>
    <h3 style="text-align: center;">  Muestra la tabla de todos los jugadores </h3>
    <a href="/public/fcrear.php"><button  value="Fichar Jugador ">crear Jugadores Formulario</button></a>
    <table border="1" style="text-align: center; border-collapse: collapse;margin: 0 auto;">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Dorsal</th>
                <th>Posicion</th>
                <th colspan="2">Código de Barras</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $jugadores; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $jugador): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($jugador['Nombre']); ?></td>
                <td><?php echo e($jugador['Apellido']); ?></td>
                <td><?php echo e($jugador['Dorsal']); ?></td>
                <td><?php echo e($jugador['Posición']); ?></td>
                <td><?php echo e($jugador['Código_de_barras']); ?>

                <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
                <td><?php echo $codigo; ?></td>
                </td>
            </tr>
            </tr>
        </tbody>
    </table>

</body>
</html>