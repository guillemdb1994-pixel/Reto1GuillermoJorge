package Reto;

public class Funciones1 {

	public static double sumar(double numero1, double numero2) {
		return numero1+numero2;
		
	}
	public static double restar(double numero1, double numero2) {
		return numero1-numero2;
		
	}
	public static boolean esPar(double numero) {
		if (numero % 2 != 0) {
			return false;
		}
		return true;
		
	}
	public static boolean esImpar(double numero) {
		if (numero % 2 == 0) {
			return false;
		}
		return true;
		
	}
}
