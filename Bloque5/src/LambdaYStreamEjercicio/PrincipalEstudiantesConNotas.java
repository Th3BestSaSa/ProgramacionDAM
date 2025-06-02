package LambdaYStreamEjercicio;



public class PrincipalEstudiantesConNotas {

	public static void main(String[] args) {
		
		Estudiante alumno1 ;
		Estudiante alumno2 ;
		Estudiante alumno3 ;
		Estudiante alumno4 ;
		
		SistemaNotas sistema = new SistemaNotas();
		
		try {
			alumno1 = new Estudiante("5987", "Paco");
			alumno1.agregarNota(1.0);
			alumno1.agregarNota(7.4);
			sistema.agregarEstudiante(alumno1);
			alumno2 = new Estudiante("4387", "Mario");
			sistema.agregarEstudiante(alumno2);
			alumno3 = new Estudiante("3447", "Antonio");
			alumno3.agregarNota(5.0);
			alumno3.agregarNota(8.8);
			sistema.agregarEstudiante(alumno3);
			alumno4 = new Estudiante("3448", "Paco");
			sistema.agregarEstudiante(alumno4);
			
			sistema.annadirNotaAEstudiante(10.0, alumno1.getDni());
		}catch(EstudianteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Ordenado por nombre:");
		System.out.println(sistema);
		
		try {
			System.out.println("Ordenado por nota:");
			System.out.println(sistema.toStringOrdernadoEstudiantesPorMedia());
		} catch (EstudianteException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
