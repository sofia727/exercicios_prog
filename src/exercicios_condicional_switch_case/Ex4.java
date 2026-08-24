package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo;
		
		System.out.println("Cardápio:");
		System.out.println("1 - Cachorro-quente");
		System.out.println("2 - Hambúrguer");
		System.out.println("3 - Pizza");
		System.out.println("4 - Refrigerante");
		System.out.println("5 - Suco");
		
		System.out.println("Digite o código do produto: ");
		codigo = sc.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Produto escolhido: Cachorro-quente");
			break;
		case 2:
			System.out.println("Produto escolhido: Hambúrguer");
			break;
		case 3:
			System.out.println("Produto escolhido: Pizza");
			break;
		case 4:
			System.out.println("Produto escolhido: Refrigerante");
			break;
		case 5:
			System.out.println("Produto escolhido: Suco");
			break;
		default:
			System.out.println("Produto inválido.");
		}
		
		sc.close();
		
	}
}
