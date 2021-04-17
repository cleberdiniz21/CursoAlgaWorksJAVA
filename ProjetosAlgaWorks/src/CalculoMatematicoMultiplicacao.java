import java.util.Scanner;

public class CalculoMatematicoMultiplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cáculo de Multiplicação");
		System.out.println();
		System.out.print("Digite um numero: ");
		Double Valor = scanner.nextDouble();
		
		System.out.print("Digite outro numero: ");
		Double Valor_01 = scanner.nextDouble();
		
		Double Resultado = (Valor * Valor_01);
		
		System.out.println("Resultado: " + Resultado);
		
		scanner.close();
	}
}
