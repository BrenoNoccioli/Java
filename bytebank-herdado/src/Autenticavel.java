
//define um contrato Autenticavel
	//quem assina esse contrato, precisa implementar os m�todos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
