package desafio;

import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		//Gera listas aleatórias de itens e emails
		
		List<Item> itens = GeraListaItens.gerarListaItemAleatoria();
		List<Email> emails = GeraListaEmails.gerarListaEmailAleatoria();
						
		
		Calcula calcula = new Calcula();
		calcula.calculaDesafio(itens, emails);
	
	}

}
