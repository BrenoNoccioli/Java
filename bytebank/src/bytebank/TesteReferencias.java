package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da segunda conta � " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("O saldo da segunda conta agora � " + segundaConta.saldo);
		
		System.out.println("O saldo da primeira conta � " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("s�o a mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
