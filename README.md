Sistema de Asesorías En Prevención de Riesgos
*********************************************


Desarrolladores:
    - Yamilet Ancan
    - Daniela Segura
    - Juan Pablo Ibañez
    - Fernando Gonzalez 

Repositorios GitHub: 
    - Yamilet Ancan: https://github.com/YamiletNahuelcoy/PROYECTO
    - Daniela Segura: 
    - Juan Pablo Ibañez:
    - Fernando Gonzalez: 


Proyecto:
    El presente proyecto es una plataforma de gestion de la informacion y procesos
    de una empresa de asesorías en aeguridad.
    La plataforma se presenta, entonces, como una solución tecnológica para los 
    procesos de gestión, planificacion, control,  seguridad, y disponibilidad de 
    información para la empresa y sus clientes. 
    
    El proyecto, aún en desarrollo, permite adminsitrar los principales procesos que 
    se llevan a cabo día a día en la empresa.

    Se han implementado funcionalidades y enlaces con base de datos SQL para registrar y editar informacion de la empresa. 
    Para ello se incorporaron al proyecto Los siguientes elementos:


    cl.awakelab.controlador (Servlets Controladores), organizan funcionalidades del sistema:
    - CerrarSesion.java: Controla Cierre de sesion y devuelve al sitio Login.
    - ClienteEditado.java: Valida informacion ingresada en formulario EditarUsuario.
    - Contacto.java: Controla Formulario de contacto para realizar consultas. 
    - CrearCapacitacion.java: Controla Formulario para crear una capacitación en el sistema.
    - CrearUsuario.java: Controla Formulario que permitirá crear un usuario en sistema.
    - EditarCliente.java: Controla Formulario para modificar los datos de un usuario cliente.
    - EditarAdministrativo.java: Controla Formulario para modificar los datos de un usuario administrativo.
    - EditarProfesional.java: Controla Formulario para modificar los datos de un usuario de profesional. 
    - GuardarCapacitacion.java: Valida informacion ingresada en formulario CrearCapacitacion.
    - GuardarUsuario.Java: Valida informacion ingresada en formulario CrearUsuario.
    - Inicio.java: Controla Página de inicio del portal con información relevante del proyecto.
    - ListadoDeUsuarios.java: Controla Listado con los usuarios existentes en plataforma.
    - ListarCapacitaciones.java: Controla Listado de capacitaciones registradas.
    - Login.java: Controla Formulario de acceso al portal para usuarios, a través de su RUT y una clave.
    - ValidarSesion.java: Controla Sitio con acceso a todas las funcionalidades del sistema luego de ingresar RUT y clave.
    - RecibiendoContacto.java: Valida informacion ingresada en formulario Contacto.

    cl.awakelab.idao, Interfaces que alimentan al sistema: 
    - InterCapacitacion.java: Implementa metodos de la entidad Capacitacion.
    - InterUsuarios.java: Implementa metodos de la entidad Usuarios.

    cl.awakelab.modelo, Definiciones de clases o entidades que alimentan el sistema:
    - Administrativo.java: Contiene Objeto Administrativo y sus Metodos.
    - Capacitacion.java: Contiene Objeto Capacitacion y sus Metodos.
    - Cliente.java: Contiene Objeto Cliente y sus Metodos.
    - LoginUser.java: Contiene Objeto LoginUser y sus Metodos.
    - Profesional.java: Contiene Objeto Profesional y sus Metodos.
    - Usuario.java: Contiene Objeto Usuario y sus Metodos.
    - Contacto.java: Contiene Objeto Contacto y sus Metodos.

    cl.awakelab.implementacion (DAO), implementa las interfaces se conecta y obtiene la informacion de la base de datos
    y la entrega al controlador y viceversa:
    - CapacitacionImpl.java: Implementa interfaz de gestion Capacitaciones.
    - UsuariosImpl.java: Implementa interfaz de gestion de Usuarios.

    conexion; gestiona conectxion a SQL.
    - ConexionSingleton.java: Conecta con base de datos del Sistema en SQL.

    WEB-INF (Vistas), intefaces graficas de las funciones del Sistema:
    - Contacto.jsp: Formulario de contacto para realizar consultas. 
    - CrearCapacitacion.jsp: Formulario para crear una capacitación en el sistema.
    - CrearUsuario.jsp: Formulario que permitirá crear un usuario en sistema.
    - EditarAdministrativo.jsp: Formulario para modificar los datos de un usuario administrativo.
    - EditarCliente.jsp: Formulario para modificar los datos de un usuario cliente.
    - EditarProfesional.jsp: Formulario para modificar los datos de un usuario de profesional. 
    - Index.jsp: Página de inicio del portal con información relevante del proyecto.
    - ListadoDeUsuarios.jsp: Controla Listado con los usuarios existentes en plataforma.
    - ListarCapacitaciones.jsp: Controla Listado de capacitaciones registradas.
    - Login.jsp: Controla Formulario de acceso al portal para usuarios, a través de su RUT y una clave.
    - msgcreacion.jsp: Contiene mensajes del Sistema.
    - SesionCreada.jsp: Sitio con acceso a todas las funcionalidades del sistema luego de ingresar RUT y clave.


    Como complemento el proyecto contempla documento Estilos.css con informacion 
    y configuracion del aspecto y estetica general de los sitios.

    Finalmente se contempla tambien un documento script.js con scripts de configuracion de validacion,
    plugins y otras funciones asociadas a los sitios del proyecto. 



