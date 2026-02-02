package Equipos;

public class Partido {

	// Constantes
	private static final int MIN_JORNADA = 1;
	private static final int MAX_JORNADA = 38;
	private static final char SEPARADOR = '-';
	
	// Atributos
	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private char resultadoQuiniela;
	private boolean yaJugado;

	/**
	 * Constructor de la clase Partido.
	 * 
	 * @param jornada
	 *            Jornada en la que se jugará.
	 * @param equipoLocal
	 *            El primer equipo.
	 * @param equipoVisitante
	 *            El segundo equipo.
	 * @throws LigaException
	 *             Se lanza si la jornada está fuera de los límites.
	 */
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws LigaException {
		if (equipoLocal.equals(equipoVisitante))
			throw new LigaException("Los equipos que se enfrentan deben ser distintos");
		
		setJornada(jornada);
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
		yaJugado = false;

	}

	
	public int getJornada() {
		return jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() throws LigaException {
		if ( !yaJugado)
			throw new LigaException("El partido todavía no se ha jugado");
		return golesLocal;
	}

	public int getGolesVisitante() throws LigaException {
		if ( !yaJugado)
			throw new LigaException("El partido todavía no se ha jugado");
		return golesVisitante;
	}

	public char getResultadoQuiniela() throws LigaException {
		if ( !yaJugado)
			throw new LigaException("El partido todavía no se ha jugado");
		return resultadoQuiniela;
	}

	
	/**
	 * Establece la jornada del Partido.
	 * 
	 * @param nuevaJornada
	 *            La jornada a establecer.
	 * @throws LigaException
	 *             Se lanza si la jornada está fuera de los límites.
	 */
	private void setJornada(int nuevaJornada) throws LigaException {
		if (nuevaJornada < MIN_JORNADA || nuevaJornada > MAX_JORNADA) {
			throw new LigaException("Error. La jornada está fuera de los límites.");
		}
		this.jornada = nuevaJornada;
	}

	private void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	private void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	
	/**
	 * Método toString del Partido, que varía según se haya jugado o no.
	 */
	@Override
	public String toString() {
		
		String cadena;

		
		if (this.yaJugado == false) {
			cadena = "Partido entre equipo local " + equipoLocal.getNombreEquipo() + " y equipo visitante "
					+ this.equipoVisitante.getNombreEquipo() + " todavía no se ha jugado.";
			;
		} else {
			cadena = "Partido entre equipo local " + equipoLocal.getNombreEquipo() + " y el equipo visitante "
					+ this.equipoVisitante.getNombreEquipo() + " jugado en el estadio "
					+ this.equipoLocal.getNombreEstadio() + " de la ciudad " + equipoLocal.getCiudad()
					+ " ha finalizado con " + golesLocal + " goles del equipo local y " + golesVisitante
					+ " goles del equipo visitante. Resultado quiniela= " + resultadoQuiniela;
		}
		return cadena;
	}

	
	/**
	 * Establece el resultado del partido, actualizando los goles locales y
	 * visitantes, el resultado de la quiniela y los partidos ganados por cada
	 * equipo.
	 * 
	 * @param cadenaEntrada
	 *            El resultado de la quiniela, en formato N-N. Se comprueba que
	 *            esté bien construido.
	 * @throws LigaException
	 *             Se lanza si el formato de la cadena es incorrecto.
	 */
	public void ponerResultado(String cadenaEntrada) throws LigaException {

		int posicionGuion;

		posicionGuion= cadenaEntrada.indexOf(SEPARADOR);
		
		if (posicionGuion <0){
			throw new LigaException("Error. El formato del resultado es incorrecto.");
		}
		// Si salta la excepción NumberFormatException es porque no son numericas, las posiciones esperadas de los goles.
		// En ese caso se lanza la excepción LigaException
		
		
		try {
			setGolesLocal(Integer.parseInt(cadenaEntrada.substring(0, posicionGuion)));
			setGolesVisitante(Integer.parseInt(cadenaEntrada.substring(posicionGuion +1)));

		} catch (NumberFormatException e) {
			throw new LigaException("Error. El formato del resultado es incorrecto");
		}
		
		yaJugado = true;

		if (golesLocal > golesVisitante) {
			this.equipoLocal.incrementarPartidosGanados();
			this.resultadoQuiniela = '1';
		} else {
			if (this.golesLocal < this.golesVisitante) {
				this.equipoVisitante.incrementarPartidosGanados();
				this.resultadoQuiniela = '2';
			} else {
				this.resultadoQuiniela = 'X';
			}
		}

	}

	private void setGolesVisitante(int golesVisitante) throws LigaException {
		if ( golesVisitante < 0)
			throw new LigaException("Error, goles visitante incorrecto");
		this.golesVisitante= golesVisitante;
		
	}


	private void setGolesLocal(int golesLocal) throws LigaException {
		if ( golesLocal < 0)
			throw new LigaException("Error, goles local incorrecto");
		this.golesLocal= golesLocal;
		
	}




	
}
