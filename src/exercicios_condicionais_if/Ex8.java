package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("digite a idade da pessoa: ");
		idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}
		
		sc.close();
		
	}
}