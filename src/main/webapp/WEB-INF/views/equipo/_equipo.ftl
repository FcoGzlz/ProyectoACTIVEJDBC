[
<#list equipos as e>
    {
        "id": "${e.id}",
        "nombre": "${e.nombreEquipo}",
        "cantidadJugadores": "${e.cantidadJugadores}"
    }
    <#if e_has_next>,</#if>
</#list>
]

