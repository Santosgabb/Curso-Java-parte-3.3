
public class ExemploNormal {
	//metodos
	public double somar(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b)throws ArithmeticException {
		return a / b;
	}
	public static void main(String []args) {
		//criando obj da classe
		ExemploNormal calculadora = new ExemploNormal();
		
		//criando uma var local e chamando o metodo
		double resulSoma = calculadora.somar(3, 5);
		System.out.println("Soma: " + resulSoma);
		
		double resulSub = calculadora.subtrair(8, 9);
		System.out.println("Subtração: "  + resulSub);
		
		double resulMult = calculadora.multiplicar(5, 5);
		System.out.println("Multlicação: " + resulMult);
		
		double resultDiv = calculadora.dividir(100, 10);
		System.out.println("Divisão: " + resultDiv);
	}
}
