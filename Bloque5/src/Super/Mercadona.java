package Super;

import java.util.ArrayList;


public class Mercadona {

    private static final int MAXIMO_CAJAS = 20;
    private ArrayList<Caja> listaDeCajas;

    public Mercadona() {
        listaDeCajas = new ArrayList<>();
        for (int i = 0; i < MAXIMO_CAJAS; i++) {
            listaDeCajas.add(new Caja(i + 1));
        }
    }

    public void abrirCaja(int numeroCaja) throws CajaException {
    	
    
        Caja caja = listaDeCajas.get(numeroCaja - 1);
        caja.setAbierta(true);
    }

    public void cerrarCaja(int numeroCaja) throws CajaException {
        Caja caja = listaDeCajas.get(numeroCaja - 1);
        if (!caja.isAbierta()) {
            throw new CajaException("La caja ya está cerrada");
        }
        if (caja.numeroDeClientesEsperando() > 0) {
            throw new CajaException("La caja no puede cerrarse, aún hay clientes esperando");
        }
        caja.setAbierta(false);
    }

    public String nuevoCliente() throws CajaException {
        int numCaja = cajaMenosCliente();
        Caja caja = listaDeCajas.get(numCaja - 1);
        int numCliente = caja.annadirCliente();
        return "Es usted el cliente número " + numCliente + " y debe ir a la caja número " + numCaja;
    }

    private int cajaMenosCliente() throws CajaException {
        int minClientes = Integer.MAX_VALUE;
        int numCaja = -1;
        for (Caja caja : listaDeCajas) {
            if (caja.isAbierta()) {
                int clientes = caja.numeroDeClientesEsperando();
                if (clientes < minClientes || (clientes == minClientes && caja.getNumeroCaja() < numCaja)) {
                    minClientes = clientes;
                    numCaja = caja.getNumeroCaja();
                }
            }
        }
        if (numCaja == -1) {
            throw new CajaException("No hay cajas abiertas");
        }
        return numCaja;
    }

    public int atenderCliente(int numeroCaja) throws CajaException {
        Caja caja = listaDeCajas.get(numeroCaja - 1);
        return caja.atenderCliente();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Caja caja : listaDeCajas) {
            sb.append(caja.toString()).append("\n");
        }
        return sb.toString();
    }
} 