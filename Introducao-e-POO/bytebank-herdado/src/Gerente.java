//Gerente herda atributos e metodos da classe Funcionario e tamb�m � um Autenticavel

public class Gerente extends Funcionario implements Autenticavel{ 
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
	//referencia um m�todo nativo da classe mae para n�o haver repeticao de codigo.
		System.out.println("bonifica��o gerente");
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
