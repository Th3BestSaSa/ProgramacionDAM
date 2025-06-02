package Super2;
import java.util.ArrayList;



public class Mercadona {
	
	private static final int MAXIMO_CAJAS = 20;
	private ArrayList<Caja> listaDeCajas;

	public Mercadona() {
		
		listaDeCajas=new ArrayList<Caja>();
		
		for (int i = 0; i < MAXIMO_CAJAS; i++) {
			listaDeCajas.add(new Caja(i+1));
		}
	}
	
	
	
	
	
	
	
	
	
	
	public void abrirCaja( int numeroCaja) throws CajaException {
		
			
	}
	public void cerrarCaja( int numeroCaja) throws CajaException {
		
	}
	
	public String nuevoCliente() throws CajaException{
		return null;
		
	}
	/** 
	 * 
	 * @return Devuelve el número de caja que tiene menos clientes
	 * @throws CajaException Si todas las cajas están cerradas
	 */
	
	private int cajaMenosCliente() throws CajaException {
		return 0;
		
	}

	public int atenderCliente(int numeroCaja) throws CajaException{
		return numeroCaja;
	
		
	}


	@Override
	public String toString() {
		return null;
		
	}

	
}
