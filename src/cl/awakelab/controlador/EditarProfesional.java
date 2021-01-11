package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.modelo.Administrativo;
import cl.awakelab.modelo.Profesional;
import cl.wakelab.implementacion.UsuariosImpl;

/**
 * Servlet implementation class EditarProfesional
 */
@WebServlet("/EditarProfesional")
public class EditarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfesional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int Usuario_idusuario = Integer.parseInt(request.getParameter("idUsuario"));

		UsuariosImpl usimpl = new UsuariosImpl();
		Profesional profaux = usimpl.obtenerProfesionalPorId(Usuario_idusuario);

		request.setAttribute("pr", profaux);
		request.getRequestDispatcher("EditarProfesional.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
