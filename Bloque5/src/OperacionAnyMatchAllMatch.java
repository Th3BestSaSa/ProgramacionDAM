import java.util.ArrayList;

public class OperacionAnyMatchAllMatch {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> arrayListPersonas=crearArrayList();
		
		
		
		boolean algunNombreEmpiezaPor= arrayListPersonas.stream().anyMatch(persona-> persona.getNombre().startsWith("L") );
		if ( algunNombreEmpiezaPor)
			System.out.println("Hay algun nombre que empieza por L");
		
		
		boolean todosNombresEmpiezanPor= arrayListPersonas.stream().allMatch(persona-> persona.getNombre().startsWith("L") );
		if ( todosNombresEmpiezanPor)
			System.out.println("Todos los nombres empiezan por L");
		
		
	

	}

	
	
	private static ArrayList<Persona> crearArrayList() {
		
		ArrayList<Persona> arrayListPersonas=new ArrayList<Persona>();
		
		arrayListPersonas.add( new Persona("22B", "PEPE", "SOL ", 25));	
		arrayListPersonas.add(new Persona("21X", "PEPA", "ADSFFL ", 24));	
		arrayListPersonas.add( new Persona("45X", "LOLA", "ADSFFL ", 57));

		
		return arrayListPersonas;
	}

}
