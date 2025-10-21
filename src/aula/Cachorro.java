package aula;

public class Cachorro implements Animal {

	// Metodo que foi sobrescrito
	// e n tinha corpo agr,
	// aqui temos que definir como
	// ele vai ser definido

	@Override
	public void fazerSom() {
		System.out.println("O cachrorro está latindo");

	}

	//Vai herdar da classe pai da extensao
	@Override
	public void respirar() {//toda criação de metodo abstrato qusndo for implementado em outra classe ele precisa ser public
				
		
	}

	
}
