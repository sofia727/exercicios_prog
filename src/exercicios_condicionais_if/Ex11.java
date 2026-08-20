package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double media;
		
		System.out.println("digite a média final do aluno: ");
		media = sc.nextDouble();
		
		if (media >= 9.0) {
			System.out.println("Conceito: A");
		} else if (media >= 7.0) {
			System.out.println("Conceito: B");
		} else if (media >= 5.0) {
			System.out.println("Conceito: C");
		} else {
			System.out.println("Conceito: D");
		}
		
		sc.close();
		
	}
}