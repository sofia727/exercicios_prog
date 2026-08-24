package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("digite a idade do atleta: ");
		idade = sc.nextInt();
		
		if (idade <= 12) {
			System.out.println("Categoria: Infantil");
		} else if (idade <= 17) {
			System.out.println("Categoria: Juvenil");
		} else if (idade <= 39) {
			System.out.println("Categoria: Adulto");
		} else {
			System.out.println("Categoria: Master");
		}
		
		sc.close();
		
	}
}