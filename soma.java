import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

public class soma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Digite um número inteiro: ");
		n1 = sc.nextInt();
		System.out.println();
		System.out.println("Digite outro número inteiro: ");
		n2 = sc.nextInt();

		soma = n1 + n2;

		System.out.println();
		System.out.println();

		System.out.println("Soma: " + soma);

		sc.close();
	}
}
