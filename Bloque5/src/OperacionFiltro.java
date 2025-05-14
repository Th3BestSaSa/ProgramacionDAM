import java.util.ArrayList;
import java.util.stream.Stream;

public class OperacionFiltro {

	public static void main(String[] args) {
		// Creamos un arrayList y un stream a partir de él
		ArrayList<Persona> arrayListPersona=crearArrayList();
				
		Stream<Persona> stream= arrayListPersona.stream();
		
		//Filtra las personas con más de 24 años y las imprime
		stream.filter((Persona persona) -> persona.getEdad() > 24).forEach(System.out::println);
		
		// Strem de enteros
		
		Integer[] vectorNumeros= {5,8,18,12,25,99,88};
		
		Stream<Integer> streamInt= Stream.of(vectorNumeros);
		
		streamInt.filter(numero->  numero % 2== 0).forEach(System.out::println);
		
	
	}
	
	private static ArrayList<Persona> crearArrayList() {
		
		ArrayList<Persona> arrayListPersona=new ArrayList<Persona>();
		
		arrayListPersona.add( new Persona("22B", "PEPE", "SOL ", 25));	
		arrayListPersona.add(new Persona("21X", "PEPA", "ADSFFL ", 24));	
		arrayListPersona.add( new Persona("45X", "LOLA", "ADSFFL ", 57));

		
		return arrayListPersona;
	}


}
