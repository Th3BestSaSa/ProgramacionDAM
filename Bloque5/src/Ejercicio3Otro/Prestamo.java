package Ejercicio3Otro;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {

	private Libro libro;
	private LocalDate fecha;
	
	public Prestamo(Libro libro) {
		this.libro = libro;
		fecha=LocalDate.now();
	}

	public Libro getLibro() {
		return libro;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Prestamo del libro=" + libro + ", en fecha " + fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(libro, other.libro);
	}

	
	

	
	
	
}
