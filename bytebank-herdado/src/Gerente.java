//Gerente herda atributos e metodos da classe Funcionario e tamb�m � um Autenticavel

public class Gerente extends Funcionario implements Autenticavel{ 
	
	private int senha;
	
	public double getBonificacao() {
	//referencia um m�todo nativo da classe mae para n�o haver repeticao de codigo.
		System.out.println("bonifica��o gerente");
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			} else {
				return false;
			}
	}
	
}
