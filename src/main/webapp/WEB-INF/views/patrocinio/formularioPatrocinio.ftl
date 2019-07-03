<h1>Ingrese Datos de Patrocinio</h1><hr><br>
<@form action="addPatrocinio" method="POST">
Equipo: <select name ="idEquipo">
<option value="">Seleccione Equipo</option>
<#list equipos as e >
<option value="${e.id}">${e.nombreEquipo}</option>
</#list>
</select>
<span class="error">${(errores.idEquipo)!}</span><br><br>


Patrocinador: <select name="idPatrocinador">
<option value="">Seleccione Patrocinador</option>
<#list patrocinadores as p>
<option value="${p.id}">${p.nombrePatrocinador}</option>
</#list>
</select>
<span class="error">${(errores.idPatrocinador)!}</span>
<br>
<br>
 <input type="submit" value="Agregar">
</@form>



