package tareaOcho;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {


		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingresa el numero factorial: ");
		
		int numero = scanner.nextInt();
		
		int suma=1;
		
		do{
		
			 suma = suma*numero;
			numero = numero-1;
			
		}while(numero > 0);
		
		System.out.println("El resultado de la suma de digitos es: "+suma);
		
		
	}

	}