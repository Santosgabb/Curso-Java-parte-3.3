package atividade;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		//Criando obj
		Carro car  = new Carro();
		car.iniciar();
		car.parar();
		car.buzinar();
		
		Caminhao cam = new Caminhao();
		cam.iniciar();
		cam.parar();
		cam.buzinar();// utilizando o metodo static
		
		
		
	}

}
