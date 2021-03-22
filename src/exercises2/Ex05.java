package exercises2;

import java.util.Scanner;

public class Ex05 {
	public static void exercicio(Scanner entrada) {
		double[] notas = new double[3];
		
		System.out.println();
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", i + 1);
			notas[i] = entrada.nextDouble();
		
			while(notas[i] < 0 || notas[i] > 10) {
				System.out.printf("Nota inválida. Digite a %dª nota: ", i + 1);
				notas[i] = entrada.nextDouble();
			} 
		}
		
		double media = (2 * notas[0] + 3 * notas[1] + 5 * notas[2]) / 10;
		
		System.out.printf("%nSua média é %.2f.", media);
	}
}
