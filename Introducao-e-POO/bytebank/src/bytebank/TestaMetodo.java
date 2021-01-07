package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoBreno = new Conta();
		contaDoBreno.saldo = 100;
		contaDoBreno.deposita(50);
		System.out.println(contaDoBreno.saldo);
		
		boolean conseguiuRetirar = contaDoBreno.saca(20);
		System.out.println(contaDoBreno.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(1000);

		if(contaDaCarol.transfere(300, contaDoBreno)) {
			System.out.println("Transferência realizada com sucesso!");
			System.out.println("Seu novo saldo é: R$" + contaDaCarol.saldo);
			System.out.println("(novo saldo Breno) R$" + contaDoBreno.saldo);
		}else {
			System.out.println("Saldo insuficiente...");
		}
		
		contaDoBreno.titular = "Breno Noccioli";
		System.out.println(contaDoBreno.titular);
		
	}

}
