import java.util.ArrayList;
import java.util.Comparator;


public class OperacionDeAcumulacionMaximoYMinimo {

	public static void main(String[] args) {
		// Creamos un arrayList y un stream a partir de él
		ArrayList<Persona> arrayListPersonas = crearArrayList();

	

		// Obtiene un stream con todas la edades y luego las suma
		int sumaEdades= arrayListPersonas.stream().mapToInt(Persona::getEdad).sum();
		
		//Obtiene un stream con todas la edades y luego obtiene el máximo y el mínimo.
		//El método max y min devuelve un OptionalInt en este caso, para convertir a  Integer, usamos
		// getAsInt
		
		Integer mayorEdad=arrayListPersonas.stream().mapToInt(Persona::getEdad).max().getAsInt();
		
		Integer menorEdad=arrayListPersonas.stream().mapToInt(Persona::getEdad).min().getAsInt();
		
		Double mediaDeEdad=arrayListPersonas.stream().mapToInt(Persona::getEdad).average().getAsDouble();
		
		
		System.out.println("Suma de las edades " +sumaEdades);
		System.out.println("Edad mayor " +  mayorEdad);
		System.out.println("Edad menor " + menorEdad);
		System.out.println("Media de edades "  + mediaDeEdad);
		
		//Obtiene la persona con edad mínima y máxima
		
		Persona personaEdadMinima= arrayListPersonas.stream().min( (persona1, persona2) -> Integer.compare(persona1.getEdad(), persona2.getEdad())).get();
		
		Persona personaEdadMaxima= arrayListPersonas.stream().max( Comparator.comparing(Persona::getEdad)).get();
		
		System.out.println("Persona con edad minima " + personaEdadMinima);
		System.out.println("Persona con edad máxima " + personaEdadMaxima);
		
	}

	private static ArrayList<Persona> crearArrayList() {

		ArrayList<Persona> arrayListPersona = new ArrayList<Persona>();

		arrayListPersona.add(new Persona("22B", "PEPE", "SOL ", 25));
		arrayListPersona.add(new Persona("22B", "PEPE", "LUNA ", 24));
		arrayListPersona.add(new Persona("45X", "LOLO", "SILOS ", 57));
		arrayListPersona.add(new Persona("46X", "LOLA", "MIGUEL PRO", 22));
		arrayListPersona.add(new Persona("50X", "ANTONIO", "ANDRES RO", 59));


		return arrayListPersona;
	}

}
