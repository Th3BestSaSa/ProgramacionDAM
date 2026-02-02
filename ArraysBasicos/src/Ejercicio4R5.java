/*
 * Realizar un programa que valide el nombre de usuario y contraseña que
se soliciten.Deben cumplir las siguientes condiciones:
El nombre de usuario debe estar formado solo por caracteres alfabéticos
(longitud máxima 30 caracteres).
La contraseña debe tener como mínimo 7 caracteres y debe contener al
menos una letra, un dígito y un carácter no alfanumérico.
 */
public class Ejercicio4R5 {

	private static final int MAX_USUARIO_LENGTH = 30;
	private static final int TAMANNO_MINIMO_CONTRASENNA = 7;

	public static void main(String[] args) {
		//Variables
		String usuario,contrasenna;
		//Inicio programa
		System.out.println("Introduce un nombre de usuario(debe contenercomo máximo 30 carcteres y solo puede estar formado por letras)");
		usuario=Metodos.introducirCadena();
		verificaUsuario(usuario);
		System.out.println("Introduce un contraseña(Debe contener un numero, una letra y un carcter especial. Longitud minima de 7 caracteres)");
		contrasenna=Metodos.introducirCadena();
		verificaContrasenna(contrasenna);

	}

	private static void verificaUsuario(String usuario) {
		boolean correcto=verificado(usuario);
		if(correcto) {
			System.out.println("El nombre de usuario es correcto");
		}else {
			System.out.println("El nombre de usuario es incorrecto");
		}
		
	}

	private static void verificaContrasenna(String contrasenna) {
		boolean tieneNumero,tieneLetra,tieneNoLetra;
		tieneNumero=incluyeNumero(contrasenna);
		tieneLetra=incluyeLetra(contrasenna);
		tieneNoLetra=incluyeEspecial(contrasenna);
		if(tieneLetra && tieneNumero && tieneNoLetra && contrasenna.length()>TAMANNO_MINIMO_CONTRASENNA) {
			System.out.println("Cotraseña correcta");
		}else {
			System.out.println("Contraseña incorrecta");
		}
	}

	private static boolean incluyeEspecial(String contrasenna) {
		boolean contiene=false;
		int contador=0;
		while(contador<contrasenna.length() && contiene==false) {
			if(!Character.isLetterOrDigit(contrasenna.charAt(contador))) {
				contiene=true;
			}
			contador++;
		}
		return contiene;
	}

	private static boolean incluyeLetra(String contrasenna) {
		boolean contiene=false;
		int contador=0;
		while(contador<contrasenna.length() && contiene==false) {
			if(Character.isLetter(contrasenna.charAt(contador))) {
				contiene=true;
			}
			contador++;
		}
		return contiene;
	}

	private static boolean incluyeNumero(String contrasenna) {
		boolean contiene=false;
		int contador=0;
		while(contador<contrasenna.length() && contiene==false) {
			if(Character.isDigit(contrasenna.charAt(contador))) {
				contiene=true;
			}
			contador++;
		}
		return contiene;
	}

	private static boolean verificado(String usuario) {
		int contador=0;
		boolean correcto=false;
		if(usuario.length()<=MAX_USUARIO_LENGTH) {
			while(contador<usuario.length() && !correcto) {
				if(Character.isAlphabetic(usuario.charAt(contador))) {
					correcto=true;
				}
				contador++;
			}
		
		}
		return correcto;
	}


}
