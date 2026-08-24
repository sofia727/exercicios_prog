package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota;
		
		System.out.println("digite uma nota de 0 a 100: ");
		nota = sc.nextDouble();
		
		if (nota >= 90) {
			System.out.println("Excelente.");
		} else if (nota >= 70) {
			System.out.println("Bom.");
		} else if (nota >= 50) {
			System.out.println("Regular.");
		} else {
			System.out.println("Insuficiente.");
		}
		
		sc.close();
		
	}
}