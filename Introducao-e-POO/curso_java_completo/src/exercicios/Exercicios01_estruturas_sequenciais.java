package exercicios;

import java.util.Scanner;

public class Exercicios01_estruturas_sequenciais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*01. Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
		mensagem explicativa, conforme exemplos.*/
		/*
		int num1, num2, soma;
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero inteiro: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("SOMA = " + soma);
		*/
		
		/*02. Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
		casas decimais conforme exemplos.*/
		/*
		double raio, pi, area;
		pi = 3.14159;
		
		
		System.out.println("Digite o valor do raio do c�rculo: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("�REA = %.4f", area);
		*/
		
		/*03. Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
		de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).*/
		/*
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int diferenca = (A * B - C * D);
		System.out.println("DIFEREN�A = " + diferenca);
		*/
		
		/*04. Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		decimais.*/
		/*
		int matricula;
		double horasTrabalhadas;
		double valorHora;
		double salario;
		
		System.out.println("Digite a matr�cula do funcion�rio: ");
		matricula = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.println("Digite o valor da hora de trabalho: ");
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Salario = R$" + salario);
		*/
		
		
		sc.close();
		
	}
}
