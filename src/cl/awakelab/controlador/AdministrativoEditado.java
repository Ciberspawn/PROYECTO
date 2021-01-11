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
 * Servlet implementation class AdministrativoEditado
 */
@WebServlet("/AdministrativoEditado")
public class AdministrativoEditado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrativoEditado() {
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
		
		int idadministrativo = Integer.parseInt(request.getParameter("txtidadmin"));
		String adminrun = request.getParameter("txtrutadmin");
		String adminombres = request.getParameter("txtnomadmin");
		String adminapellidos = request.getParameter("txtapeadmin");
		String admincorreo = request.getParameter("txtemailadmin");
		String adminarea = request.getParameter("txtarea");
		int usuario_idusuario = Integer.parseInt(request.getParameter("txtiduseradmin"));
		

		Administrativo ad = new Administrativo();
		ad.setIdadministrativo(idadministrativo);
		ad.setAdminRun(adminrun);
		ad.setAdmiNombres(adminombres);
		ad.setAdminApellidos(adminapellidos);
		ad.setAdminCorreo(admincorreo);
		ad.setAdminArea(adminarea);
		ad.setUsuario_idusuario(usuario_idusuario);
		
		

		UsuariosImpl userimpl = new UsuariosImpl();
		boolean res = userimpl.editarAdministrativo(ad);
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
