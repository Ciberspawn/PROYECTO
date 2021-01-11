package cl.awakelab.idao;

import java.util.List;

import cl.awakelab.modelo.Administrativo;
import cl.awakelab.modelo.Cliente;
import cl.awakelab.modelo.Profesional;
import cl.awakelab.modelo.Usuario;


public interface InterUsuarios {

	public List<Usuario> listaUsuarios();
	
	public boolean crearUsuario(Usuario itemuser);
	
	public boolean editarCliente(Cliente itemcliente);
	
	
	public boolean editarAdministrativo(Administrativo itemadmin);
	
	public boolean editarProfesional(Profesional itemprof);
	
	public Cliente obtenerClientePorId(int cliente_idusuario);
	
	public Profesional obtenerProfesionalPorId(int usuario_idusuario);
	
	public Administrativo obtenerAdministrativoPorId(int Usuario_idusuario);
	

}
