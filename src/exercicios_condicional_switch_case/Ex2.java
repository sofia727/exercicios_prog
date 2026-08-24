package exercicios_condicional_switch_case;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		int operacao;
		int resultado;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextInt();
		
		System.out.println("Escolha uma operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = sc.nextInt();
		
		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("Resultado: " + resultado);
			break;
		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Não é possível dividir por zero.");
			}
			break;
		default:
			System.out.println("Operação inválida.");
		}
		
		sc.close();
		
	}
}
