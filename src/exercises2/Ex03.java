package exercises2;

public class Ex03 {
	public static void exercicio() {
		int soma = 0, produto = 1;
		
		for(int i = 1; i <= 10; i++) {
			soma += i;
			produto *= i;
		}
		
		System.out.printf("\nA soma no intervalo inteiro [1,10] é: %d.\n", soma);
		System.out.printf("O produto no intervalo inteiro [1,10] é: %d.", produto);
	}
}
