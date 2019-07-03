<h1>Ingrese Datos de Patrocinador</h1><hr>
<br>

<@form action="addPatrocinador" method="POST">
Nombre: <input type="text" name="nombrePatrocinador">
<span class="error">${(errores.nombrePatrocinador)!}</span><br>
<br>
<input type="submit" value="Añadir">
</@form>
<br>
<@link_to action="index"><button>Cancelar</button></@link_to>
