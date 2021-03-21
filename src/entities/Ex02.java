package entities;

public class Ex02 {
	public static void exercicio() {
		System.out.println("\nMúltiplos de 3 entre 1 e 100:");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
