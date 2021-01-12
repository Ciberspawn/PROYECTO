<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesoría</title>
<link rel="stylesheet" href="Estilos.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
	<script src="script.js"></script>
</head>
<body>
<header id="seccion">
        <h2> Mensajes</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"
                for="check"></label>        
        </div>
    </header>

		<p><c:out value="${mensaje}" /></p><br/>
		<a href="ListarCapacitaciones">Volver al listado de capacitaciones</a>
		</body>
</html>