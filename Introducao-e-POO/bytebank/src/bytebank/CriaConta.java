package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //cria um objeto do tipo Conta
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem saldo de: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem saldo de: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta!");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
