

<h1>Lista de Patrocinios</h1><hr><br>

<table style="width:50%">

  <tr>
    <th>Equipo</th>
    <th>Patrocinador</th> 
  </tr>
<#list patrocinio as p>
<tr>
    <td>${p.idEquipo}</td>
    <td>${p.idPatrocinador}</td>
    <td>
        <@form  id=p.id action="eliminar" method="delete" html_id=p.id >
            <button type="submit">Eliminar</button>
        </@form>
    </td>
<tr>
</#list>

</table>
<br>
<@link_to action="formularioPatrocinio"><button>Añadir Nuevo Patrocinio</button></@link_to>

