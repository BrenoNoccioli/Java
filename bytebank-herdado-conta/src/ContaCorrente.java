
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) { //chama o construtor da classe mae
		super(agencia, numero);
	}
	
	@Override //Com o Override � preciso manter a assinatura do m�todo, garantindo a sobreescrita
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}           

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
