package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeraListaItens {
	//Gera lista aleatória com quantidade definida
	public static List<Item> gerarListaItemAleatoria(int qtde){
		List<Item> itens = new ArrayList<Item>();
		Random rd = new Random();
		
		for(int i=1; i<=qtde; i++) {
			itens.add(new Item(i, "produto " + i, rd.nextInt(100)+1, rd.nextInt(10)+1));
		}
		
		if(itens.size() != 0) {
			System.out.println("Lista de Produtos:");
			System.out.printf("PRODUTO\t\tPREÇO UNITÁRIO\tQUANTIDADE\tTOTAL POR PRODUTO\n");
		}
		
		for(Item item : itens) {
			System.out.println(item.getNome() + "\t\tR$" + item.getPrecoUnitario() + "\t\t" + item.getQtd() + "\t\tR$" + item.calculaTotalItem());
		}
		
		
		return itens;
		
	}
	
	//Gera lista aleatória randômica
	public static List<Item> gerarListaItemAleatoria(){
		Random rd = new Random();
		return GeraListaItens.gerarListaItemAleatoria(rd.nextInt(101));
	}
}
