package teste_entrada_dados;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //associa o Scanner ao teclado no modo console
		/*
		String x;
		
		System.out.println("Digite um nome: ");
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		*/
		
		int x;
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();
		System.out.println("Voc� digitou: " + x);
		
		sc.close();
	}
}
