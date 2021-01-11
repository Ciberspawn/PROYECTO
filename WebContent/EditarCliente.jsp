<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header id="seccion">
		<h2>EDITAR CLIENTE</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="iconos/icono-menu.png" alt=""
				class="icon-menu" for="check"></label>
			<nav class="menu">
				<ul>
					<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>

					<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear
							Capacitaciones</a></li>
					<li><a
						href="<%=request.getContextPath()%>/ListarCapacitaciones">Listar
							Capacitaciones</a></li>
					<li><a href="<%=request.getContextPath()%>/ListadoDeUsuarios">Listado
							de Usuarios</a></li>
					<li><a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar
							Sesión</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<form method="post" action="ClienteEditado">
			<table class="tablausr-t tablausr-e">			
					<tr><td >RUT</td><td><input type="text" name="txtrutcliente" id="txtrutcliente" /></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomcliente" id="txtnomcliente" /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapecliente" id="txtapecliente" /></td></tr>
					<tr><td>Teléfono</td><td><input type="text" name="txttelcliente" id="txttelcliente" /></td></tr>
					<tr><td>AFP</td><td><input type="text" name="txtafpcliente" id="txtafpcliente" /></td></tr>
					<tr><td>Sistema de Salud</td><td><select name="sisSalud">
						<option value= "Seleccione"> Seleccione
						<option value="1">Fonasa
						<option value="2">Isapre</select></td></tr>
						
					<tr><td>Direccion</td><td><input type="text" name="txtdirecccliente" id="txtdirecccliente" /></td></tr>
					<tr><td>Comuna</td><td><input type="text" name="txtcomcliente" id="txtcomcliente" /></td></tr>
					<tr><td>Edad</td><td><input type="number" name="txtedadcliente" id="txtedadcliente" /></td></tr>
					<tr><td>Id Usuario</td><td><input type="number" name="txtidclieuser" id="txtidclieuser" /></td></tr>	
				
				
				<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>
</body>
</html>