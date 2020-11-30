
public class TestaBanco {
	public static void main(String[] args) {
		Cliente breno = new Cliente();
		breno.nome = "Breno Noccioli";
		breno.cpf = "123.123.123-12";
		breno.profissao = "programador";

		Conta contaDoBreno = new Conta();
		contaDoBreno.deposita(100);
		
		//associa cliente paulo à conta contaDoPaulo
		contaDoBreno.titular = breno;
		System.out.println(contaDoBreno.titular.nome);
		System.out.println(contaDoBreno.titular);
		System.out.println(breno);
	}
}