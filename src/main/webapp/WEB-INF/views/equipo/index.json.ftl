[
<#list equipos as e>
    {
        "id": "${e.id}",
        "nombre": "${e.nombreEquipo}"
    }
    <#if e_has_next>,</#if>
</#list>
]
