<h1>Lista de Patrocinadores</h1><hr>
<br>
<table>
    <tr>
        <td>Id</td>
        <td>Nombre</td>
    </tr>
        <#list patrocinadores as p>
    <tr>
        <td>${p.id}</td>
        <td>${p.nombrePatrocinador}</td>
            
        <td>
            <@form  id=p.id action="eliminar" method="delete" html_id=p.id >
                <button type="submit">Eliminar</button>
            </@form>
        </td>

        <td>
            <@form  id=p.id action="equiposPatrocinados">
                <button type="submit">Ver Equipos Patrocinados</button>
            </@form>
        </td>
        <span class="error">${errores!}</span>
    </tr>
</#list>
</table>
       
<br>
<@link_to action="formularioPatrocinador"><button>Añadir Nuevo Patrocinador</button></@link_to>

