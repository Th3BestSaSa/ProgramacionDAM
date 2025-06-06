package JuegoRol;

public class Clerigo extends Personaje{
	
private String deidad;
	public Clerigo(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMaxima, String deidad)
			throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		this.deidad = deidad;
	}

	
}
