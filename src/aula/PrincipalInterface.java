package aula;

public class PrincipalInterface {

	public static void main(String[] args) {
		//criação do obj
		Cachorro dog = new Cachorro();
		dog.fazerSom();
		
		//criação do obj
		Gato cat = new Gato();
		cat.fazerSom();
		
		System.out.println("Descrição da interface: "+cat.DESCRICAO);
		
		cat.respirar();
	}

}
