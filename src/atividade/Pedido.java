package atividade;

public class Pedido implements PedidoRestaurante{

	//variavel local q vai ajudar a fazer a soma
	private double total = 0;
	
	
	@Override
	public void addItem(String item, double preco) {
		System.out.println("Adicionando: " + item + " (R$" + preco + ") ao pedido.");
		total += preco; //pega a variavel local e soma c o preço do metodo e armazena em total
	}

	@Override
	public double calcTotal() {
		return total; // exibe o total
	
		
	}

}
