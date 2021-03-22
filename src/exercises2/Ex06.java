package exercises2;

import java.util.Scanner;

public class Ex06 {
	private double saldo;
	private Character menu;
	
	public Ex06() {
		saldo = 0.0;
	}
	
	public void exercicio(Scanner entrada) {
		do {
			menu();
			menu = entrada.next().toLowerCase().charAt(0);
			
			double quantidade;
			
			switch(menu) {
				case 'a':
					System.out.printf("Seu saldo: R$ %.2f", consultarSaldo());
					break;
					
				case 'b':
					System.out.print("Digite o valor: ");
					quantidade = entrada.nextDouble();
					sacar(quantidade);
					break;
					
				case 'c':
					System.out.print("Digite o valor: ");
					quantidade = entrada.nextDouble();
					depositar(quantidade);
					break;
					
				case 'd':
					System.out.println("* Programa finalizado.");
			} System.out.println();
		} while(!menu.equals('d'));
	}
	
	public double consultarSaldo() { return saldo; }
	
	public void sacar(double quantidade) {
		if(quantidade > 0 && saldo - quantidade > 0) {
			saldo -= quantidade;
		} else if(quantidade < 0) {
			System.out.print("* Valor inválido.");
		} else {
			System.out.print("* Saldo insuficiente.");
		}
	}
	
	public void depositar(double quantidade) {
		if(quantidade > 0) {
			saldo += quantidade;
		} else {
			System.out.print("* Valor inválido.");
		}
	}
	
	private void menu() {
		System.out.println("\nMenu de opções:\n");
		System.out.print("\t(a) - Consultar saldo\n");
		System.out.print("\t(b) - Sacar\n");
		System.out.print("\t(c) - Depositar\n");
		System.out.print("\t(d) - Sair\n");
		System.out.print("\nDigite uma das opções acima: ");
	}
}
