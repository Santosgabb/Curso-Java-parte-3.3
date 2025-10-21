package exemplointerface;

public class CalculadoraInterfaceFuncional {

	public static void main(String[] args) {
		//Usando expressao lambda
		
		//declara a interface e usa a lamda
		Calculadora soma = (a,b) -> a+b;
		System.out.println("Soma: "  + soma.calcular(10, 5.8));
		
		Calculadora sub = (a,b) -> a-b;
		System.out.println("Subtração: " + sub.calcular(10, 7));
		Calculadora div = (a,b) -> a/b;
		System.out.println("Divisão: " + div.calcular(25, 5));
		Calculadora mult = (a,b) -> a*b;
		System.out.println("Multiplicação: " + mult.calcular(5, 10));
		
		//AtividadeDois
		Calculadora po = (a,b ) -> Math.pow(a,b);
		Calculadora raiz = (a,b) -> Math.sqrt(a+b);
		
		System.out.println("Potencia: " + po.calcular(2, 3));
		System.out.println("Raiz: " + raiz.calcular(20, 5));
	}

}
