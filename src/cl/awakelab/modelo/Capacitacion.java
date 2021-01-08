package cl.awakelab.modelo;

import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/* *
 * @ Clase hija Capacitación
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public class Capacitacion  {

	/** Atributos de la clase encapsulados */
	private int iDCapacitacion;	
	private String Capfecha;
	private String Caphora;
	private String Caplugar;
	private int Capduracion;
	private String Cliente_RutCliente;
	
	
	public Capacitacion() {
		super();
	}


	public Capacitacion(int iDCapacitacion, String capfecha, String caphora, String caplugar, int capduracion,
			String cliente_RutCliente) {
		super();
		this.iDCapacitacion = iDCapacitacion;
		Capfecha = capfecha;
		Caphora = caphora;
		Caplugar = caplugar;
		Capduracion = capduracion;
		Cliente_RutCliente = cliente_RutCliente;
	}


	public int getiDCapacitacion() {
		return iDCapacitacion;
	}


	public void setiDCapacitacion(int iDCapacitacion) {
		this.iDCapacitacion = iDCapacitacion;
	}


	public String getCapfecha() {
		return Capfecha;
	}


	public void setCapfecha(String capfecha) {
		Capfecha = capfecha;
	}


	public String getCaphora() {
		return Caphora;
	}


	public void setCaphora(String caphora) {
		Caphora = caphora;
	}


	public String getCaplugar() {
		return Caplugar;
	}


	public void setCaplugar(String caplugar) {
		Caplugar = caplugar;
	}


	public int getCapduracion() {
		return Capduracion;
	}


	public void setCapduracion(int capduracion) {
		Capduracion = capduracion;
	}


	public String getCliente_RutCliente() {
		return Cliente_RutCliente;
	}


	public void setCliente_RutCliente(String cliente_RutCliente) {
		Cliente_RutCliente = cliente_RutCliente;
	}


	@Override
	public String toString() {
		return "Capacitacion [iDCapacitacion=" + iDCapacitacion + ", Capfecha=" + Capfecha + ", Caphora=" + Caphora
				+ ", Caplugar=" + Caplugar + ", Capduracion=" + Capduracion + ", Cliente_RutCliente="
				+ Cliente_RutCliente + "]";
	}


	
}
