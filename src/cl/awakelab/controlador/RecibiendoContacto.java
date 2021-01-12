package cl.awakelab.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecibiendoContacto
 */
@WebServlet("/RecibiendoContacto")
public class RecibiendoContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecibiendoContacto() {
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
		
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String mensaje = request.getParameter("mensaje");
		
		System.out.println("Nombre "+" "+nombre);
		System.out.println("Correo "+" "+correo);
		System.out.println("Telefono "+" "+telefono);
		System.out.println("Mensaje "+" "+mensaje);
		
		
		
		request.getRequestDispatcher("Inicio").forward(request, response);
	}

}
