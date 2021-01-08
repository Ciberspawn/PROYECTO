package cl.awakelab.idao;

import java.util.List;

import cl.awakelab.modelo.Capacitacion;
import cl.awakelab.modelo.Usuario;


public interface InterUsuarios {

	public List<Usuario> listaUsuarios();
	
	public boolean registrarUsuario(Usuario itemuser);

}
