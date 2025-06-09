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

    public boolean agregarEvento(Evento nombreEventos) {
    	return eventos.add(nombreEventos);
       
    }

    public boolean eliminarEvento(String nombre) {
       Iterator<Evento> it = this.eventos.iterator();
       boolean encontrado= false;
       while (it.hasNext()) {
		Evento evento = it.next();
		if(evento.getNombre().equals(nombre)){
			it.remove();
			encontrado= true;
		}
		
	}
	return encontrado;
    }

    public boolean agregarAsistente(String nombreEvento, String asistente) {
    	 Iterator<Evento> it = this.eventos.iterator();
         boolean encontrado= false;
         while (it.hasNext()) {
  		Evento evento = it.next();
  		if(evento.getNombre().equals(nombreEvento)){
  			evento.getAsistentes().add(asistente);
  			encontrado= true;
       
    }
         }
		return encontrado;
    }
    public void mostrarEventosPorFecha() {
        // Mostrar eventos por fecha
    }

    public void mostrarEventosPorNombre() {
        // Mostrar eventos por nombre
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
}
