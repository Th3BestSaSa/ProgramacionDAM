package Aeropuerto;

import java.util.Objects;

public class Vuelo {

    private String codigo;
    private final Aeropuerto origen;
    private final Aeropuerto destino;
    private int plazasTotales;
    private int plazasOcupadas;
    private double precioInicial;

    private static double facturacionTotal = 0;

    public Vuelo(String codigo, Aeropuerto origen, Aeropuerto destino,
                 int plazasTotales, int plazasOcupadas, double precioInicial) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
        this.plazasOcupadas = plazasOcupadas;
        this.precioInicial = precioInicial;
    }

    public double comprarUnBillete() throws MonroyFlightException {
        if (plazasOcupadas >= plazasTotales) {
            throw new MonroyFlightException("No hay plazas disponibles");
        }

        double precioActual = calcularPrecioActual();
        plazasOcupadas++;
        facturacionTotal += precioActual;

        return precioActual;
    }

    private double calcularPrecioActual() {
        double precio = precioInicial;

        // Recargos por aeropuertos
        precio += precio * (origen.getRecargo() / 100.0);
        precio += precio * (destino.getRecargo() / 100.0);

        // Incremento por cada 10 billetes vendidos
        int bloquesVendidos = plazasOcupadas / 10;
        precio *= Math.pow(1.04, bloquesVendidos);

        return precio;
    }

    public static double getFacturacionTotal() {
        return facturacionTotal;
    }

    @Override
    public String toString() {
        return "Vuelo [codigo=" + codigo +
                ", origen=" + origen +
                ", destino=" + destino +
                ", plazasTotales=" + plazasTotales +
                ", plazasOcupadas=" + plazasOcupadas +
                ", precioInicial=" + precioInicial + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, origen, destino);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vuelo other = (Vuelo) obj;
        return Objects.equals(codigo, other.codigo)
                && Objects.equals(origen, other.origen)
                && Objects.equals(destino, other.destino);
    }
}
