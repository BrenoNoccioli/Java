
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
	//referencia um método nativo da classe mae para não haver repeticao de codigo.
		System.out.println("bonificação gerente");
		return (super.getBonificacao() + super.getSalario()); 
	}
	
}
