package Super;

import java.util.LinkedList;

public class Caja {

    private int numeroCaja;
    private boolean abierta;
    private LinkedList<Integer> colaClientes;

    private static int ultimoNumero = 1;

    public Caja(int numero) {
        this.numeroCaja = numero;
        this.abierta = false;
        colaClientes = new LinkedList<>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) throws CajaException {
        if (this.abierta && colaClientes.isEmpty()) {
            throw new CajaException("La caja ya está abierta");
        }
        
        
        this.abierta = abierta;
    }

    public Integer annadirCliente() throws CajaException {
    	//tema de cola!!!!
        if (!abierta) {
            throw new CajaException("La caja está cerrada");
        }
        colaClientes.add(ultimoNumero);
        return ultimoNumero++;
    }

    public Integer atenderCliente() throws CajaException {
        if (!abierta) {
            throw new CajaException("La caja está cerrada");
        }
        if (colaClientes.isEmpty()) {
            throw new CajaException("No hay clientes en la caja");
        }
        return colaClientes.poll();
    }

    public int numeroDeClientesEsperando() {
        return colaClientes.size();
    }

    @Override
    public String toString() {
        return "Caja " + numeroCaja + " (" + (abierta ? "Abierta" : "Cerrada") + ") - Clientes esperando: " + numeroDeClientesEsperando();
    }
} 
