import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionDeMapeoYPasoAColecciones {

	public static void main(String[] args) {
		// Creamos un arrayList y un stream a partir de él
		ArrayList<Persona> arrayListPersonas = crearArrayList();


		//  Mapear solo la edad
		
		arrayListPersonas.stream().map(Persona::getEdad).forEach(System.out::println);
		
		
		//  Mapear solo la edad, y crear una colección con ellas
		List<Integer> lista=arrayListPersonas.stream().map(Persona::getEdad).collect(Collectors.toList());
		
		System.out.println("Contenido de la lista:");
		for(Integer num: lista) {
			System.out.println(num);
		}
			
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
