package atividade;

public interface Veiculo {
	void iniciar();
	
	void parar();
	
	//permite q o obj criado c uma implementação da interface possa acessa-lo
	default void buzinar() {
		System.out.println("Buzinando");
	}
	
	
}
