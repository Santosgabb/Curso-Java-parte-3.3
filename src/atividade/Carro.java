package atividade;

public class Carro implements Veiculo  {

	// Metodos da Interface,so nao o static que ele é padrao
	@Override
	public void iniciar() {
		System.out.println("o carro esta com velocidade de 50km-h ");
	}

	@Override
	public void parar() {
		System.out.println("O carro parrou");
	}

	
}
