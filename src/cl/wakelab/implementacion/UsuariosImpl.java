package cl.wakelab.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.idao.InterUsuarios;
import cl.awakelab.modelo.Capacitacion;
import cl.awakelab.modelo.Usuario;
import conexion.ConexionSingleton;

public class UsuariosImpl implements InterUsuarios {

	@Override
	public List<Usuario> listaUsuarios() {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;

		List<Usuario> listaUsuarios = new ArrayList<Usuario>();

		String sql = "select idusuario, userrun, usernombre, userapellidos, to_char(userfechanacimiento, 'dd/mm/yyyy'), usertipo from usuario";

		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			System.out.println(sql);
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				Usuario us = new Usuario();
				us.setIdUsuario(rs.getInt(1));
				us.setUserrun(rs.getString(2));
				us.setUsernombre(rs.getString(3));
				us.setUserapellidos(rs.getString(4));
				us.setUserFechaNacimiento(rs.getString(5));
				us.setUserTipo(rs.getString(6));

				listaUsuarios.add(us);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return listaUsuarios;
	}

	@Override
	public boolean registrarUsuario(Usuario itemuser) {
		
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		String sql = "INSERT INTO usuario VALUES(" + itemuser.getIdUsuario() + ", '" + itemuser.getUserrun() + "', '"
				+ itemuser.getUsernombre() + "','" + itemuser.getUserapellidos() + "',TO_DATE('"
				+ itemuser.getUserFechaNacimiento() + "','dd/mm/yyyy') ,'" + itemuser.getUserTipo() + "' )";

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
