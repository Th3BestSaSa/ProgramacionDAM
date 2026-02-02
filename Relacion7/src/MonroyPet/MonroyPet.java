package MonroyPet;

public class MonroyPet {
	public static final int PUNTOS_INICIAL = 0;
	public static final int ALIMENTOS_INICIAL = 2;
	public static final int PUNTOS_POR_ALIMENTO = 30;
	public static final int PUNTOS_POR_MINUTO = 3;
	public static final int MAXIMO_MINUTOS_JUGADO = 20;
	public static final int MAXIMO_CONTROL_PARENTAL = 100;

	public String nombre;
	public String tipo;
	public int puntos;
	public int alimentos;

	public static int totalMinutos;

	/**
	 * @param nombre
	 * @param tipo
	 * @param puntos
	 * @param alimentos
	 */
	public MonroyPet(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos = PUNTOS_INICIAL;
		this.alimentos = ALIMENTOS_INICIAL;
	}

	public void darComida() throws MonroyPetException {
		if (alimentos == 0) {
			throw new MonroyPetException("No hay comida");
		}
		alimentos--;
	}

	public void comprarComida(int cantidad) throws MonroyPetException {
		int puntosAGastar = cantidad * PUNTOS_POR_ALIMENTO;
		if (cantidad <= 0) {
			throw new MonroyPetException("Numero no valido");
		}
		if (puntosAGastar > puntos) {
			throw new MonroyPetException("No hay puntos suficientes");
		}
	}

	public void jugar(int minutos) throws MonroyPetException {
		if (minutos > MAXIMO_MINUTOS_JUGADO || minutos <= 0) {
			throw new MonroyPetException("Minutos incorrectos, no puede superar los " + MAXIMO_MINUTOS_JUGADO);
		}

		puntos = puntos + minutos * PUNTOS_POR_MINUTO;

		totalMinutos = totalMinutos + minutos;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) throws MonroyPetException {

		if (!(this.tipo.equalsIgnoreCase("GATO") || this.tipo.equalsIgnoreCase("PERRO"))) {
			throw new MonroyPetException("El tipo de la mascota no es correcto");
		}

		this.tipo = tipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(int alimentos) {
		this.alimentos = alimentos;
	}

	public static int getTotalMinutos() {
		return totalMinutos;
	}

	public static void setTotalMinutos(int totalMinutos) {
		MonroyPet.totalMinutos = totalMinutos;
	}

	@Override
	public String toString() {
		return "MonroyPet [nombre=" + nombre + ", tipo=" + tipo + ", puntos=" + puntos + ", alimentos=" + alimentos
				+ "]";
	}

}
