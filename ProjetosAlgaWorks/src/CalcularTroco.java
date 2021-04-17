import java.util.Scanner;

public class CalcularTroco {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double ValorProduto = scanner.nextDouble();
		
		System.out.print("Digite dado pelo cliente: ");
		Double ValorDadoPeloCliente = scanner.nextDouble();
		
		Double Resultado = ValorDadoPeloCliente - ValorProduto;
		
		
		System.out.println("TROCO: " + Resultado + " Reais");
		
		scanner.close();
	}
}
