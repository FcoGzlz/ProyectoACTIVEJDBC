<h1>Ingrese Datos de Equipo</h1><hr>
<br>
<@form action="create" method="POST">
Nombre: <input type="text" name="nombreEquipo">
<span class="error">${(errores.nombreEquipo)!}</span>
<br>
<br>
Cantidad de Jugadores: <input type="text" name="cantidadJugadores">
<span class="error">${(errores.cantidadJugadores)!}</span>
<br>
<br>
<input type="submit" value="Agregar Equipo">

</@form>
<br>
<@link_to action="index"><button>Cancelar</button></@link_to>

