package exercises2;

import java.util.Scanner;

public class Ex07 {
	private static int gremistas;
	private static int colorados;
	private static int torcedores;
	
	public static void exercicio(Scanner entrada) {
		Character menu = '\u0000';
		
		while(!menu.equals('f')) {
			menu();
			menu = entrada.next().toLowerCase().charAt(0);
			
			switch(menu) {
				case 'g':
					gremistas++;
					torcedores++;
					break;
					
				case 'i':
					colorados++;
					torcedores++;
					break;
					
				case 'o':
					torcedores++;
					break;
					
				case 'f':
					resultado();
			}
		}
	}
	
	public static void menu() {
		System.out.println("\nPesquisa de torcidas:\n");
		System.out.println("(g) - Grêmio");
		System.out.println("(i) - Inter");
		System.out.println("(o) - Outro time");
		System.out.println("(f) - Finalizar\n");
		System.out.print("Digite uma opção acima: ");
	}
	
	public static void resultado() {
		System.out.println("\nResultado:\n");
		System.out.println("Número total de torcedores: " + torcedores);
		System.out.println("Torcedores gremistas: " + gremistas);
		System.out.println("Torcedores colorados: " + colorados);
	}
}
