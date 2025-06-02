package LambdaYStreamEjercicio;



import java.util.ArrayList;
import java.util.Objects;

public class Estudiante implements Comparable<Estudiante> {

	private String dni;
	private String nombre;
	private ArrayList<Double> listaDeNotas;

	public Estudiante(String dNI, String nombre) {
		super();
		setDni(dNI);
		setNombre(nombre);
		listaDeNotas = new ArrayList<Double>();
	}

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void agregarNota(Double nota) throws EstudianteException {

		if (nota < 0) {
			throw new EstudianteException("La nota no puede ser negativa");
		}

		if (nota > 10) {
			throw new EstudianteException("La nota no puede ser superior a 10");
		}

		listaDeNotas.add(nota);

	}

	/**
	 * Este método devuelve -1 si el estudiante no tiene ninguna nota.
	 * @return
	 */
	public Double calcularPromedio() {

		Double promedio = 0.0;
//
//		if (listaDeNotas.size() == 0) {
//			promedio = -1.0;
//		} else {
//			for (int i = 0; i < listaDeNotas.size(); i++) {
//				promedio = listaDeNotas.get(i) + promedio;
//			}
//
//			promedio = promedio / listaDeNotas.size();
//		}
//
//		return promedio;
		return listaDeNotas.stream().mapToDouble(e -> e).average().getAsDouble();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("\n").append("Estudiante [DNI= " + dni + ", nombre= " + nombre + ", ");
		
		if(calcularPromedio() == -1) {
			sb.append("mediaNotas= Sin notas]");
		} else {
			sb.append("mediaNotas=" + calcularPromedio() + "]");
		}
		
		

		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
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
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Estudiante o) {

		return this.nombre.compareTo(o.nombre);
	}

}
