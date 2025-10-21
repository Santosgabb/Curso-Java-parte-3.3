package atividade;

public interface Produto {
	/*
	public String nome = "" ;	È uma constante
	public int qtd = 0  ;
	*/
	
	//maneira correta de criar um atributo em uma interface
	 String getNome();
	 int getQuantidade();
	
	void addQuantidade(int quantidade);
	void removeQuantidade(int quantidade);
	// criei um metodo p exibir mas posso utilizar os get no metodo Main
	void exibirInfo();
	
	

	
	
}
