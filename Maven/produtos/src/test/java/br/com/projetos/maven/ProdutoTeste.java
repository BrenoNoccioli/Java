package br.com.projetos.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTeste {

	@Test //definindo teste
	public void verificaImposto() {
		Produto bala = new Produto("chita", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001); //preço com imposto, método a ser testado, margem de erro
	}
}
 