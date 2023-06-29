package tareaOcho;

import java.util.Scanner;

public class SumaWhile {
	
	public static void main(String[] args) {


	Scanner scanner = new Scanner (System.in);
	System.out.println("Ingresa el numero: ");
	
	int numero = scanner.nextInt();
	
	int suma=0;
	
	while(numero != 0) {
		int valor = numero%10;
		 suma = valor + suma;
		numero = numero/10;
		
	}
	
	System.out.println("El resultado de la suma de digitos es: "+suma);
	
	
}

}
