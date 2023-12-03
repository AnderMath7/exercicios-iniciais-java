import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class calculo_salario {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do funcionário: ");
		int code = sc.nextInt();

		System.out.println();

		System.out.println("Digite as horas trabalhadas: ");
		double hour = sc.nextDouble();

		System.out.println();

		System.out.println("Digite o quanto o funcionário recebe por horas trabalhadas: ");
		double value = sc.nextDouble();

		System.out.println();

		double salario = hour * value;

		System.out.println("Código: " + code);
		System.out.printf("Salário: R$ %.2f%n", salario);

		sc.close();
	}
}
