//Gerente herda atributos e metodos da classe Funcionario e também é um Autenticavel

public class Gerente extends Funcionario implements Autenticavel{ 
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
	//referencia um método nativo da classe mae para não haver repeticao de codigo.
		System.out.println("bonificação gerente");
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
