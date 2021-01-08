package cl.wakelab.implementacion;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import cl.awakelab.idao.InterCapacitacion;
import cl.awakelab.modelo.Capacitacion;
import conexion.ConexionSingleton;

public class CapacitacionImpl implements InterCapacitacion {

	@Override
	public List<Capacitacion> listaCapacitacion() {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		String sql = "select idcapacitacion, to_char(capfecha,'dd/mm/yyyy'), to_char(caphora,'HH24:MI:SS'), caplugar, capduracion, cliente_rutcliente from capacitacion";

		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				Capacitacion cap = new Capacitacion();
				cap.setiDCapacitacion(rs.getInt(1));
				cap.setCapfecha(rs.getString(2));
				cap.setCaphora(rs.getString(3));
				cap.setCaplugar(rs.getString(4));
				cap.setCapduracion(rs.getInt(5));
				cap.setCliente_RutCliente(rs.getString(6));
				listaCapacitacion.add(cap);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return listaCapacitacion;
	}

	@Override
	public boolean registrarCapacitacion(Capacitacion itemcap) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		String sql = "INSERT INTO CAPACITACION VALUES(" + itemcap.getiDCapacitacion() + ", TO_DATE('"
				+ itemcap.getCapfecha() + "','dd/mm/yyyy') ,TO_DATE('" + itemcap.getCaphora() + "','HH24:MI:SS'), '"
				+ itemcap.getCaplugar() + "', " + itemcap.getCapduracion() + ", '" + itemcap.getCliente_RutCliente()
				+ "' )";

		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			System.out.println(sql);
			stm.execute(sql);
			resultado = true;
			stm.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return resultado;
	}

}
