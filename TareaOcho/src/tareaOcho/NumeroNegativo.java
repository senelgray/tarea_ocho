package tareaOcho;

import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero negativo: ");
		
		int numero = scanner.nextInt();

		
		while(numero >=0 || numero<=-5) {
			System.out.println("No es negativo o mayor a -5, ingrese otro valor");
			numero = scanner.nextInt();

		}
		
		System.out.println("El numero "+numero+ " es negativo y mayor a 5");

	}

}