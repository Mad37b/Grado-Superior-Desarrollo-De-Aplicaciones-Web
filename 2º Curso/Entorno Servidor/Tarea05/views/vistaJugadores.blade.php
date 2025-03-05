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
            @foreach ($jugadores as $jugador)
            <tr>
                <td>{{ $jugador['Nombre'] }}</td>
                <td>{{ $jugador['Apellido'] }}</td>
                <td>{{ $jugador['Dorsal'] }}</td>
                <td>{{ $jugador['Posición'] }}</td>
                <td>{{ $jugador['Código_de_barras'] }}
                @endforeach
                <td>{!!$codigo!!}</td>
                </td>
            </tr>
            </tr>
        </tbody>
    </table>

</body>
</html>