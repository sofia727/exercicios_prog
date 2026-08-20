package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Número positivo");
		}
		
		sc.close();
		
	}
}