package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.modelo.Administrativo;

import cl.awakelab.modelo.Cliente;
import cl.awakelab.modelo.Profesional;
import cl.awakelab.modelo.Usuario;

import cl.wakelab.implementacion.UsuariosImpl;


/**
 * Servlet implementation class GuardarUsuario
 */
@WebServlet("/GuardarUsuario")
public class GuardarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuardarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		UsuariosImpl userimpl = new UsuariosImpl();
		

		int iDUsuario = Integer.parseInt(request.getParameter("txtiduser"));
		String userRun = request.getParameter("txtrutuser");
		String userNombre = request.getParameter("txtnomuser");
		String userApellidos = request.getParameter("txtapeuser");
		String UserFechaNacimiento = request.getParameter("txtfnacimiento");
		String UserTipo = request.getParameter("txttipouser");

		Usuario us = new Usuario(iDUsuario, userRun, userNombre, userApellidos, UserFechaNacimiento, UserTipo);
		boolean res = userimpl.crearUsuario(us);
		String msg = "";

		if (res) {
			msg = "El Usuario se agregó exitosamente";
		} else {
			msg = "El Usuario no se pudo agregar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("msgcreacion.jsp").forward(request, response);
		
	}
}
