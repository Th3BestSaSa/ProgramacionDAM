package Super;

import java.util.ArrayList;

public class Mercadona {

	private static final int MAXIMO_CAJAS = 20;
	private ArrayList<Caja> listaDeCajas;

	public Mercadona() {

		listaDeCajas = new ArrayList<Caja>();

		for (int i = 0; i < MAXIMO_CAJAS; i++) {
			listaDeCajas.add(new Caja(i + 1));
		}
	}

	public void abrirCaja(int numeroCaja) throws CajaException {

		Caja caja = listaDeCajas.get(numeroCaja - 1);
		if (caja.isAbierta()) {
			throw new CajaException("abierta");
		}
		caja.setAbierta(true);
	}

	public void cerrarCaja(int numeroCaja) throws CajaException {
		Caja caja = listaDeCajas.get(numeroCaja - 1);
		if (!caja.isAbierta()) {
			throw new CajaException("cerrada");
		}
		caja.setAbierta(false);
	}

	public String nuevoCliente() throws CajaException {
		int indiceCaja = this.cajaMenosCliente();
		Caja caja = this.listaDeCajas.get(indiceCaja);
		int numeroClientes = caja.annadirCliente();
		String solucion = "El cliente" + numeroClientes + "debe ir a la caja " + listaDeCajas.get(0);
		return solucion;

	}

	/**
	 * 
	 * @return Devuelve el número de caja que tiene menos clientes
	 * @throws CajaException Si todas las cajas están cerradas
	 */

	private int cajaMenosCliente() throws CajaException {
		int minimoDeClientes= Integer.MAX_VALUE; 
		
//		Empezar con un número muy grande.
//		Así, cualquier número real de clientes será menor y reemplazará ese valor.
		int indiceElegido= -1; //Dice la caja elegida
		
//		 Se usa -1 como un valor de "sentinela" o marcador
//		 Eso significa:
//
//		 “Aún no hemos encontrado ninguna caja válida (abierta)”.
		boolean encontrada = false;
		
		for (int i = 0; i < listaDeCajas.size(); i++) {
			
				Caja caja = this.listaDeCajas.get(i);
				if (caja.isAbierta() ) {
					int clientes = caja.numeroDeClientesEsperando();
					if (!encontrada || clientes < minimoDeClientes) {
						minimoDeClientes = clientes;
		                indiceElegido = i;
		                encontrada = true;
		            }
			}
			
		}
		if ( indiceElegido== -1) {
			throw new CajaException("cerrada");
		}
		return indiceElegido; //Dice la caja elegida


	}

	public int atenderCliente(int numeroCaja) throws CajaException {
		Caja caja = listaDeCajas.get(numeroCaja - 1);
		return caja.atenderCliente();

	}

	@Override
	public String toString() {
		return null;

	}

}
