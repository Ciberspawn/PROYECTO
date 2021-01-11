package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.modelo.Administrativo;
import cl.awakelab.modelo.Cliente;
import cl.wakelab.implementacion.UsuariosImpl;

/**
 * Servlet implementation class EditarAdministrativo
 */
@WebServlet("/EditarAdministrativo")
public class EditarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarAdministrativo() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		int Usuario_idusuario = Integer.parseInt(request.getParameter("idUsuario"));

		UsuariosImpl usimpl = new UsuariosImpl();
		Administrativo adminaux = usimpl.obtenerAdministrativoPorId(Usuario_idusuario);

		request.setAttribute("ad", adminaux);
		request.getRequestDispatcher("EditarAdministrativo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
