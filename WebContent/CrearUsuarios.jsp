<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa De Asesorías</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>


</head>
<body>
	<header id="seccion">
		<h2>CREAR USUARIO</h2>
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
		<form method="post" action="GuardarUsuario">
			<table class="tablausr-t tablausr-e">

				<tr><td>Id Usuario</td><td><input type="number" name="txtiduser" id="txtiduser" /></td></tr>
				<tr><td>RUT</td><td><input type="text" name="txtrutuser" id="txtrutuser" /></td></tr>
				<tr><td>Nombres</td><td><input type="text" name="txtnomuser" id="txtnomuser" /></td></tr>
				<tr><td>Apellidos</td><td><input type="text" name="txtapeuser" id="txtapeuser" /></td></tr>
				<tr><td>Fecha de nacimiento</td><td><input type="date" name="txtfnacimiento" id="txtfnacimiento" /></td>
				<tr><td >Tipo de usuario</td>
				<td ><input type="radio" name="txttipouser" value="Cliente"id="Cliente"  />Cliente 
					<input type="radio" name="txttipouser" value="Profesional" id="Profesional" />Profesional
					<input type="radio" name="txttipouser" value="Administrativo" id="Administrativo" />Administrativo	</td></tr>				
						
							
				<td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td>

			</table>
		</form>
		
	</fieldset>
	<footer id="pie"> Derechos Reservados G1 &copy; 2020 </footer>
</body>
</html>