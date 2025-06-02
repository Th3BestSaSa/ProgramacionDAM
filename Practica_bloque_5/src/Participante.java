import java.util.*;

public class Participante implements Comparable<Participante> {
    private String dni;
    private String nombre;
    private LinkedList<Relato> relatos;

    // Constructor
    public Participante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.relatos = new LinkedList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    // Añade un relato, validando que no esté duplicado
    public void annadirRelato(Relato relato) throws ConcursoException {
        if (this.relatos.contains(relato))
            throw new ConcursoException("El relato ya se encuentra añadido.");
        this.relatos.add(relato);
    }

    // Elimina los relatos con puntuación menor a 5
    public void eliminarRelatosPuntuacionMenorA5() {
        Iterator<Relato> it = this.relatos.iterator();
        while (it.hasNext()) {
            Relato relato = it.next();
            if (relato.getPuntuacion() < 5)
                it.remove();
        }
    }

    // Devuelve un listado de relatos de cierto género con puntuación > 8, ordenados por título
    public String listadoRelatosConPuntuacionMayorA8DeGenero(String genero) {
        StringBuilder sb = new StringBuilder();
        LinkedList<Relato> listaOrdenada = new LinkedList<>();

        for (Relato relato : this.relatos) {
            if (relato.getGenero().equals(genero) && relato.getPuntuacion() > 8) {
                listaOrdenada.add(relato);
            }
        }

        Collections.sort(listaOrdenada);

        for (Relato relato : listaOrdenada) {
            sb.append(relato).append("\n");
        }

        return sb.toString();
    }

    // Devuelve relatos seleccionados para la final, ordenados por puntuación ascendente
    public List<Relato> relatosSeleccionadosParaLaFinalOrdenadosPorPuntuacion() {
        LinkedList<Relato> listaOrdenada = new LinkedList<>();

        for (Relato relato : this.relatos) {
            if (relato.isSeleccionado())
                listaOrdenada.add(relato);
        }

        // Ordenación por puntuación
        listaOrdenada.sort((relato1, relato2) -> Double.compare(relato1.getPuntuacion(), relato2.getPuntuacion()));

        return listaOrdenada;
    }

    // Suma de puntuaciones de relatos seleccionados de un género específico
    public double sumaPuntuacionesEnUnGenero(String genero) throws ConcursoException {
        double suma = 0;
        boolean contieneGenero = false;

        for (Relato relato : relatos) {
            if (relato.isSeleccionado() && relato.getGenero().equals(genero)) {
                suma += relato.getPuntuacion();
                contieneGenero = true;
            }
        }

        if (!contieneGenero) {
            throw new ConcursoException("El participante no contiene relatos con dicho género.");
        }

        return suma;
    }

    // HashCode y Equals basados en el DNI
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante other = (Participante) obj;
        return Objects.equals(dni, other.dni);
    }

    // Comparación por número de relatos seleccionados
    @Override
    public int compareTo(Participante o) {
        return Integer.compare(this.numeroRelatosSeleccionados(), o.numeroRelatosSeleccionados());
    }

    private int numeroRelatosSeleccionados() {
        int contador = 0;
        for (Relato relato : this.relatos) {
            if (relato.isSeleccionado()) {
                contador++;
            }
        }
        return contador;
    }

    // Representación textual del participante
    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + this.numeroRelatosSeleccionados();
    }
}
