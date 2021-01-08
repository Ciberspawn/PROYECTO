package cl.awakelab.modelo;

public class LoginUser {
	
	private String nombre;
	private String pass;
	private String nombreReal;
	
	
	public LoginUser() {
		super();
	}


	public LoginUser(String nombre, String pass, String nombreReal) {
		super();
		this.nombre = nombre;
		this.pass = pass;
		this.nombreReal = nombreReal;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

	

	public String getNombreReal() {
		return nombreReal;
	}


	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", nombreReal=" + nombreReal + "]";
	}
	
		
	

}
