package desafio;

public class Item {
	private int id;
	private String nome;
	private int precoUnitario;
	private int qtd;
	
	
	public Item(int id, String nome, int precoUnitario, int qtd) {
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qtd = qtd;
	}

	public int getId() {
		return this.id;
	}

	public Item setInt(int id) {
		this.id = id;
		return this;
	}
	
	public String getNome() {
		return this.nome;
	}

	public Item setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public int getPrecoUnitario() {
		return this.precoUnitario;
	}

	public Item setPrecoUnitario(int precoUnitario) {
		this.precoUnitario = precoUnitario;
		return this;
	}

	public int getQtd() {
		return this.qtd;
	}

	public Item setQtd(int qtd) {
		this.qtd = qtd;
		return this;
	}
	
	public int calculaTotalItem(){
		return this.qtd * this.precoUnitario; 
	}
}
