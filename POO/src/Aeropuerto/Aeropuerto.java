package Aeropuerto;

import java.util.Objects;

public class Aeropuerto {

    private static final int RECARGO_MAXIMO = 8;

    private String nombre;
    private String ciudad;
    private int recargo;

    public Aeropuerto(String nombre, String ciudad, int recargo) throws MonroyFlightException {
        this.nombre = nombre;
        this.ciudad = ciudad;
        setRecargo(recargo);
    }

    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) throws MonroyFlightException {
        if (recargo < 0 || recargo > RECARGO_MAXIMO) {
            throw new MonroyFlightException("Valor incorrecto del recargo");
        }
        this.recargo = recargo;
    }

    @Override
    public String toString() {
        return "Aeropuerto [nombre=" + nombre +
                ", ciudad=" + ciudad +
                ", recargo=" + recargo + "]";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aeropuerto other = (Aeropuerto) obj;
        return Objects.equals(nombre, other.nombre)
                && Objects.equals(ciudad, other.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ciudad);
    }
}
