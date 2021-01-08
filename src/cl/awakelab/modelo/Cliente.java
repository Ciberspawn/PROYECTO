package cl.awakelab.modelo;

/* *
 * @ Clase Cliente
 * @ autores 
 * @ versión 
 * 
 */
public class Cliente  {

	/** Atributos de la clase encapsulados */

	private String ClieRut;
	private String ClieNombre;
	private String ClieApellidos;
	private int ClieTelefono;
	private String ClieAfp;
	private int SistemaSalud;
	private String ClieDireccion;
	private String ClieComuna;
	private int ClieEdad;
	private int usuario_idusuario;
	private String UserNombre;
	private String UserApellido;
	
	
	public Cliente() {
		super();
	}


	public Cliente(String clieRut, String clieNombre, String clieApellidos, int clieTelefono, String clieAfp,
			int sistemaSalud, String clieDireccion, String clieComuna, int clieEdad, int usuario_idusuario,
			String userNombre, String userApellido) {
		super();
		ClieRut = clieRut;
		ClieNombre = clieNombre;
		ClieApellidos = clieApellidos;
		ClieTelefono = clieTelefono;
		ClieAfp = clieAfp;
		SistemaSalud = sistemaSalud;
		ClieDireccion = clieDireccion;
		ClieComuna = clieComuna;
		ClieEdad = clieEdad;
		this.usuario_idusuario = usuario_idusuario;
		UserNombre = userNombre;
		UserApellido = userApellido;
	}


	public String getClieRut() {
		return ClieRut;
	}


	public void setClieRut(String clieRut) {
		ClieRut = clieRut;
	}


	public String getClieNombre() {
		return ClieNombre;
	}


	public void setClieNombre(String clieNombre) {
		ClieNombre = clieNombre;
	}


	public String getClieApellidos() {
		return ClieApellidos;
	}


	public void setClieApellidos(String clieApellidos) {
		ClieApellidos = clieApellidos;
	}


	public int getClieTelefono() {
		return ClieTelefono;
	}


	public void setClieTelefono(int clieTelefono) {
		ClieTelefono = clieTelefono;
	}


	public String getClieAfp() {
		return ClieAfp;
	}


	public void setClieAfp(String clieAfp) {
		ClieAfp = clieAfp;
	}


	public int getSistemaSalud() {
		return SistemaSalud;
	}


	public void setSistemaSalud(int sistemaSalud) {
		SistemaSalud = sistemaSalud;
	}


	public String getClieDireccion() {
		return ClieDireccion;
	}


	public void setClieDireccion(String clieDireccion) {
		ClieDireccion = clieDireccion;
	}


	public String getClieComuna() {
		return ClieComuna;
	}


	public void setClieComuna(String clieComuna) {
		ClieComuna = clieComuna;
	}


	public int getClieEdad() {
		return ClieEdad;
	}


	public void setClieEdad(int clieEdad) {
		ClieEdad = clieEdad;
	}


	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}


	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}


	public String getUserNombre() {
		return UserNombre;
	}


	public void setUserNombre(String userNombre) {
		UserNombre = userNombre;
	}


	public String getUserApellido() {
		return UserApellido;
	}


	public void setUserApellido(String userApellido) {
		UserApellido = userApellido;
	}


	@Override
	public String toString() {
		return "Cliente [ClieRut=" + ClieRut + ", ClieNombre=" + ClieNombre + ", ClieApellidos=" + ClieApellidos
				+ ", ClieTelefono=" + ClieTelefono + ", ClieAfp=" + ClieAfp + ", SistemaSalud=" + SistemaSalud
				+ ", ClieDireccion=" + ClieDireccion + ", ClieComuna=" + ClieComuna + ", ClieEdad=" + ClieEdad
				+ ", usuario_idusuario=" + usuario_idusuario + ", UserNombre=" + UserNombre + ", UserApellido="
				+ UserApellido + "]";
	}


}
