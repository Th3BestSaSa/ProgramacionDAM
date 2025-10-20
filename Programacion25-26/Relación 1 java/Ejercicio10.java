import java.util.Scanner;

public class Ejercicio10 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		char caracter;
		int numero1, numero2;
		
		System.out.println("Introduce el caracter (+, -, *, /)");
		caracter=teclado.nextLine().charAt(0);
		System.out.println("Introduce el primer numero");
		numero1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el primer numero");
		numero2=Integer.parseInt(teclado.nextLine());
	
		     
		        if (caracter =='+') {
		            numero1 = numero1 + numero2;
		        } else {
		            if (caracter =='-') {
		                numero1 = numero1 - numero2;
		            } else {
		                if (caracter =='*') {
		                    numero1 = numero1 * numero2;
		                } else {
		                    if (caracter =='/') {
		                    	if(numero2 !=0) {
		                    		 numero1 =  numero1 / numero2;
		                    	}else {
		                    		System.out.println("no se puede hacer la division");
		                    	}
		                    } else {
		                        System.out.println("El caracter no es aritmetico");
		                    }
		                }
		            }
		        }
		        System.out.println("El resultado es " + numero1);
		    }
		

		
		
	}


