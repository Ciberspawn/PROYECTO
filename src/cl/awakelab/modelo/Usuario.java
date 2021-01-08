package cl.awakelab.modelo;

import java.util.Date;

public class Usuario {
	
	private int idUsuario;
	private String Userrun;
	private String Usernombre;
	private String Userapellidos;
	private String UserFechaNacimiento;
	private String UserTipo;
	
	
	public Usuario() {
		super();
	}


	public Usuario(int idUsuario, String userrun, String usernombre, String userapellidos, String userFechaNacimiento,
			String userTipo) {
		super();
		this.idUsuario = idUsuario;
		Userrun = userrun;
		Usernombre = usernombre;
		Userapellidos = userapellidos;
		UserFechaNacimiento = userFechaNacimiento;
		UserTipo = userTipo;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getUserrun() {
		return Userrun;
	}


	public void setUserrun(String userrun) {
		Userrun = userrun;
	}


	public String getUsernombre() {
		return Usernombre;
	}


	public void setUsernombre(String usernombre) {
		Usernombre = usernombre;
	}


	public String getUserapellidos() {
		return Userapellidos;
	}


	public void setUserapellidos(String userapellidos) {
		Userapellidos = userapellidos;
	}


	public String getUserFechaNacimiento() {
		return UserFechaNacimiento;
	}


	public void setUserFechaNacimiento(String userFechaNacimiento) {
		UserFechaNacimiento = userFechaNacimiento;
	}


	public String getUserTipo() {
		return UserTipo;
	}


	public void setUserTipo(String userTipo) {
		UserTipo = userTipo;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", Userrun=" + Userrun + ", Usernombre=" + Usernombre
				+ ", Userapellidos=" + Userapellidos + ", UserFechaNacimiento=" + UserFechaNacimiento + ", UserTipo="
				+ UserTipo + "]";
	}


	
}
