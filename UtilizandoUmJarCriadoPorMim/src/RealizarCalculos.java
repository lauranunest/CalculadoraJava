import java.util.Scanner;

public class RealizarCalculos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------- CALCULADORA -------");
		System.out.println("Entre com o primeiro valor:");
		double x = sc.nextDouble();
		System.out.println("Entre com o segundo valor:");
		double y = sc.nextDouble();
		System.out.println("Entre com o opera��o ( + | - | * | / ):");
		String operacao = sc.next();
		
		Calculadora calculadora = new Calculadora();
		
		switch(operacao) {
		
			case "-":
				double resultado = calculadora.subtrair(x, y);
				System.out.println("O resultado da subtra��o �: " + resultado);
				break;
			case "+":
				resultado = calculadora.somar(x, y);
				System.out.println("O resultado da soma �: " + resultado);
				break;
			case "*":
				resultado = calculadora.multiplicar(x, y);
				System.out.println("O resultado da multiplica��o �: " + resultado);
				break;
			case "/":
				resultado = calculadora.dividir(x, y);
				System.out.println("O resultado da divis�o �: " + resultado);
				break;
		}
	}
}
