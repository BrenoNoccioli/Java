
public class Gerente extends Funcionario{ //Gerente herda atributos e metodos da classe Funcionario

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public double getBonificacao() {
	//referencia um m�todo nativo da classe mae para n�o haver repeticao de codigo.
		System.out.println("bonifica��o gerente");
		return (super.getBonificacao() + super.getSalario()); 
	}
	
}
