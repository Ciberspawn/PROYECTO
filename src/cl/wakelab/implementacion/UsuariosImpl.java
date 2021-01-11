package cl.wakelab.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.idao.InterUsuarios;
import cl.awakelab.modelo.Administrativo;
import cl.awakelab.modelo.Cliente;
import cl.awakelab.modelo.Profesional;
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

	//**************************************************************************************************************************
	//Crear al usuario con tipo de cliente y solicita la conexión a la base de datos.
	
	@Override
	public boolean crearUsuario(Usuario itemuser) {
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

	//********************************************************************************************************************
	//Conexión a la base de datos y editar la usuario tipo cliente
	@Override
	public boolean editarCliente(Cliente itemcliente) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		
		String sql = "UPDATE cliente SET RutCliente ='"+itemcliente.getRutCliente()+"',clienombres ='"+itemcliente.getClienombres()+"', cliapellidos ='"
				+itemcliente.getCliapellidos()+"', clitelefono='"+itemcliente.getClitelefono()+"', cliafp='"+itemcliente.getCliafp()+"', clisistemasalud="
				+itemcliente.getClisistemasalud()+",clidireccion='"+itemcliente.getClidireccion()+"', clicomuna='"+itemcliente.getClicomuna()+"',CliEdad="
				+itemcliente.getCliEdad()+" WHERE usuario_idusuario="+itemcliente.getCliente_idusuario()+")";
		
try {
	con = ConexionSingleton.getConnection();
	stm = con.createStatement();
	System.out.println(sql);
	stm.execute(sql);
	resultado = true;
	stm.close();
	// con.close();
} catch (SQLException e) {
	System.out.println(e);
}

return resultado;
	}
	
	//*****************************************************************************************************************************
	//Solicita el rut del cliente que es la llave primaria y el id del usuario que es la llave foránea
	@Override
	public Cliente obtenerClientePorId(int cliente_idusuario) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		Cliente c = new Cliente();
		
		String sql = "select rutcliente, clienombres, cliapellidos, clitelefono, cliafp, clisistemasalud, clidireccion, clicomuna, cliedad, usuario_idusuario from cliente WHERE usuario_idusuario = " +cliente_idusuario+ "";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				c.setRutCliente(rs.getString(1));
				c.setClienombres(rs.getString(2));
				c.setCliapellidos(rs.getString(3));
				c.setClitelefono(rs.getString(4));
				c.setCliafp(rs.getString(5));
				c.setClisistemasalud(rs.getInt(6));				
				c.setClidireccion(rs.getString(7));
				c.setClicomuna(rs.getString(8));
				c.setCliEdad(rs.getInt(9));
				c.setCliente_idusuario(rs.getInt(10));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return c;
	}
	
	//********************************************************************************************************************
	//Conexión a la base de datos y editar al usuario tipo Administrativo

	@Override
	public boolean editarAdministrativo(Administrativo itemadmin) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		
		String sql = "UPDATE cliente SET Admin_id="
				+ itemadmin.getIdadministrativo() + " AdminRun ='"				 
				+ itemadmin.getAdminRun() + "',Adminombres='" 
				+ itemadmin.getAdmiNombres() + "',AdminApellidos='" 
				+ itemadmin.getAdminApellidos() + "',AdminCorreo='" 
				+ itemadmin.getAdminCorreo()+ "',AdminArea='" 
				+ itemadmin.getAdminArea()+"'WHERE Usuario_idusuario ="
				+ itemadmin.getUsuario_idusuario()+")";
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			System.out.println(sql);
			stm.execute(sql);
			resultado = true;
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	
	
		return resultado;
	}
	
	//*******************************************************************************************************************************
	//Obtener usuario administrativo por id para editar 
	@Override
	public Administrativo obtenerAdministrativoPorId(int Usuario_idusuario) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		Administrativo a = new Administrativo();
		
		String sql = "select idadministrativo, AdminRun, AdmiNombres,AdminApellidos, AdminCorreo,AdminArea, Usuario_idusuario from administrativo where Usuario_idusuario = "+Usuario_idusuario+"";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				a.setIdadministrativo(rs.getInt(1));
				a.setAdminRun(rs.getString(2));
				a.setAdmiNombres(rs.getString(3));
				a.setAdminApellidos(rs.getString(4));
				a.setAdminCorreo(rs.getString(5));
				a.setAdminArea(rs.getString(6));
				a.setUsuario_idusuario(rs.getInt(7));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return a;
	}
	
	
	//********************************************************************************************************************
	//Conexión a la base de datos y editar la usuario tipo Profesional

	@Override
	public boolean editarProfesional(Profesional itemprof) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		String sql = "UPDATE cliente SET IdProfesional= "
					+ itemprof.getIdProfesional() + ", ProfRun ='"					
					+ itemprof.getProfRun() + "', ProfNombres='" 
					+ itemprof.getProfNombres() + "', ProfApellidos='" 
					+ itemprof.getProfApellidos() + "', ProfTelefono='" 
					+ itemprof.getProfTelefono() + "',ProfTitulo='" 
					+ itemprof.getProfTitulo()+ "',ProfProyecto='"
					+ itemprof.getProfProyecto()+"'	WHERE  Usuario_idusuario="
					+ itemprof.getUsuario_idusuario()+")";
		
		 
			
			try {
				con = ConexionSingleton.getConnection();
				stm = con.createStatement();
				System.out.println(sql);
				stm.execute(sql);
				resultado = true;
				stm.close();
				//con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
			return resultado;
	}

	
	//*******************************************************************************************************************************
    //Obtener usuario administrativo por id para editar 
	@Override
	public Profesional obtenerProfesionalPorId(int usuario_idusuario) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		Profesional p = new Profesional();
		
		String sql = "select idprofesional, profrun, profnombres, profapellidos, proftelefono, proftitulo, profproyecto from profesional where usuario_idusuario = "+ usuario_idusuario+"";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				p.setIdProfesional(rs.getInt(1));
				p.setProfRun(rs.getString(2));
				p.setProfNombres(rs.getString(3));
				p.setProfApellidos(rs.getString(4));
				p.setProfTitulo(rs.getString(5));
				p.setProfProyecto(rs.getString(6));
				p.setUsuario_idusuario(rs.getInt(7));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return p;
	}
	

}
