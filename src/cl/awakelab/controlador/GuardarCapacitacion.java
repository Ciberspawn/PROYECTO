package cl.awakelab.controlador;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.awakelab.modelo.Capacitacion;
import cl.wakelab.implementacion.CapacitacionImpl;


/**
 * Servlet implementation class GuardarCapacitacion
 */
@WebServlet("/GuardarCapacitacion")
public class GuardarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int iDCapacitacion = Integer.parseInt(request.getParameter("txtid"));
		String Capfecha = request.getParameter("txtfecha");
		String Caphora = request.getParameter("txthora");
		String Caplugar = request.getParameter("txtlugar");
		int Capduracion = Integer.parseInt(request.getParameter("txtduracion"));
		String Cliente_RutCliente = request.getParameter("rutcliente");
		
		Capacitacion cap = new Capacitacion(iDCapacitacion,Capfecha,Caphora,Caplugar,Capduracion,Cliente_RutCliente);
		CapacitacionImpl capimpl = new CapacitacionImpl();
		boolean res = capimpl.registrarCapacitacion(cap);
		String msg = "";
		
		if (res) {
			msg = "La capacitación se agregó exitosamente";
		}
		else {
			msg = "La capacitación no se pudo agregar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("msgcreacion.jsp").forward(request, response);
}

	
	

	
	
	
}
