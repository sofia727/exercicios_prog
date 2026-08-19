package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("digite um número inteiro: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Número par.");
		} else {
			System.out.println("Número ímpar.");
		}
		
		sc.close();
		
	}
}