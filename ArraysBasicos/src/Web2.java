import java.util.Scanner;

public class Web2 {
	private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
               solicitarPaginasWeb();
    }
	public static void solicitarPaginasWeb() {
		for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la web " + i + ": ");
            String web = teclado.nextLine().trim();
            boolean b=true;
           
            String[] partes = web.split("\\.");
            if (partes.length != 3) {
            	  b=false;
               
            }

            String principio = partes[0];
            String direccion=partes[1];
            String dominio = partes[2];

            if (principio.equals("https://www.")|| principio.equals("https:// www.")) {
            	 b=false;
			}
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
