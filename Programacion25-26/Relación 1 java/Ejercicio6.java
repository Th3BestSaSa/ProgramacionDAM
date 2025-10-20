import java.util.Scanner;

public class Ejercicio6 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		System.out.println("Introduce la calificación, sobre 100");
		numero=Integer.parseInt(teclado.nextLine());
		if (numero<0 || numero>100) {
			System.out.println("error");
		} else {
			if (numero>=90) {
				System.out.println("A");
			}else {
				if (numero>=80) {
					System.out.println("B");
				}else {
					if (numero>=70) {
						System.out.println("C");
					}else {
						if (numero>=60) {
							System.out.println("D");
						}else {
							if (numero<=59) {
								System.out.println("F");
							}
						}
					}
				}
			}
		}
		
		
		
	}

}
