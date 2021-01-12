<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesorías</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>

	<header id="seccion">
		<h2>FORMULARIO DE CONTACTO</h2>
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
		<form method="post" action="RecibiendoContacto">
			<table class="cel- tablas-t tablas-e">
				<tr>
					<td>Nombre</td>
					<td><input type="text" name="nombre" id="nombre"/></td>
				</tr>
				<tr>
					<td>Correo Electrónico</td>
					<td><input type="email" name="email" id="correo"/></td>
				</tr>
				<tr>
					<td>Teléfono</td>
					<td><input type="text" name="telefono" id="telefono" /></td>
				</tr>
				<tr>
					<td>Mensaje</td>
					<td><input type="text" name="mensaje" id="mensaje"/></td>
				</tr>
				<tr>
				<td><input type="hidden" name="parametro" value="sesion"></td>
                <td><input type="submit" value="Mostrar por consola"></td>

				</tr>
			</table>
		</form>

	</fieldset>

	<footer id="pie">
		<blockquote>
			<a href="Inicio">Volver a la página de Inicio</a>
		</blockquote>
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>