package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.awakelab.modelo.LoginUser;

/**
 * Servlet implementation class ValidarSesion
 */
@WebServlet("/ValidarSesion")
public class ValidarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidarSesion() {
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

		String nombre, pass;
		nombre = request.getParameter("txtnombre");
		pass = request.getParameter("txtpass");
		
		

		if (nombre.equalsIgnoreCase("admin")) {
			if (pass.equalsIgnoreCase("1234")) {
				/* correcto */
				
				LoginUser user = new LoginUser(nombre, pass, "Yamilet Ancan Nahuelcoy");
				user.getNombreReal();
				String nombreReal = "Yamilet Ancan Nahuelcoy";
				HttpSession session = request.getSession();
				session.setAttribute("nombreReal", nombreReal);				
				request.setAttribute("nombreReal", nombreReal);
				
				request.getRequestDispatcher("SesionCreada.jsp").forward(request, response);

			} else {
				/* pass incorrecta */
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}

		} else {
			/* nombre incorrecto */

			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}

	}

}
