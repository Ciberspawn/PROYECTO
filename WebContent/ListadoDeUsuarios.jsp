<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesorías</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>

</head>
<body>
	<header id="seccion">
		<h2>LISTADO DE USUARIOS</h2>
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
					<li><a href="<%=request.getContextPath()%>/CrearUsuario">Crear Usuarios</a></li>
					<li><a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar
							Sesión</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
		<table class="cel- tablaadm-t tablaadm-e">
			<tr class="negrita">
				<td>ID Usuario</td>
				<td>RUN</td>
				<td>Nombre</td>
				<td>Apellidos</td>
				<td>Fecha de Nacimiento</td>
				<td>Tipo de Usuario</td>
				<td></td>
				<td></td>
			</tr>
										
			<c:forEach items="${listauser}" var="lus">
			<tr>
				<td><c:out value="${lus.getIdUsuario()}" /></td>
				<td><c:out value="${lus.getUserrun()}" /></td>
				<td><c:out value="${lus.getUsernombre()}" /></td>
				<td><c:out value="${lus.getUserapellidos()}" /></td>
				<td><c:out value="${lus.getUserFechaNacimiento()}" /></td>
				<td id="tipo"><c:out value="${lus.getUserTipo()}"  /></td>
				
				<c:if test="${lus.getUserTipo()=='Cliente' }">
				<td><a href="EditarCliente?idUsuario=<c:out value='${lus.getIdUsuario()}'/>">Editar</a></td>				
				</c:if>	
						<c:if test="${lus.getUserTipo()=='Administrativo' }">
				<td><a href="EditarAdministrativo?idUsuario=<c:out value='${lus.getIdUsuario()}'/>">Editar</a></td>				
				</c:if>	
				<c:if test="${lus.getUserTipo()=='Profesional' }">
				<td><a href="EditarProfesional?idUsuario=<c:out value='${lus.getIdUsuario()}'/>">Editar</a></td>				
				</c:if>		
			</tr>
			
			</c:forEach>						
			

		</table>

	</fieldset>
	<footer id="pie">
		<blockquote>
			<a href="CrearUsuario">Crear un nuevo usuario</a>
		</blockquote>
		Derechos Reservados G3 &copy; 2020
	</footer>

</body>
</html>