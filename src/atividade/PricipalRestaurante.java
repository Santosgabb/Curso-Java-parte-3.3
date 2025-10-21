package atividade;

public class PricipalRestaurante {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.addItem("Carne de Sol", 100.78);
		p.addItem("Batata-frita", 20);
		p.addItem("Refrigerante", 15.50);
		
		System.out.println("Sua compra deu: "+p.calcTotal());
		
		
	}

}
