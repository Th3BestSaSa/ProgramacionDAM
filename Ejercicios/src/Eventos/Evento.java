package Eventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Evento implements Comparable<Evento> {
	private String nombre;
	private LocalDate fecha;
	private LocalTime hora;
	private LinkedList<String> asistentes;

	public Evento(String nombre, LocalDate fecha, LocalTime hora) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.asistentes = new LinkedList<>();
	}
	public Evento(String nombre) {
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public LinkedList<String> getAsistentes() {
		return asistentes;
	}

	public void agregarAsistente(String nombreEvento, String asistente) throws EventosException {
		if (asistentes.contains(asistente)) {
			throw new EventosException ("Error");
		}
				asistentes.add(asistente);
	}

	@Override
	public int compareTo(Evento otro) {
		int comparacionFecha = this.fecha.compareTo(otro.fecha);
		if (comparacionFecha != 0)
			return comparacionFecha;
		return this.hora.compareTo(otro.hora);
	}
public Set<String> asistentesEnComun(String asistente) throws EventosException{//mirar los asistentes de la lista que coinciden en dos eventos distintos 
 var asistentes= new HashSet<String>();
 
 for (String otroAsistente : asistentes) {
     if (this.asistentes.contains(otroAsistente)) {
    	 asistentes.add(otroAsistente);
     }
 }
return asistentes;
}
public void asistentesEnComun(String nombreEvento1, String nombreEvento2) {
	
}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Evento))
			return false;
		Evento evento = (Evento) o;
		return Objects.equals(nombre, evento.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public String toString() {
		return nombre + " - " + fecha + " " + hora + " - Asistentes: " + asistentes.size();
	}
}
