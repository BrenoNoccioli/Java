import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		/*
		System.out.print("Ol� Mundo!");
		System.out.println("Bom dia!");
		*/
		
		/*
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n", x); //formatando sa�da de dados com 2 casas decimais
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US); //configurando localiza��o de formato de apresenta��o de decimais (. ou ,)
		System.out.printf("%.4f\n", x);
		
		//concatenando vari�vel
		System.out.println("Resultado= " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		*/
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais.%n", nome, idade, renda);
	}

}
