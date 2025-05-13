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
        cola = new LinkedList<>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) throws CajaException {
        if (this.abierta && abierta) {
            throw new CajaException("La caja ya está abierta");
        }
        this.abierta = abierta;
    }

    public Integer annadirCliente() throws CajaException {
        if (!abierta) {
            throw new CajaException("La caja está cerrada");
        }
        cola.add(ultimoNumero);
        return ultimoNumero++;
    }

    public Integer atenderCliente() throws CajaException {
        if (!abierta) {
            throw new CajaException("La caja está cerrada");
        }
        if (cola.isEmpty()) {
            throw new CajaException("No hay clientes en la caja");
        }
        return cola.poll();
    }

    public int numeroDeClientesEsperando() {
        return cola.size();
    }

    @Override
    public String toString() {
        return "Caja " + numeroCaja + " (" + (abierta ? "Abierta" : "Cerrada") + ") - Clientes esperando: " + numeroDeClientesEsperando();
    }
} 
