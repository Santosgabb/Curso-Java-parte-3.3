package atividade;

public class Caminhao implements Veiculo {

	@Override
	public void iniciar() {
		System.out.println("O Caminhao esta auma velocidade de 60km-h");
		
	}

	@Override
	public void parar() {
		System.out.println("O Caminhão parou");
	}

}
