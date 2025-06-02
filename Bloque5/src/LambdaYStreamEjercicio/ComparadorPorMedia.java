package LambdaYStreamEjercicio;



import java.util.Comparator;

public class ComparadorPorMedia implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {

		int resultado;

		resultado = Double.compare(o1.calcularPromedio(), o2.calcularPromedio());

		return resultado;
	}

}
