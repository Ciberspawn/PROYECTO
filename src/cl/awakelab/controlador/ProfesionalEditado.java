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
 * Servlet implementation class ProfesionalEditado
 */
@WebServlet("/ProfesionalEditado")
public class ProfesionalEditado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfesionalEditado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int idProfesional = Integer.parseInt(request.getParameter("txtidprof"));
		String ProfRun = request.getParameter("txtrutprof");
		String ProfNombres = request.getParameter("txtnomprof");
		String ProfApellidos = request.getParameter("txtapeprof");
		String ProfTelefono = request.getParameter("txttelprof");
		String ProfTitulo = request.getParameter("txttitulo");
		String ProfProyecto = request.getParameter("txtproyecto");
		int usuario_idusuario = Integer.parseInt(request.getParameter("txtiduser"));
		

		Profesional pr = new Profesional();
		pr.setIdProfesional(idProfesional);
		pr.setProfRun(ProfRun);
		pr.setProfNombres(ProfNombres);
		pr.setProfApellidos(ProfApellidos);
		pr.setProfTelefono(ProfTelefono);
		pr.setProfTitulo(ProfTitulo);
		pr.setProfProyecto(ProfProyecto);
		pr.setUsuario_idusuario(usuario_idusuario);
		
		

		UsuariosImpl userimpl = new UsuariosImpl();
		boolean res = userimpl.editarProfesional(pr);
		String msg = "";

		if (res) {
			msg = "El cliente se editó exitosamente";
		} else {
			msg = "El cliente no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("msgcreacion.jsp").forward(request, response);
	}

}
