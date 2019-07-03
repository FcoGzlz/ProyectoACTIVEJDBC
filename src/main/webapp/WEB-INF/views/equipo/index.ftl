

<br>
<h1>Lista de Equipos</h1><hr><br>

<table>
    <tr>
        <td>Id Equipo</td>
        <td>Nombre</td>
        <td>Cantidad de Jugadores</td>
    </tr>

    <tr>
        <#list equipos as e>
        <td>${e.id}</td>
        <td>${e.nombreEquipo}</td>
        <td>${e.cantidadJugadores}</td>
        

        <td>
            <@form  id=e.id action="eliminarEquipo" method="delete" html_id=e.id >
                <button type="submit">Eliminar</button>
            </@form>
        </td>
        <td>
        <@form  id=e.id action="patrocinadoresDeEquipo">
                <button type="submit">Ver Patrocinadores</button>
        </@form>
        </td>
    </tr>
</#list>
</table>
<br>
<@link_to action="formularioEquipo"><button>Añadir Nuevo Equipo</button></@link_to>

