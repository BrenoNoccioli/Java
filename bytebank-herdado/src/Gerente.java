//Gerente herda atributos e metodos da classe Funcionario e também é um Autenticavel

public class Gerente extends Funcionario implements Autenticavel{ 
	
	private int senha;
	
	public double getBonificacao() {
	//referencia um método nativo da classe mae para não haver repeticao de codigo.
		System.out.println("bonificação gerente");
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
