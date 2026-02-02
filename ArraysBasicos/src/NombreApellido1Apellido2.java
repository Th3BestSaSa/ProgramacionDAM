


public class NombreApellido1Apellido2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "NOMBRE APELLIDO1 APELLIDO2";
		String[] sArray = s.split(" ");
		// System.out.println(Arrays.toString(sArray));

		if (sArray.length < 3) {
			System.out.println("Error");
		}
		for (int i = 0; i < sArray.length; i++) {
			switch (i) {
			case 0:
				System.out.println("El nombre es:" + sArray[i]);
				break;
			case 1:
				System.out.println("El primer apellido es:" + sArray[i]);
				break;
			case 2:
				System.out.println("El segundo apellido  es:" + sArray[i]);
				break;
			default:
				break;
			}
			
		}
	}

}
