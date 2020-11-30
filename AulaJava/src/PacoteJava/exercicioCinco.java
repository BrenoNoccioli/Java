package PacoteJava;

import java.util.Scanner;

public class exercicioCinco {

	public static void main(String args[])
	{
		int notaUm=2, notaDois=3, notaTres=5;
		float notas,media,aluno,soma, mediaAluno;
		Scanner leitura= new Scanner(System.in);
		
		/*notaUm= leitura.nextInt(2);
		notaDois=leitura.nextInt(3);
		notaTres=leitura.nextInt(5);*/
		soma= notaUm+notaDois+notaTres;
		
		media=soma/3;
		System.out.printf("\n Sua média é:%f",media);
		mediaAluno=leitura.nextInt();
		
		
		
		
		
	}
}
