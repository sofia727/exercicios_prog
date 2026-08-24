package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero: ");
		num = sc.nextInt();
		
		if (num % 5 == 0) {
			System.out.println("O número é múltiplo de 5.");
		}
		
		sc.close();
		
	}
}