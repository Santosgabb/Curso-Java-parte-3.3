package aula;

public interface ExemploInterfaceEspecial {
	//Só é possivel 3 metodos em uma interface
	
	//metodo abstrato pois nao possui um corpo
	void metodoAbstrato();
	
	//metodo default
	default void metodoDefault() {
		System.out.println("Este é um metodo Default em uma interface");
	}
	
	//metodo static
	static void metodoStatic() {
		System.out.println("Est é um metodo static na interface.");
	}

}
