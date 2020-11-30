
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		conta.saca(200);
		
		System.out.println(conta.getSaldo());
		
		//proibido - n�o acessar um atributo diretamente, apenas atraves de um m�todo.
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
	}
}
