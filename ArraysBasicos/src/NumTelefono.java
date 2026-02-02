

public class NumTelefono {

    public static void main(String[] args) {
        String telefono = "999999999";
        
        System.out.println(formatearTelefono(telefono));
    }

    public static String formatearTelefono(String telefono) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < telefono.length(); i++) {
            if (i == 3 || i == 5 || i == 7) {
                sb.append("-");
            }
            sb.append(telefono.charAt(i));
        }

        return sb.toString();
    }
}
