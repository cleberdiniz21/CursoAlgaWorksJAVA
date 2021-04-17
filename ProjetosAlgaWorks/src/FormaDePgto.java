import java.util.Scanner;

public class FormaDePgto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Qual o valor do Produto? ");
		Double ValorProduto = scanner.nextDouble();
		
		System.out.print("Pagamento a prazo ou à vista: [1] para a vista ou [2] a prazo. ");
		Integer FormaDePgto = scanner.nextInt();
		
		Double acrescimo = ValorProduto * 10 /100;
		
		if (FormaDePgto == 1) {
			System.out.println("Valor a vista R$ " +  ValorProduto);
			
		} else  {
				System.out.println("Valor a prazo R$ " + (ValorProduto + acrescimo));	
				
		
			
		scanner.close();
		}
	}
}
