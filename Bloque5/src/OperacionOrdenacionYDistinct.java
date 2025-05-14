import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class OperacionOrdenacionYDistinct {

	public static void main(String[] args) {
		// Creamos un arrayList y un stream a partir de él
		ArrayList<Persona> arrayListPersona = crearArrayList();
		
	
		
		

		// Elimina los repetidos, después ordena por el nombre y luego los imprime
		arrayListPersona.stream().distinct()
				.sorted((persona1, persona2) -> persona1.getNombre().compareTo(persona2.getNombre()))
				.forEach(System.out::println);
		
		//Lo mismo de otra forma, usando Comparing
		
		System.out.println("Usando Comparator.comparing");
		
		arrayListPersona.stream().distinct()
		.sorted(Comparator.comparing(Persona::getNombre))
		.forEach(System.out::println);
		

	}

	private static ArrayList<Persona> crearArrayList() {

		ArrayList<Persona> arrayListPersona = new ArrayList<Persona>();

		arrayListPersona.add(new Persona("22B", "PEPE", "SOL ", 25));
		arrayListPersona.add(new Persona("22B", "PEPE", "ADSFFL ", 24));
		arrayListPersona.add(new Persona("45X", "LOLO", "ADSFFL ", 57));
		arrayListPersona.add(new Persona("46X", "LOLA", "ADSFFL ", 57));
		arrayListPersona.add(new Persona("50X", "ANTONIO", "ADSFFL ", 57));


		return arrayListPersona;
	}

}
