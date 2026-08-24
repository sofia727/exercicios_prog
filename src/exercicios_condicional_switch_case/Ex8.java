package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sala;
		int filme;
		
		System.out.println("Escolha a sala:");
		System.out.println("1 - Sala 1");
		System.out.println("2 - Sala 2");
		sala = sc.nextInt();
		
		System.out.println("Escolha o filme de 1 a 3: ");
		filme = sc.nextInt();
		
		switch (sala) {
		case 1:
			switch (filme) {
			case 1:
				System.out.println("Aventura");
				break;
			case 2:
				System.out.println("Comédia");
				break;
			case 3:
				System.out.println("Ficção Científica");
				break;
			default:
				System.out.println("Filme inválido.");
			}
			break;
		case 2:
			switch (filme) {
			case 1:
				System.out.println("Terror");
				break;
			case 2:
				System.out.println("Romance");
				break;
			case 3:
				System.out.println("Animação");
				break;
			default:
				System.out.println("Filme inválido.");
			}
			break;
		default:
			System.out.println("Sala inválida.");
		}
		
		sc.close();
		
	}
}
