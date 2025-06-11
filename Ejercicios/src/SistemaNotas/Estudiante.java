package SistemaNotas;

import java.util.*;

public class Estudiante implements Comparable<Estudiante> {
	private String dni;
	private String nombre;
	private HashSet<Nota> notas;

	public Estudiante(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.notas = new HashSet<>();// se ace falta que poner el get y set
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarNota(Nota nota) throws SistemaNotasException {

		boolean insertado = notas.add(nota);
		if (!insertado) {
			throw new SistemaNotasException("Ya existe una nota para ese examen.");
		}
	}

	public double calcularPromedio() {
//        return notas.stream()
//                    .mapToDouble(Nota::getCalificacion)
//                    .average()
//                    .orElse(0);
		double suma = 0;
		for (Nota nota : notas) {
			suma = suma + nota.getCalificacion();
		}
		return suma / notas.size();
	}

	public boolean todosAprobados() {
		Iterator<Nota> it = this.notas.iterator();
		boolean encontrado = false;
		while (it.hasNext()) {
			Nota nota = it.next();
			if (nota.getCalificacion() < 5) {
				encontrado = true;
			}
		}
		return encontrado;

		// return notas.stream().allMatch(n -> n.getCalificacion() >= 5);
	}

	public boolean haAprobadoExamen(String examen) {
		Iterator<Nota> it = this.notas.iterator();
		boolean encontrado = false;
		while (it.hasNext()) {
			Nota nota = it.next();
			if (nota.getCalificacion() < 5 && nota.getNombreExamen().equals(examen)) {
				encontrado = true;
			}
		}
		return encontrado;

		// return notas.stream().allMatch(n -> n.getCalificacion() >= 5);
	}

	public boolean tieneExamenAprobado(String nombreExamen) {
		return notas.stream().filter(n -> n.getNombreExamen().equalsIgnoreCase(nombreExamen))
				.anyMatch(n -> n.getCalificacion() >= 5);
	}

	@Override
	public int compareTo(Estudiante otro) {
		return this.nombre.compareToIgnoreCase(otro.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return nombre + " (" + dni + ") - Promedio: " + calcularPromedio();
	}
}
