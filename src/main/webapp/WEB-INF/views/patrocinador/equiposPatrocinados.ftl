<h1>Patrocinador: ${patrocinador.nombrePatrocinador}</h1><hr><br>

<table>
    <tr>
        <td>Id de Equipo</td>
        <td>Nombre de Equipo</td>
    </tr>
<#list equiposPatrocinados as ep>
    <tr>
        <td>${ep.id}<br></td>
        <td>${ep.nombreEquipo}<br></td>
    </tr>
        </#list>
</table>






