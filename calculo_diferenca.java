import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

public class calculo_diferenca {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 números inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int diferenca = n1*n2 - n3*n4;
		
		
		System.out.println();
		
		System.out.println("A diferenca dos produdos de n1 com n2 e de n3 com n4 é: " + diferenca);
		
		sc.close();
	}
}
