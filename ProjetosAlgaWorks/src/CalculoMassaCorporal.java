import java.util.Scanner;

public class CalculoMassaCorporal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cáculo da Massa Corporal");
		
		System.out.println();
		System.out.println("Digite seu peso em Quilogramas!!!");
		System.out.println();
		
		System.out.print("Qual o seu peso?: ");
		Double Valor = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double Valor_01 = scanner.nextDouble();
		
		Double Resultado = Valor / (Valor_01 * Valor_01);
		
		System.out.println("Resultado: " + Resultado);
		
		scanner.close();

	}

}
