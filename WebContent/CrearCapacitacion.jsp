<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesrías</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>
	<header id="seccion">
		<h2>CREAR CAPACITACION</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="iconos/icono-menu.png" alt=""
				class="icon-menu" for="check"></label>

			<nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/Login">Login</a></li>
					<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>

					<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear
							Capacitaciones</a></li>
					<li><a
						href="<%=request.getContextPath()%>/ListarCapacitaciones">Listar
							Capacitaciones</a></li>
					<li><a href="<%=request.getContextPath()%>/ListadoDeUsuarios">Listado de Usuarios</a></li>
					<li><a href="<%=request.getContextPath()%>/CrearUsuario">Crear usuarios</a></li>
					<li><a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar
							Sesión</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
	<form method="post" action="GuardarCapacitacion">
			<table class="cel- tablas-t tablas-e">
			
			<tr><td>ID Capacitación</td><td><input type="text" name="txtid" id="txtid" /></td></tr>
			<tr><td>Fecha de capacitación</td><td><input type="date" name="txtfecha" id="txtfecha" /></td></tr>
			<tr><td>Hora de capacitación</td><td><input type="time" name="txthora" id="txthora" /></td></tr>
			<tr><td>Lugar</td><td><input type="text" name="txtlugar" id="txtlugar" /></td></tr>
			<tr><td>Duración</td><td><input type="text" name="txtduracion" id="txtduracion" /></td></tr>
			<tr><td>Rut del cliente</td><td><input type="text" name="rutcliente" id="rutcliente" /></td></tr>
			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Capacitación" /><br/></td></tr>
			</table>
		</form>
	</fieldset>
	<footer id="pie">
		<blockquote>
			<a href="index.html">Volver a la página de Inicio</a>
		</blockquote>
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>