package PacoteJava;

import java.util.Scanner;

public class exercicioSete {
	public static void main(String args[])
	{
		float  a, b, c, d, e, f, x, y;
		Scanner leitura= new Scanner(System.in);
		
		System.out.printf("\n Entre com valor de A:");
		a=leitura.nextInt();
		System.out.printf("\n Entre com valor de B:");
		b=leitura.nextInt();
		System.out.printf("\n Entre com valor de C:");
		c=leitura.nextInt();
		System.out.printf("\n Entre com valor de D:");
		d=leitura.nextInt();
		System.out.printf("\n Entre com valor de E:");
		e=leitura.nextInt();
		System.out.printf("\n Entre com valor de F:");
		f=leitura.nextInt();
		
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		System.out.printf("\n O valor de X foi de: %2.2f",x);
		System.out.printf("\n O valor de Y foi de : %2.2f",y);
		
	}

}
