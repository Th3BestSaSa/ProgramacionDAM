package Aeropuerto;

public class MonroyFlight {

    public static void main(String[] args) {

        try {
            Aeropuerto madrid = new Aeropuerto("MAD", "Madrid", 2);
            Aeropuerto paris = new Aeropuerto("CDG", "París", 3);

            Vuelo vuelo = new Vuelo("AB123", madrid, paris, 120, 100, 20);

            for (int i = 0; i < 25; i++) {
                System.out.println("Precio billete: " + vuelo.comprarUnBillete());
            }

        } catch (MonroyFlightException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Facturación total: " + Vuelo.getFacturacionTotal());
    }
}
