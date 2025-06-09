package Eventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Objects;

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
    public void agregarAsistente(String nombre) {
        // Agregar asistente
    }

    @Override
    public int compareTo(Evento otro) {
        int comparacionFecha = this.fecha.compareTo(otro.fecha);
        if (comparacionFecha != 0) return comparacionFecha;
        return this.hora.compareTo(otro.hora);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
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
