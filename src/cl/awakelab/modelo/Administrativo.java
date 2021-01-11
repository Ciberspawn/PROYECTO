package cl.awakelab.modelo;


public class Administrativo {
	
	/** Atributos de la clase encapsulados */
	private int idadministrativo;
	private String AdminRun;
	private String AdmiNombres;
	private String AdminApellidos;
	private String AdminCorreo;
	private String AdminArea;
	private int usuario_idusuario;
	
	
	
	public Administrativo() {
		super();
	}



	public Administrativo(int idadministrativo, String adminRun, String admiNombres, String adminApellidos,
			String adminCorreo, String adminArea, int usuario_idusuario) {
		super();
		this.idadministrativo = idadministrativo;
		AdminRun = adminRun;
		AdmiNombres = admiNombres;
		AdminApellidos = adminApellidos;
		AdminCorreo = adminCorreo;
		AdminArea = adminArea;
		this.usuario_idusuario = usuario_idusuario;
	}



	public int getIdadministrativo() {
		return idadministrativo;
	}



	public void setIdadministrativo(int idadministrativo) {
		this.idadministrativo = idadministrativo;
	}



	public String getAdminRun() {
		return AdminRun;
	}



	public void setAdminRun(String adminRun) {
		AdminRun = adminRun;
	}



	public String getAdmiNombres() {
		return AdmiNombres;
	}



	public void setAdmiNombres(String admiNombres) {
		AdmiNombres = admiNombres;
	}



	public String getAdminApellidos() {
		return AdminApellidos;
	}



	public void setAdminApellidos(String adminApellidos) {
		AdminApellidos = adminApellidos;
	}



	public String getAdminCorreo() {
		return AdminCorreo;
	}



	public void setAdminCorreo(String adminCorreo) {
		AdminCorreo = adminCorreo;
	}



	public String getAdminArea() {
		return AdminArea;
	}



	public void setAdminArea(String adminArea) {
		AdminArea = adminArea;
	}



	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}



	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}



	@Override
	public String toString() {
		return "Administrativo [idadministrativo=" + idadministrativo + ", AdminRun=" + AdminRun + ", AdmiNombres="
				+ AdmiNombres + ", AdminApellidos=" + AdminApellidos + ", AdminCorreo=" + AdminCorreo + ", AdminArea="
				+ AdminArea + ", usuario_idusuario=" + usuario_idusuario + "]";
	}



	
}
