<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesoría</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
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
					<tr><td>Id Usuario</td><td><input type="text" name="txtidclieuser" id="txtidclieuser" value='<c:out value="${us.getCliente_idusuario()}" />' readonly="readonly" /></td></tr>		
					<tr><td >RUT</td><td><input type="text" name="txtrutcliente" id="txtrutcliente" value='<c:out value="${us.getRutCliente()}" />' /></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomcliente" id="txtnomcliente" value='<c:out value="${us.getClieNombre()}" />' /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapecliente" id="txtapecliente" value='<c:out value="${us.getClieApellidos()}" />'/></td></tr>
					<tr><td>Teléfono</td><td><input type="text" name="txttelcliente" id="txttelcliente"value='<c:out value="${us.getClieTelefono()}" />' /></td></tr>
					<tr><td>AFP</td><td><input type="text" name="txtafpcliente" id="txtafpcliente" value='<c:out value="${us.getClieAfp()}" />'/></td></tr>
						
					<tr><td>Sistema de Salud</td><td><select name="sisSalud" value='<c:out value="${us.getSistemaSalud()}" />'>
						<option value= "Seleccione"> Seleccione
						<option value="1">Fonasa
						<option value="2">Isapre</select></td></tr>
						
					<tr><td>Direccion</td><td><input type="text" name="txtdirecccliente" id="txtdirecccliente" value='<c:out value="${us.getClieDireccion()}" />'/></td></tr>
					<tr><td>Comuna</td><td><input type="text" name="txtcomcliente" id="txtcomcliente" value='<c:out value="${us.getClieComuna()}" />'/></td></tr>
					<tr><td>Edad</td><td><input type="number" name="txtedadcliente" id="txtedadcliente" value='<c:out value="${us.getClieEdad()}" />' /></td></tr>
						
				
				
				<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>
</body>
</html>