package estruturas_condicionais;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double hora;
		
		System.out.println("Que horas s�o?");
		hora = sc.nextDouble();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18){
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
	}
}
