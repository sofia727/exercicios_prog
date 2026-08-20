package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		String sexo;
		
		System.out.println("digite a idade da pessoa: ");
		idade = sc.nextInt();
		System.out.println("digite o sexo (homem ou mulher): ");
		sexo = sc.next();
		
		if (idade < 0) {
			System.out.println("Ninguém pode ter idade menor que zero!");
		} else if (idade <= 12) {
			System.out.println("É uma criança.");
		} else if (idade <= 17) {
			System.out.println("É um adolescente.");
		} else {
			if (sexo.equals("homem")) {
				if (idade <= 64) {
					System.out.println("É um homem adulto.");
				} else {
					System.out.println("É um homem idoso.");
				}
			} else if (sexo.equals("mulher")) {
				if (idade <= 62) {
					System.out.println("É uma mulher adulta.");
				} else {
					System.out.println("É uma mulher idosa.");
				}
			} else {
				System.out.println("Sexo inválido.");
			}
		}
		
		sc.close();
		
	}
}