package Super;

import java.util.LinkedList;

public class Caja {

	private int numeroCaja;
	private boolean abierta;
	private LinkedList<Integer> cola;

	private static int ultimoNumero = 1;

	public Caja(int numero) {
		this.numeroCaja = numero;
		this.abierta = false;
		this.cola = new LinkedList<Integer>();

	}

	public int getNumeroCaja() {
		return numeroCaja;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) throws CajaException {
		if (!abierta && !cola.isEmpty()) {
			throw new CajaException("No se puede cerrar la caja con clientes esperando.");
		}
		this.abierta = abierta;
	}

	public Integer annadirCliente() throws CajaException {
		if (!abierta) {
			throw new CajaException("La caja no esta abierta");
		}

		int numeroCliente = ultimoNumero++;// Genera un número de cliente único:
		/**
		 * ultimoNumero es una variable estática (static int) que se comparte entre
		 * todas las instancias de Caja.
		 * 
		 * Este número se asigna al nuevo cliente, asegurando que cada uno tenga un ID
		 * único.
		 * 
		 * Luego, ultimoNumero se incrementa automáticamente (++), preparándose para el
		 * siguiente cliente.
		 * 
		 */
		cola.add(numeroCliente);// Añade el cliente a la cola
		return numeroCliente;

	}

	public Integer atenderCliente() throws CajaException {
		if (!abierta) {
			throw new CajaException("La caja no esta abierta");
		}

		if (cola.isEmpty()) {
			throw new CajaException("No hay clientes");
		}
		return cola.poll();
		/**
		 * poll() elimina y devuelve el primer elemento de la cola.
		 * 
		 * Simula que el cliente fue atendido y sale del sistema.
		 * 
		 * 
		 */

	}

	public int numeroDeClientesEsperando() {
		return cola.size();
	}

}
