//classes abstratas não podem ser instanciadas, apenas as concretas.
public class TesteFuncionario { 
	public static void main(String[] args) {
		
		Gerente breno = new Gerente(); //instanciando objeto Funcionario
		breno.setNome("Breno Noccioli");
		breno.setCpf("123.123.123-12");
		breno.setSalario(2600.00);
		
		System.out.println(breno.getNome());
		System.out.println(breno.getSalario());
		
		System.out.println(breno.getBonificacao());
	}
}
