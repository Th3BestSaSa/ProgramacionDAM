package Super2;

import java.util.LinkedList;



public class Caja {

	private int numeroCaja;
	private boolean abierta;
	private LinkedList<Integer> cola;
	
	private static int ultimoNumero=1; 
	
	public Caja(int numero)  {
		this.numeroCaja=numero;
		this.abierta=false;
		cola=new LinkedList<Integer>();
		
	}

		
	public int getNumeroCaja() {
		return numeroCaja;
	}


	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) throws CajaException {
		
		
	}
	
	public Integer annadirCliente() throws CajaException {
		return numeroCaja;
		
		
	}
	
	public Integer atenderCliente() throws CajaException {
		return numeroCaja;
		
	}
	
	public int numeroDeClientesEsperando() {
		return cola.size();
	}
	
	
}
