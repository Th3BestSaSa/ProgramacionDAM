package coches;

public class Ejemplo {
	public static void main(String[] args) {
 Coche1 coche= new Coche1("1985MHM", "MAZDA", "CX-5"); 
 Coche coche1= new Coche("2453KZD", "MAZDA", "CX-5"); 
 
 
 	System.out.println(coche.toString());
 	System.out.println(coche.marca());
 	System.out.println(coche.matricula());
 	System.out.println(coche.modelo());
 	
 	System.out.println(coche1.toString());
 	
}
}