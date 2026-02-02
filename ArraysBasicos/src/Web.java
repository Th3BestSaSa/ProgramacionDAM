import java.util.Scanner;

public class Web {
	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
               solicitarPaginasWeb();
    }
	public static void solicitarPaginasWeb() {
		for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la web " + i + ": ");
            String web = teclado.nextLine().trim();
            boolean b=true;
            // Comprobamos que empieza con "http://www."
            if (!web.startsWith("http://www.")) {
                b=false;
            }

            // Quitamos el prefijo
            String resto = web.substring(11); // 11 es la longitud de "http://www."

            // Comprobamos que tenga un punto
            if (!resto.contains(".")) {
            	  b=false;
                
            }

            // Separamos en dirección y dominio
            String[] partes = resto.split("\\.");
            if (partes.length != 2) {
            	  b=false;
               
            }

            String direccion = partes[0];
            String dominio = partes[1];

            // Comprobamos que la dirección no esté vacía
            if (direccion.isEmpty()) {
            	  b=false;
            }

            // Comprobamos que el dominio sea "com" o "es"
            if (!dominio.equals("com") && !dominio.equals("es")) {
            	
            	b=false;

            }
            if (b) {
				System.out.println("Valida");
			}else {
				System.out.println("Invalida");
			}
            
        }
	}
}
