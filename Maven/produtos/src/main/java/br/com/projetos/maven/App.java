package br.com.projetos.maven;

public class App {
    public static void main( String[] args ) {
    	
    	Produto produto = new Produto("Bala chita", 0.15);
    	
        System.out.println( "O garoto gosta da " + produto.getNome() + ", que custa R$" + produto.getPreco());
    }
}
