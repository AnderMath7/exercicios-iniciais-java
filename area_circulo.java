import java.util.Scanner;

/* Faça um programa para ler o valor do raio de um círculo, 
e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */

public class area_circulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio, pi = 3.14159, area;

		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2);

		System.out.println("Resultado: ");
		System.out.printf("Área = %.4f%n", area);

		sc.close();
	}
}
