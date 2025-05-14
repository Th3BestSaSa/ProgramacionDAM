import java.util.ArrayList;

public class OperacionForEach {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> arrayListPersonas=crearArrayList();
		
		System.out.println("Mostrando contenido con forEach de stream");
		
		arrayListPersonas.stream().forEach(System.out::println);
		
		
		System.out.println("Mostrando contenido con forEach directo de coleccion");
		
		arrayListPersonas.forEach(System.out::println);

	}

	
	
	private static ArrayList<Persona> crearArrayList() {
		
		ArrayList<Persona> arrayListPersonas=new ArrayList<Persona>();
		
		arrayListPersonas.add( new Persona("22B", "PEPE", "SOL ", 25));	
		arrayListPersonas.add(new Persona("21X", "PEPA", "ADSFFL ", 24));	
		arrayListPersonas.add( new Persona("45X", "LOLA", "ADSFFL ", 57));

		
		return arrayListPersonas;
	}

}
