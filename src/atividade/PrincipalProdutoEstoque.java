package atividade;

public class PrincipalProdutoEstoque {
	public static void main(String []args) {
		ProdutosImpl pro = new ProdutosImpl("Arroz", 90);
		
		pro.addQuantidade(10);
		pro.exibirInfo();//Resultado
		pro.removeQuantidade(15);
		pro.exibirInfo();//Resultado
		pro.removeQuantidade(80);
		pro.exibirInfo();//Resultado
		System.out.println("---");
		//Usando os get
		System.out.println("Produto: " +pro.getNome() );
		System.out.println("Quantidade: " + pro.getQtd());
		
		pro.addQuantidade(5);
		System.out.println("Nova qtd apos add: "  + pro.getQtd());
		
		pro.removeQuantidade(2);
		System.out.println("Nova qtd apos remoção: " + pro.getQtd());
	}

}
