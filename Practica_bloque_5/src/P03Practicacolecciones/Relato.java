package P03Practicacolecciones;

import java.util.Objects;

public class Relato {
	private String titulo;
	private String genero;
	private boolean seleccionado;
	private double puntuacion;

	public Relato(String titulo, String genero,  boolean seleccionado, double puntuacion)
			throws ConcursoException {
		this.titulo = titulo;
		this.genero = genero;
		this.seleccionado = seleccionado;
		if (puntuacion < 0 || puntuacion > 10) {
			throw new ConcursoException("Puntación incorrecta");
		}
		this.puntuacion = puntuacion;
	}

	// Getters y Setters

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}


	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	@Override
	public String toString() {
		return titulo + " - " + genero + " - " + puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relato other = (Relato) obj;
		return Objects.equals(titulo, other.titulo);
	}

}
