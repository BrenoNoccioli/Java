package PacoteJava;

import java.util.Scanner;

public class exercicioSeis {

	public static void main(String args[])
	{
		int  y1, y2, x1, x2;
		double p2, p1, d ;

		Scanner leitura= new Scanner(System.in);
		System.out.printf( "\n Entre com o valor de X1:");
		x1=leitura.nextInt();
		System.out.printf( "\n Entre com o valor de X2:");
		x2=leitura.nextInt();
		System.out.printf( "\n Entre com o valor de Y1:");
		y1=leitura.nextInt();
		System.out.printf( "\n Entre com o valor de Y2:");
		y2=leitura.nextInt();
		
		p1=Math.pow(x2-x1,2);
		p2=Math.pow(y2-y1,2);
		d=Math.sqrt(p1+p2);
		System.out.printf("\n A distância entre os pontos é de: %2.2f",d);
		
		
	}
}
