package exercicios;

import java.util.Scanner;

public class Exercicios01_estruturas_sequenciais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*01. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		/*
		int num1, num2, soma;
		
		System.out.println("Digite o primeiro número inteiro: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("SOMA = " + soma);
		*/
		
		/*02. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.*/
		/*
		double raio, pi, area;
		pi = 3.14159;
		
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("ÁREA = %.4f", area);
		*/
		
		/*03. Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		/*
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int diferenca = (A * B - C * D);
		System.out.println("DIFERENÇA = " + diferenca);
		*/
		
		/*04. Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		/*
		int matricula;
		double horasTrabalhadas;
		double valorHora;
		double salario;
		
		System.out.println("Digite a matrícula do funcionário: ");
		matricula = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.println("Digite o valor da hora de trabalho: ");
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		System.out.println("Matrícula: " + matricula);
		System.out.println("Salario = R$" + salario);
		*/
		
		
		sc.close();
		
	}
}
