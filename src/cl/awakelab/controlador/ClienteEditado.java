package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.modelo.Cliente;
import cl.wakelab.implementacion.UsuariosImpl;

/**
 * Servlet implementation class ClienteEditado
 */
@WebServlet("/ClienteEditado")
public class ClienteEditado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteEditado() {
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
		
		
		String RutCliente = request.getParameter("txtrutcliente");
		String ClieNombre = request.getParameter("txtnomcliente");
		String ClieApellidos = request.getParameter("txtapecliente");
		String ClieTelefono = request.getParameter("txttelcliente");
		String ClieAfp = request.getParameter("txtafpcliente");
		int SistemaSalud = Integer.parseInt(request.getParameter("sisSalud"));
		String ClieDireccion = request.getParameter("txtdirecccliente");
		String ClieComuna = request.getParameter("txtcomcliente");
		int ClieEdad = Integer.parseInt(request.getParameter("txtedadcliente"));
		int usuario_idusuario = Integer.parseInt(request.getParameter("txtidclieuser"));
		

		Cliente clie = new Cliente();
		clie.setCliente_idusuario(usuario_idusuario);
		clie.setRutCliente(RutCliente);
		clie.setClieNombre(ClieNombre);
		clie.setClieApellidos(ClieApellidos);
		clie.setClieTelefono(ClieTelefono);		
		clie.setClieAfp(ClieAfp);
		clie.setSistemaSalud(SistemaSalud);
		clie.setClieDireccion(ClieDireccion);
		clie.setClieComuna(ClieComuna);
		clie.setClieEdad(ClieEdad);
		

		UsuariosImpl userimpl = new UsuariosImpl();
		boolean res = userimpl.editarCliente(clie);
		String msg = "";

		if (res) {
			msg = "El cliente se editó exitosamente";
		} else {
			msg = "El cliente no se pudo editó porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("msgcreacion.jsp").forward(request, response);

	}

}
