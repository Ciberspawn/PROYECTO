package cl.awakelab.idao;

import java.util.List;

import cl.awakelab.modelo.Administrativo;
import cl.awakelab.modelo.Cliente;
import cl.awakelab.modelo.Profesional;
import cl.awakelab.modelo.Usuario;


public interface InterUsuarios {

	public List<Usuario> listaUsuarios();
	
	public boolean crearUsuario(Usuario itemuser);
	
	public boolean editarCliente(Usuario itemuser, Cliente itemcliente);
	
	
	public boolean editarAdministrativo(Usuario itemuser, Administrativo itemadmin);
	
	public boolean editarProfesional(Usuario itemuser, Profesional itemprof);
	
	public Cliente obtenerClientePorId(String RutCliente, int usuario_idusuario);
	
	public Profesional obtenerProfesionalPorId(int idProfesional, int usuario_idusuario);
	
	public Administrativo obtenerAdministrativoPorId(int Admin_id, int usuario_idusuario);
	

}
