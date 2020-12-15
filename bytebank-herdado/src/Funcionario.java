
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo - nao há implementação - metodo apenas conceitual que será implementado nos filhos
	//coloca-se um metodo abstrato em uma classe mae e obriga os filhos a implementarem
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
