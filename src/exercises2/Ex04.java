package exercises2;

import java.util.Scanner;

public class Ex04 {
	public static void exercicio(Scanner entrada) {
		int numero;
		
		do {
			System.out.print("\nDigite um número inteiro: ");
			numero = entrada.nextInt();
			
			if(numero != 0) {
				System.out.printf("O quadrado de %d é %.0f.%n", numero, Math.pow(numero, 2));
			}
		} while(numero != 0);
		
		System.out.println("* Programa finalizado.");
	}
}
