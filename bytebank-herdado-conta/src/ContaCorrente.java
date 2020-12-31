
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) { //chama o construtor da classe mae
		super(agencia, numero);
	}
	
	@Override //Com o Override é preciso manter a assinatura do método, garantindo a sobreescrita
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}           

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
