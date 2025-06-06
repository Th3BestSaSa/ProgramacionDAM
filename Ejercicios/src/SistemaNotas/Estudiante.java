package SistemaNotas;

import java.util.*;

public class Estudiante implements Comparable<Estudiante> {
    private String dni;
    private String nombre;
    private HashSet<Nota> notas = new HashSet<>();

    public Estudiante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public Set<Nota> getNotas() { return Collections.unmodifiableSet(notas); }

    public void agregarNota(Nota nota) throws SistemaNotasException{
        if (notas.contains(nota)) {
            throw new SistemaNotasException ("Ya existe una nota para ese examen.");
        }
        notas.add(nota);
    }


    public double calcularPromedio() {
        return notas.stream()
                    .mapToDouble(Nota::getCalificacion)
                    .average()
                    .orElse(0);
    }

    public boolean todosAprobados() {
        return notas.stream().allMatch(n -> n.getCalificacion() >= 5);
    }

    public boolean tieneExamenAprobado(String nombreExamen) {
        return notas.stream()
                    .filter(n -> n.getNombreExamen().equalsIgnoreCase(nombreExamen))
                    .anyMatch(n -> n.getCalificacion() >= 5);
    }

    @Override
    public int compareTo(Estudiante otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - Promedio: " + calcularPromedio();
    }
}
