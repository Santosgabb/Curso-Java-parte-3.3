package aula;

public interface Animal extends SerVivo {// criação da Interface
	public static final String DESCRICAO = "Todo animal é um ser vivo importante ";

	// criação de metodo abstrato q nao possui corpo e obriga vc a declarar como ele
	// vai ser onde essa classe tiver sendo implementada
	public abstract void fazerSom();// declaração correta de um metodo abstrato
	
	//codigo mais limpo mas faz a mesma função 
	//void fazerSom();
//	String DESCRICAO = "Todo animal ";
}
