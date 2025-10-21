package atividade;

public class ProdutosImpl implements Produto {
	// atriburos
	private String nome;
	private int qtd;

	public ProdutosImpl(String nomeI, int qtdI) {
		nome = nomeI;
		qtd = qtdI;
	}

	// get
	public String getNome() {
		return nome;
	}

	public int getQtd() {
		return qtd;
	}

	@Override
	public void addQuantidade(int quantidade) {
		this.qtd += quantidade;

	}

	@Override
	public void removeQuantidade(int quantidade) {
		if (this.qtd >= quantidade) {
			qtd -= quantidade;
		} else {
			System.out.println("Quantidade insuficiente para ser removido.");

		}
	}

	@Override
	public void exibirInfo() {
		System.out.println("Nome do Produto: " + nome + " Quantidade: " + qtd);
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return 0;
	}

}