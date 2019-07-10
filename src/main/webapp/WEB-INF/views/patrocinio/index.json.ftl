[
<#list patrocinio as p>
    {
        "id": "${p.idEquipo}",
        "nombre": "${p.idPatrocinador}"
    }
    <#if p_has_next>,</#if>
</#list>
]
