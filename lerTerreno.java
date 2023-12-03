import java.util.Scanner;

/*Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular, 
 bem como o valor do metro quadrado do terreno.
 Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, 
 ambos com duas casas decimais.*/

public class lerTerreno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double largura, comprimento, area, valor, preco;
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.println();

		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.println();

		System.out.println("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();

		System.out.println();
		System.out.println();

		area = largura * comprimento;
		preco = area * valor;

		System.out.println("Resultado: ");
		System.out.printf("area: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", preco);

		sc.close();
	}
}
