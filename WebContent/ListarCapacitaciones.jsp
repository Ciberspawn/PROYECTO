<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h2>LISTADO DE CAPACITACIONES</h2>
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
		<table class="cel- tablaadm-t tablaadm-e">
			<tr class="negrita">
				<td>Id Capacitación</td>
				<td>Fecha de Capacitación</td>
				<td>Hora de Capacitación</td>
				<td>Lugar</td>
				<td>Duración</td>
				<td>Rut del Cliente</td>
			</tr>
			<c:forEach items="${listacap}" var="lc">
				<tr>
					<td><c:out value="${lc.getiDCapacitacion()}" /></td>
					<td><c:out value="${lc.getCapfecha()}" /></td>
					<td><c:out value="${lc.getCaphora()}" /></td>
					<td><c:out value="${lc.getCaplugar()}" /></td>
					<td><c:out value="${lc.getCapduracion()}" /></td>
					<td><c:out value="${lc.getCliente_RutCliente()}" /></td>
				</tr>
			</c:forEach>

		</table>

	</fieldset>
	<footer id="pie">
		<blockquote>
			<a href="CrearCapacitacion">Crear Nueva Capacitacion</a>
		</blockquote>
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>