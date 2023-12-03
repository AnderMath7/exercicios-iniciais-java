import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

public class valor_pecas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da primeira peça: ");
		int cod1 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite o número de peças: ");
		int nun1 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite o valor da peça: ");
		double valor1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Digite o código da segunda peça: ");
		int cod2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite o número de peças: ");
		int nun2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite o valor da peça: ");
		double valor2 = sc.nextDouble();
		
		
		double preco = nun1 * valor1 + nun2 * valor2;
		System.out.println();
		System.out.println();
		
		System.out.println("Código da primeira peça: " + cod1);
		System.out.printf("Valor da segunda peça: R$ %.2f%n",valor1);
		System.out.println();
		System.out.println("Código da segunda peça: " + cod2);
		System.out.printf("Valor da segunda peça: R$ %.2f%n",valor2);
		System.out.println();
		System.out.printf("Valor total a pagar: R$ %.2f%n",preco);
		
		sc.close();
	}
}
