package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int curso;
		int disciplina;
		
		System.out.println("Escolha o curso:");
		System.out.println("1 - Informática");
		System.out.println("2 - Administração");
		System.out.println("3 - Engenharia");
		curso = sc.nextInt();
		
		System.out.println("Escolha a disciplina de 1 a 3: ");
		disciplina = sc.nextInt();
		
		switch (curso) {
		case 1:
			switch (disciplina) {
			case 1:
				System.out.println("Programação");
				break;
			case 2:
				System.out.println("Banco de Dados");
				break;
			case 3:
				System.out.println("Redes");
				break;
			default:
				System.out.println("Disciplina inválida.");
			}
			break;
		case 2:
			switch (disciplina) {
			case 1:
				System.out.println("Marketing");
				break;
			case 2:
				System.out.println("Economia");
				break;
			case 3:
				System.out.println("Contabilidade");
				break;
			default:
				System.out.println("Disciplina inválida.");
			}
			break;
		case 3:
			switch (disciplina) {
			case 1:
				System.out.println("Cálculo");
				break;
			case 2:
				System.out.println("Física");
				break;
			case 3:
				System.out.println("Desenho Técnico");
				break;
			default:
				System.out.println("Disciplina inválida.");
			}
			break;
		default:
			System.out.println("Curso inválido.");
		}
		
		sc.close();
		
	}
}
