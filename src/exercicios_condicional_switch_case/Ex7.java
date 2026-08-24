package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int setor;
		int produto;
		
		System.out.println("Escolha o setor:");
		System.out.println("1 - Bebidas");
		System.out.println("2 - Lanches");
		setor = sc.nextInt();
		
		System.out.println("Escolha o produto de 1 a 3: ");
		produto = sc.nextInt();
		
		switch (setor) {
		case 1:
			switch (produto) {
			case 1:
				System.out.println("Água");
				break;
			case 2:
				System.out.println("Refrigerante");
				break;
			case 3:
				System.out.println("Suco");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		case 2:
			switch (produto) {
			case 1:
				System.out.println("Cachorro-quente");
				break;
			case 2:
				System.out.println("Hambúrguer");
				break;
			case 3:
				System.out.println("Pizza");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		default:
			System.out.println("Setor inválido.");
		}
		
		sc.close();
		
	}
}
