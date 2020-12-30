
//define um contrato Autenticavel
	//quem assina esse contrato, precisa implementar os métodos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
