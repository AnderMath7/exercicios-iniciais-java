import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

public class areas_formas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três valores: ");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangulo = a*c/2;
		double circulo = 3.14159 * Math.pow(c,2);
		double trapezio = (a+b) * c / 2;
		double quadrado = Math.pow(b,2);
		double retangulo = a * b;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Áreas: ");
		System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
		System.out.printf("CÍRCULO: %.3f%n", circulo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETÂNGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}
