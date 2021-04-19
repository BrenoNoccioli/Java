package exercicios;

import java.util.Scanner;

public class Exercicios02_estruturas_condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*1.Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/
		/*
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("N�mero n�o negativo");
		} else {
			System.out.println("N�mero negativo");
		}
		*/
		
		/*2. Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar */
		/*
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("�mpar");
		}
		*/
		
		/*3. Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos"
		 * ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os
		 * n�meros devem poder ser digitados em ordem crescente ou decrescente. */
		/*
		int A, B;
		System.out.println("Digite um n�mero: ");
		A = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		*/
		
		/*4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo,
		 * sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o
		 * m�nima de 1 hora e m�xima de 24 horas. */ 
		/*
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal ) {
			duracao = horaInicial - horaFinal;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		*/
		
		
		/*5. Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 1 - Cachorro-quente - R$4,00
		 * 2 - X-Salada - R$4,50
		 * 3 - X-Bacon - R$5,00
		 * 4 - Torrada simples - R$2,00
		 * 5 - Refrigerante - R$1,5
		 * */
		/*
		int codigo;
		int quantidade;
		double precoTotal;
		
		System.out.println("Digite o c�digo do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		switch(codigo) {
			case 1:
				precoTotal = quantidade * 4;
				System.out.println("Total: R$ " + precoTotal);
				break;
			case 2:
				precoTotal = quantidade * 4.5;
				System.out.println("Total: R$ " + precoTotal);
				break;
			case 3:
				precoTotal = quantidade * 5;
				System.out.println("Total: R$ " + precoTotal);
				break;
			case 4:
				precoTotal = quantidade * 2;
				System.out.println("Total: R$ " + precoTotal);
				break;
			case 5:
				precoTotal = quantidade * 1.5;
				System.out.println("Total: R$ " + precoTotal);
				break;
		}
		*/
		
		/*6.Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendoem qual dos
		 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o 
		 * valor n�o estiver em nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
		 */
		/*
		double num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextDouble();
		
		if(num >= 0 && num <=25) {
			System.out.println("Intervalor [0, 25]");
		} else if (num > 25 && num <= 50) {
			System.out.println("Intervalo [25, 50]");
		} else if (num > 50 && num <= 75) {
			System.out.println("Intervalo [50, 75]");
		} else if (num > 75 && num <= 100) {
			System.out.println("Intervalo [75, 100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		*/
		
		
		
		

		sc.close();
	}

}
