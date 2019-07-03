<h1>Equipo: ${equipo.nombreEquipo}</h1><hr><br>

<table>
    <tr>
        <td>Id de Patrocinador</td>
        <td>Nombre de Patrocinador</td>
    </tr>
<#list patrocinadoresDeEquipo as pde>
    <tr>
        <td>${pde.id}<br></td>
        <td>${pde.nombrePatrocinador}<br></td>
    </tr>
        </#list>
</table>
