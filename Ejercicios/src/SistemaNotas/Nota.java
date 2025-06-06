package SistemaNotas;


import java.util.Objects;

public class Nota {
    private String nombreExamen;
    private double calificacion;

    public Nota(String nombreExamen, double calificacion) {
        this.nombreExamen = nombreExamen;
        this.calificacion = calificacion;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nota)) return false;
        Nota otra = (Nota) obj;
        return nombreExamen.equalsIgnoreCase(otra.nombreExamen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreExamen.toLowerCase());
    }
}
