import java.util.ArrayList;
import java.util.stream.Stream;

public class CreandoStreams {

	public static void main(String[] args) {
		
		// Creamos un arrayList y un stream a partir de él
		ArrayList<Persona> arrayListPersona=crearArrayList();
		
		Stream<Persona> streamDeArrayList= arrayListPersona.stream();
		
		//Creamos un arrayList y un stream a partir de él
		
		streamDeArrayList.forEach((Persona persona)-> System.out.println(persona));
		// De otra forma: streamDeArrayList.forEach(System.out::println);
		
		Persona[] arrayPersonas= { new Persona("22B", "JUANA", "SOL ", 25), new Persona("21X", "JUAN", "ADSFFL ", 24),
								new Persona("45X", "LOLA", "ADSFFL ", 57)};
		
		Stream<Persona> streamDeArray= Stream.of(arrayPersonas);
		
		//Creamos un array y un stream a partir de él
		
		streamDeArray.forEach((Persona persona)-> System.out.println(persona));	
		
		Stream<String> streamCadenas=Stream.of("Sevilla", "Córdoba", "Madrid");
		
		//Imprimir todas las ciudades en mayúscula
		streamCadenas.forEach((String cadena)-> System.out.println(cadena.toUpperCase()));
		
		
		
	}

	private static ArrayList<Persona> crearArrayList() {
	
		ArrayList<Persona> arrayListPersona=new ArrayList<Persona>();
		
		arrayListPersona.add( new Persona("22B", "PEPE", "SOL ", 25));	
		arrayListPersona.add(new Persona("21X", "PEPA", "ADSFFL ", 24));	
		arrayListPersona.add( new Persona("45X", "LOLA", "ADSFFL ", 57));

		
		return arrayListPersona;
	}

}
