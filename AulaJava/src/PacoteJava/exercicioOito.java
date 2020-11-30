package PacoteJava;

import java.util.Scanner;

public class exercicioOito {

	public static void main(String args[])
	{
		float custoFabrica;
		double custoConsumidor, imp,distribuidor,  percentagemIm=0.45,  percentagemDis=0.28;
		Scanner leitura=new Scanner(System.in);
		
		System.out.printf("\n Digite o custo de fábrica:");
		custoFabrica=leitura.nextInt();
		distribuidor=(custoFabrica*percentagemDis);
		imp=(custoFabrica*percentagemIm);
		custoConsumidor=(custoFabrica+distribuidor+imp);
		System.out.printf("\n O custo do carro ao consumidor é de: %2.2f",custoConsumidor);
	}
}
