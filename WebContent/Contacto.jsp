<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
					<li><a href="<%=request.getContextPath()%>/Contacto" >Contacto</a></li>
					
					<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear
							Capacitaciones</a></li>
					<li><a
						href="<%=request.getContextPath()%>/ListarCapacitaciones">Listar
							Capacitaciones</a></li>
							<li><a
						href="<%=request.getContextPath()%>/ListadoDeUsuarios">Listar
							Capacitaciones</a></li>
							<li><a
						href="<%=request.getContextPath()%>/CrearUsuario">Listar
							Capacitaciones</a></li>
					<li><a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar
							Sesión</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<form>
			<table class="cel- tablas-t tablas-e">
				<tr>
					<td>Nombre</td>
					<td><input type="text" name="nombre" /></td>
				</tr>
				<tr>
					<td>Correo Electrónico</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>Teléfono</td>
					<td><input type="text" name="telefono" /></td>
				</tr>
				<tr>
					<td>Mensaje</td>
					<td><input type="text" name="mensaje" /></td>
				</tr>
			</table>
		</form>

	</fieldset>

	<footer id="pie">
		<blockquote>
			<a href="index.html">Volver a la página de Inicio</a>
		</blockquote>
		Derechos Reservados G3 &copy; 2020
	</footer>

</body>
</html>