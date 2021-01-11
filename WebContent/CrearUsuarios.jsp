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

<STYLE>

.contenido{
display: none;
}
</STYLE>
<script type="text/javascript">
	
	$(document).ready(function() {
		$('#Cliente').click(function() {
			$('#contCliente').fadeIn(1000);
		})
		$('#contCliente').click(function() {
			$('#contCliente').fadeOut(1000);
		})

		$('#Profesional').click(function() {
			$('#contprofesional').fadeIn(1000);
		})
		$('#contprofesional').click(function() {
			$('#contprofesional').fadeOut(1000);
		})

		$('#Administrativo').click(function() {
			$('#contadministraivo').fadeIn(1000);
		})
		$('#contadministraivo').click(function() {
			$('#contadministraivo').fadeOut(1000);
		})

	})
</script>
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
		<form method="post" action="GuardarUsuario">
			<table class="tablausr-t tablausr-e">

				<tr><td>Id Usuario</td><td><input type="number" name="txtiduser" id="txtiduser" /></td></tr>
				<tr><td>RUT</td><td><input type="text" name="txtrutuser" id="txtrutuser" /></td></tr>
				<tr><td>Nombres</td><td><input type="text" name="txtnomuser" id="txtnomuser" /></td></tr>
				<tr><td>Apellidos</td><td><input type="text" name="txtapeuser" id="txtapeuser" /></td></tr>
				<tr><td>Fecha de nacimiento</td><td><input type="date" name="txtfnacimiento" id="txtfnacimiento" /></td>
				<tr><td >Tipo de usuario</td>
				<td ><input type="radio" name="´txttipouser" value="Cliente"id="Cliente"  />Cliente 
					<input type="radio" name="´txttipouser" value="Profesional" id="Profesional" />Profesional
					<input type="radio" name="´txttipouser" value="Administrativo" id="Administrativo" />Administrativo	</td></tr>				
						
				<table ID="contCliente" class="contenido" >				
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
				</table>
				<table ID="contprofesional" class="contenido">
				    <tr><td>Identificador(ID)</td><td><input type="number" name="txtidprof" id="txtidprof" /></td></tr>				
					<tr><td >RUT</td><td><input type="text" name="txtrutprof" id="txtrutprof" /></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomprof" id="txtnomprof" /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapeprof" id="txtapeprof" /></td></tr>
					<tr><td>Teléfono</td><td><input type="text" name="txttelprof" id="txttelprof" /></td></tr>
					<tr><td>Titulo</td><td><input type="text" name="txttitulo" id="txttitulo" /></td></tr>
					<tr><td>Proyecto</td><td><input type="text" name="txtproyecto" id="txtproyecto" /></td></tr>
					
				</table>
				
				<table ID="contadministraivo" class="contenido">
				    <tr><td>Identificador(ID)</td><td><input type="number" name="txtidadmin" id="txtidadmin" /></td></tr>				
					<tr><td >RUT</td><td><input type="text" name="txtrutadmin" id="txtrutadmin" /></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomadmin" id="txtnomadmin" /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapeadmin" id="txtapeadmin" /></td></tr>
					<tr><td>Correo</td><td><input type="email" name="txtemailadmin" id="txtemailadmin" /></td></tr>
					<tr><td>Área</td><td><input type="text" name="txtarea" id="txtarea" /></td></tr>
										
				</table>
			
				<td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td>

			</table>
		</form>
		
	</fieldset>
	<footer id="pie"> Derechos Reservados G1 &copy; 2020 </footer>
</body>
</html>