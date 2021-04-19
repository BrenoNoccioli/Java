package estruturas_de_repeticao;

import java.util.Scanner;

public class Teste_while {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int soma = 0;
		
		while(num != 0) {
			soma += num;
			num = sc.nextInt();
			
		}
		
		System.out.printf("A soma é %d", soma);
		sc.close();
		
	}
}
