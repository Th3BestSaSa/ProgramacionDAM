import java.util.Objects;

public class Relato implements Comparable<Relato> {
    private String titulo;
    private String genero;
    private boolean seleccionado;
    private double puntuacion;

    // Constructor con validación de la puntuación
    public Relato(String titulo, String genero, boolean seleccionado, double puntuacion)
            throws ConcursoException {
        this.titulo = titulo;
        this.genero = genero;
        this.seleccionado = seleccionado;

        if (puntuacion < 0 || puntuacion > 10) {
            throw new ConcursoException("Puntación incorrecta");
        }
        this.puntuacion = puntuacion;
    }

    // Getters
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

    // Representación en texto del relato
    @Override
    public String toString() {
        return titulo + " - " + genero + " - " + puntuacion;
    }

    // HashCode y Equals usando el título como identificador único
    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Relato other = (Relato) obj;
        return Objects.equals(titulo, other.titulo);
    }

    // Comparación por orden alfabético del título
    @Override
    public int compareTo(Relato o) {
        return this.titulo.compareTo(o.titulo);
    }
}
