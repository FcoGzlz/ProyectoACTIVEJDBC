[
<#list patrocinadores as patrocinador>
    {
        "id": "${patrocinador.id}",
        "nombre": "${patrocinador.nombrePatrocinador}"
    }
    <#if patrocinador_has_next>,</#if>
</#list>
]



