package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double temperatura;
		
		System.out.println("digite a temperatura em graus Celsius: ");
		temperatura = sc.nextDouble();
		
		if (temperatura >= 30) {
			System.out.println("Está calor.");
		} else {
			System.out.println("A temperatura está agradável.");
		}
		
		sc.close();
		
	}
}