
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaCarol = new Conta();
		System.out.println(contaDaCarol.getSaldo());
		
		//associando o atributo titular à uma classe Cliente
		contaDaCarol.titular = new Cliente();
		System.out.println(contaDaCarol.titular);
		
		contaDaCarol.titular.nome = "Carolina";
		System.out.println(contaDaCarol.titular.nome);
	
		
		
	}

}
