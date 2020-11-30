package PacoteJava;

import java.util.Scanner;

public class ExercicioUm {

	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		int ano, mes, dia, totalDias;
		
		System.out.printf("Entre com a quantidade de ano(s):");
		ano=leitura.nextInt();
		System.out.printf("Entre com a quantidade de mes(es):");
		mes=leitura.nextInt();
		System.out.printf("Entre com a quantidade de dia(s):");
		dia=leitura.nextInt();
		totalDias= (ano*365) +(mes*30)+ dia;
		System.out.printf("Eu tenho: %d dias  de vida",totalDias);
		
		
	}
}
