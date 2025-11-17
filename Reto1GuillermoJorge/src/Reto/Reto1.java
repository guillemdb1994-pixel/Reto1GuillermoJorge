package Reto;
import java.util.Scanner;


public class Reto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=123;
		while (opcion!=9) {
			System.out.println("Elije operacion:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salirr");
			System.out.println("");
			opcion = Integer.parseInt(sc.nextLine());
			int x;
			int y;
			switch (opcion) {

			case 1:
				x=Funciones.dimeEntero("Dime numero", sc);
				y=Funciones.dimeEntero("Dime numero", sc);
				System.out.println(Funciones1.sumar(x, y));
				System.out.println("");
				break;
			case 2:
				x=Funciones.dimeEntero("Dime numero", sc);
				y=Funciones.dimeEntero("Dime numero", sc);
				System.out.println(Funciones1.restar(x, y));
				System.out.println("");
				break;
			case 3:
				x=Funciones.dimeEntero("Dime numero", sc);
				y=Funciones.dimeEntero("Dime numero", sc);
				System.out.println(Funciones2.multiplicar(x, y));
				System.out.println("");
				break;
			case 4:

				x=Funciones.dimeEntero("Dime dividendo", sc);

				while (true) {
					y=Funciones.dimeEntero("Dime divisor", sc);
					if (y!=0) {
						System.out.println(Funciones2.dividir(x, y));
						System.out.println("");
						break;
					}
					System.out.println("No se puede dividir entre 0");

				}

				break;
			case 5:
				y=Funciones.dimeEntero("Dime numero", sc);
				if (Funciones1.esPar(y)) {
					System.out.println("Es par");
				}
				System.out.println("Es impar");
				System.out.println("");

				break;
			case 6:
				y=Funciones.dimeEntero("Dime numero", sc);
				if (Funciones1.esImpar(y)) {
					System.out.println("Es par");
				}
				System.out.println("Es impar");
				System.out.println("");
				break;
			case 7:
				y=Funciones.dimeEntero("Dime numero", sc);
				System.out.println(Funciones2.esPositivo(y));
				System.out.println("");
				break;

			case 8:
				y=Funciones.dimeEntero("Dime numero", sc);
				System.out.println(Funciones2.esNegativo(y));
				System.out.println("");
				break;
			case 0:
				System.out.println("Fin de programa");
				System.out.println("");
				
				break;
			default:
				System.out.println("Opcion no valida:");
				break;
			}
			
		}


	}

}
