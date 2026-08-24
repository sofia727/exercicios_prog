package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double media, frequencia;
		
		System.out.println("digite a média do aluno: ");
		media = sc.nextDouble();
		System.out.println("digite o percentual de frequência: ");
		frequencia = sc.nextDouble();
		
		if (media >= 7.0 && frequencia >= 75) {
			System.out.println("Aluno aprovado!");
			
			if (media >= 9.5) {
				System.out.println("Aluno aprovado com mérito.");
			}
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		sc.close();
		
	}
}