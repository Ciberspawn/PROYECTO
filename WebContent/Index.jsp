<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesor�as</title>
<link rel="stylesheet" href="Estilos.css">
 <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>
<header id="seccion">
        <h2> INICIO</h2>
        <h2>Nombre de nuestra Empresa</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"
                for="check"></label>

        <nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/Login">Login</a></li>
					
				</ul>
			</nav>
      
        </div>
    </header>
    <fieldset class="cel- agrupar-t agrupar-e">
        <section>

                <h3>�CU�L ES EL OBJETIVO DEL SISTEMA DE INFORMACI�N?</h3>

                <p class="cel- texto-t texto-e">Administrar los principales procesos que se llevan a cabo en ella d�a a d�a.</p>
        </section>

        <section>

                <h3>�QUI�NES DEBER�AN USAR EL SISTEMA?</h3>

                <p class="cel- texto-t texto-e">Personal responsable de los principales procesos</p>
        </section>

        <section>

                <h3>�QU� PROCESOS CONSIDERA LA PLATAFORMA ACTUALMENTE?</h3>

                <p class="cel- texto-t texto-e">Asesor�as en prevenci�n de riesgos</p>
        </section>
    </fieldset>
    <footer id="pie">
        Derechos Reservados G1 &copy; 2020
    </footer>

</body>
</html>