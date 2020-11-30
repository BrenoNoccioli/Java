
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		
		Cliente breno = new Cliente();
		//conta.titular = paulo
		breno.setNome("Breno Noccioli");
		
		conta.setTitular(breno);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//mesmo comando em duas lihas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(breno);
		System.out.println(conta.getTitular());
		
		
		
		
	}

}
