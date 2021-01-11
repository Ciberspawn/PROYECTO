<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesor�a</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>
<header id="seccion">
		<h2>EDITAR ADMINISTRATIVO</h2>
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
							Sesi�n</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<form method="post" action="AdministrativoEditado">
			<table class="tablausr-t tablausr-e">
					<tr><td>Id de Usuario</td><td><input type="number" name="txtiduseradmin" id="txtiduseradmin" value='<c:out value="${ad.getUsuario_idusuario()}" />' readonly="readonly" /></td></tr>	
					<tr><td>Id de Administrativo</td><td><input type="number" name="txtidadmin" id="txtidadmin" value='<c:out value="${ad.getIdadministrativo()}" />' readonly="readonly" /></td></tr>				
					<tr><td >RUT</td><td><input type="text" name="txtrutadmin" id="txtrutadmin" value='<c:out value="${ad.getAdminRun()}" />'/></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomadmin" id="txtnomadmin" value='<c:out value="${ad.getAdmiNombres()}" />' /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapeadmin" id="txtapeadmin" value='<c:out value="${ad.getAdminApellidos()}" />' /></td></tr>
					<tr><td>Correo</td><td><input type="email" name="txtemailadmin" id="txtemailadmin" value='<c:out value="${ad.getAdminCorreo()}" />' /></td></tr>
					<tr><td>�rea</td><td><input type="text" name="txtarea" id="txtarea" value='<c:out value="${ad.getAdminArea()}" />' /></td></tr>

			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>
</body>
</html>