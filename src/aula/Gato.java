package aula;

public class Gato implements Animal {

	@Override
	public void fazerSom() {
		System.out.println("O Gato faz miauuu");
	}

	@Override
	public void respirar() {
		//Vai herdar da classe pai da extensao
		System.out.println("Gato Respirando");
	}

}
