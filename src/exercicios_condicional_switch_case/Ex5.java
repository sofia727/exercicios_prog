package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char conceito;
		
		System.out.println("Digite o conceito do aluno: ");
		conceito = sc.next().charAt(0);
		
		switch (conceito) {
		case 'A':
			System.out.println("Excelente");
			break;
		case 'B':
			System.out.println("Bom");
			break;
		case 'C':
			System.out.println("Regular");
			break;
		case 'D':
			System.out.println("Insuficiente");
			break;
		case 'F':
			System.out.println("Reprovado");
			break;
		default:
			System.out.println("Conceito inválido.");
		}
		
		sc.close();
		
	}
}
