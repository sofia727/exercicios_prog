package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int categoria;
		int produto;
		
		System.out.println("Escolha a categoria:");
		System.out.println("1 - Informática");
		System.out.println("2 - Telefonia");
		categoria = sc.nextInt();
		
		System.out.println("Escolha o produto de 1 a 3: ");
		produto = sc.nextInt();
		
		switch (categoria) {
		case 1:
			switch (produto) {
			case 1:
				System.out.println("Notebook");
				break;
			case 2:
				System.out.println("Mouse");
				break;
			case 3:
				System.out.println("Teclado");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		case 2:
			switch (produto) {
			case 1:
				System.out.println("Smartphone");
				break;
			case 2:
				System.out.println("Carregador");
				break;
			case 3:
				System.out.println("Fone de ouvido");
				break;
			default:
				System.out.println("Produto inválido.");
			}
			break;
		default:
			System.out.println("Categoria inválida.");
		}
		
		sc.close();
		
	}
}
