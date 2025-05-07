
package Ejercicio2;


import java.util.LinkedList;

/**
 * TODO Descripción de la clase Evento.
*
* @author DAM1
* @date 30 abr 2025
 */
public class Evento {
	public String nombre;
	public String fecha;
	public  LinkedList<String> listaDeAsistentes = new LinkedList<>();
	public Evento(String nombre, String fecha, LinkedList<String> listaDeAsistentes) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.listaDeAsistentes = listaDeAsistentes;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
	
	
}
