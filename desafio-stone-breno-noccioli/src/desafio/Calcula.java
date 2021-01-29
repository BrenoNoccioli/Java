package desafio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calcula {
	
	public Map<String, Integer> calculaDesafio(List<Item> itens, List<Email> emails) {
		int precoTotal = 0, totalPorPessoa=0, resto=0;
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		if(emails.size() != 0 && itens.size() != 0) {
			//Calcula preco total de itens
			for(Item i : itens){
				precoTotal += i.calculaTotalItem();
			}
			System.out.println("\nPreço total dos itens: R$" + precoTotal);
		
			//Calcula total por pessoa e resto
			if(precoTotal % emails.size() == 0) {
				totalPorPessoa = precoTotal / emails.size();
			} else {
				resto = precoTotal % emails.size();
				totalPorPessoa = (precoTotal - resto) / emails.size();
			}
			System.out.println("Quantidade de e-mails: " + emails.size() + "\n");
		
			//Atribui chave e valor ao Map
			for(Email email : emails) {
				String enderecoEmail = email.getEnderecoEmail();
				if(resto != 0) {
					mapa.put(enderecoEmail, totalPorPessoa + 1);
					resto--;
				}else {
					mapa.put(enderecoEmail, totalPorPessoa);
				}
				
				System.out.println(enderecoEmail + ": R$" + mapa.get(enderecoEmail));
			}
			
		} else {
			//Em caso de lista vazia
			System.out.println("Lista de itens ou e-mails vazia!\nPara realizar uma compra, por favor, insira itens e e-mails.");
		}
		
		return mapa;
	}
	
	
	

}
