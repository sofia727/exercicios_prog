package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("digite o peso (kg): ");
		peso = sc.nextDouble();
		System.out.println("digite a altura (m): ");
		altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("IMC calculado: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza / Abaixo do peso.");
		} else if (imc < 25.0) {
			System.out.println("Peso normal / Saudável.");
		} else if (imc < 30.0) {
			System.out.println("Sobrepeso (Pré-obesidade).");
		} else if (imc < 35.0) {
			System.out.println("Obesidade Grau I.");
		} else if (imc < 40.0) {
			System.out.println("Obesidade Grau II.");
		} else {
			System.out.println("Obesidade Grau III (Grave).");
		}
		
		sc.close();
		
	}
}