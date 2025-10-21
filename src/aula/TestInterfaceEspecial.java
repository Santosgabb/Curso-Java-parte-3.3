package aula;

public class TestInterfaceEspecial implements ExemploInterfaceEspecial {

	@Override
	public void metodoAbstrato() {
		//
		System.out.println("Implementação do metodo abstrato.");
	}

	public static void main(String []args) {
		TestInterfaceEspecial exe = new TestInterfaceEspecial();
		
		exe.metodoAbstrato();
		exe.metodoDefault();
		//permite ir na interface e utilizar o metodo que ha na outra Interface
		ExemploInterfaceEspecial.metodoStatic();
		
		
	}
	

}
