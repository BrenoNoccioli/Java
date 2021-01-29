package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeraListaEmails {
	//Gera lista aleatória com quantidade definida
	public static List<Email> gerarListaEmailAleatoria(int qtde){
		List<Email> emails = new ArrayList<Email>();
		
		for(int i=1; i<=qtde; i++) {
			emails.add(new Email("email_" + i + "@stone.com"));
		}

		return emails;
	}
	
	//Gera lista aleatória randômica
	public static List<Email> gerarListaEmailAleatoria(){
		Random rd = new Random();
		return GeraListaEmails.gerarListaEmailAleatoria(rd.nextInt(101));
	}
}
