package cl.awakelab.idao;

import java.util.List;

import cl.awakelab.modelo.Capacitacion;


public interface InterCapacitacion {
	
	public List<Capacitacion> listaCapacitacion();
	
	
	public boolean registrarCapacitacion(Capacitacion itemcap);
	
	//public boolean eliminarCapacitacion(Capacitacion itemventa);
	//public boolean editarCapacitacion(Capacitacion itemventa);
	//public Capacitacion obtenerCapacitacionPorId(int idCapacitacion);

}
