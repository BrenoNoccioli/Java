
public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	// implementando um método abstrato da classe mae.
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
