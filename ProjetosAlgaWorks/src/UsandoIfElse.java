import java.util.Scanner;

public class UsandoIfElse {
	
	static final Integer IDADE_MINIMA = 18;
	
	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("PROGRAMA");
		
		System.out.println();
		
		System.out.println("Calcular idade minima para tirar habilitação.");
		
		System.out.println();
		
		System.out.print("Qual a sua idade? ");
		
		Integer IDADE_MINIMA = scanner.nextInt();
		
		if (IDADE_MINIMA >= 18) {
			System.out.println("Pode tirar Habilitação!");
			
		}else {
				System.out.println("Não pode tirar habilitação!");
				
		scanner.close();
		
		}
	}
}


