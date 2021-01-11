package cl.awakelab.modelo;

/* *
 * @ Clase Cliente
 * @ autores 
 * @ versión 
 * 
 */
public class Cliente  {

	/** Atributos de la clase encapsulados */

	private String RutCliente;
	private String ClieNombre;
	private String ClieApellidos;
	private String ClieTelefono;
	private String ClieAfp;
	private int SistemaSalud;
	private String ClieDireccion;
	private String ClieComuna;
	private int ClieEdad;
	private int usuario_idusuario;
	
	
	
	public Cliente() {
		super();
	}



	public Cliente(String rutCliente, String clieNombre, String clieApellidos, String clieTelefono, String clieAfp,
			int sistemaSalud, String clieDireccion, String clieComuna, int clieEdad, int usuario_idusuario) {
		super();
		RutCliente = rutCliente;
		ClieNombre = clieNombre;
		ClieApellidos = clieApellidos;
		ClieTelefono = clieTelefono;
		ClieAfp = clieAfp;
		SistemaSalud = sistemaSalud;
		ClieDireccion = clieDireccion;
		ClieComuna = clieComuna;
		ClieEdad = clieEdad;
		this.usuario_idusuario = usuario_idusuario;
	}



	public String getRutCliente() {
		return RutCliente;
	}



	public void setRutCliente(String rutCliente) {
		RutCliente = rutCliente;
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



	public String getClieTelefono() {
		return ClieTelefono;
	}



	public void setClieTelefono(String clieTelefono) {
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



	@Override
	public String toString() {
		return "Cliente [RutCliente=" + RutCliente + ", ClieNombre=" + ClieNombre + ", ClieApellidos=" + ClieApellidos
				+ ", ClieTelefono=" + ClieTelefono + ", ClieAfp=" + ClieAfp + ", SistemaSalud=" + SistemaSalud
				+ ", ClieDireccion=" + ClieDireccion + ", ClieComuna=" + ClieComuna + ", ClieEdad=" + ClieEdad
				+ ", usuario_idusuario=" + usuario_idusuario + "]";
	}


	
}
