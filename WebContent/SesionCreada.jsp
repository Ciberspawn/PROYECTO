<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio Día 5</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>

	<header id="seccion">
		<h2>
			Bienvenido
			<c:out value="${nombreReal}"></c:out>
		</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="iconos/icono-menu.png" alt=""
				class="icon-menu" for="check"></label>

			<nav class="menu"></nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
		<ol>
			<li><a href="<%=request.getContextPath()%>/Contacto.jsp">Contacto</a></li>

			<li><a
				href="<%=request.getContextPath()%>/CrearCapacitacion.jsp">Crear
					Capacitaciones</a></li>
			<li><a
				href="<%=request.getContextPath()%>/ListarCapacitaciones">Listar
					Capacitaciones</a></li>

			<li><a
				href="<%=request.getContextPath()%>/ListadoDeUsuarios.jsp">Listado
					de Usuarios</a></li>
			<li><a href="<%=request.getContextPath()%>/CrearUsuarios.jsp">Crear
					Usuarios</a></li>
			<li><a href="<%=request.getContextPath()%>/CerrarSesion.jsp">Cerrar
					Sesión</a></li>
		</ol>


	</fieldset>
<footer id="pie">
		<blockquote>
			<a href="CrearCapacitacion">Crear Nueva Capacitacion</a>
		</blockquote>
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>