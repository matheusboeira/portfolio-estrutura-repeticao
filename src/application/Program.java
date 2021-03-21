package application;

import java.util.Scanner;

import segunda_lista.Ex01;
import segunda_lista.Ex02;
import segunda_lista.Ex03;
import segunda_lista.Ex04;

public class Program {
	public static void main(String[] args) {
		short menu;
		
		try(Scanner entrada = new Scanner(System.in)) {
			System.out.println("Menu de exercícios (Lista 2):");
			System.out.printf("%n\t1 - Exercício 1");
			System.out.printf("%n\t2 - Exercício 2");
			System.out.printf("%n\t3 - Exercício 3");
			System.out.printf("%n\t4 - Exercício 4");
			System.out.printf("%n\t5 - Exercício 5");
			System.out.printf("%n\t6 - Exercício 6");
			System.out.printf("%n\t7 - Exercício 7%n");
			System.out.printf("%nDigite uma das opções acima: ");
			menu = entrada.nextShort();
			
			switch(menu) {
				case 1:
					Ex01.exercicio();
					break;
					
				case 2:
					Ex02.exercicio();
					break;
					
				case 3:
					Ex03.exercicio();
					break;
					
				case 4:
					Ex04.exercicio(entrada);
					break;
					
				case 5:
					
					break;
					
				case 6:
					
					break;
					
				case 7:
					
					break;
					
				default:
					System.out.printf("%nPor favor, entre com uma opção válida.");
			}
		} catch(Exception e) {
			System.out.printf("%nEntrada inválida.");
		}
	}
}
