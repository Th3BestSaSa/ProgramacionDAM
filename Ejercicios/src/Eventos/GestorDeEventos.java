package Eventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class GestorDeEventos {
	private TreeSet<Evento> eventos;
	private Map<String, Evento> eventosPorNombre;

	public GestorDeEventos() {
		this.eventos = new TreeSet<>();
		this.eventosPorNombre = new HashMap<>();
	}

	public boolean agregarEvento(Evento evento) {

		boolean entra = eventos.add(evento);
		if (!entra) {

		}
		return entra;

	}

	public boolean eliminarEvento(String nombre) {// con el remove de las colecciones
       Iterator<Evento> it = this.eventos.iterator();
       boolean encontrado= false;
       while (it.hasNext() && !encontrado) {
		Evento evento = it.next();
		if(evento.getNombre().equals(nombre)){
			it.remove();
			encontrado= true;
		}
		
	}
	return encontrado;

//		return eventos.removeIf(evento -> evento.getNombre().equals(nombre));

	}

	public void buscarNombre(String nombre) {//revisar
		Iterator<Evento> it = this.eventos.iterator();
		boolean encontrado = false;
		while (it.hasNext()) {
			Evento evento = it.next();
			if (evento.getAsistentes().equals(nombre)) {
				encontrado = true;
			}
	}
	}
	public void mostrarEventosPorFecha() {
		// Ordenar la lista de eventos por fecha
		
		eventos.stream().sorted(Comparator.comparing(Evento::getFecha));

		// Mostrar cada evento
		for (Evento evento : eventos) {
			System.out.println(evento);
		}
	}

	public void mostrarEventosPorNombre() {
		eventosPorNombre.values().stream().sorted(Comparator.comparing(Evento::getNombre)).forEach(System.out::println);
	}

	public List<String> buscarAsistentesPorEvento(String nombreEvento) {
		return null;
	}

	public Optional<Evento> eventoConMenosAsistentes() {
		return Optional.empty();
	}

	public double mediaAsistentes() {
		return 0.0;
	}

	public List<Evento> eventosPorFechaOrdenadosPorNombre(LocalDate fecha) {
		return null;
	}

	public String eventosConMasDe30AsistentesYHoraPosterior(LocalDate fecha) {
		return null;
	}
	public void asistentesEnComun(String nombreEvento1, String nombreEvento2) {
		Iterator<Evento> it= this.eventos.iterator();
	}

}
