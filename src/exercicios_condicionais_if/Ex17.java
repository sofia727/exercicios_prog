package exercicios_condicionais_if;
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usuario, senha;
		
		System.out.println("digite o usuário: ");
		usuario = sc.next();
		System.out.println("digite a senha: ");
		senha = sc.next();
		
		if (!usuario.equals("admin")) {
			System.out.println("Usuário inexistente.");
		} else {
			if (senha.equals("1234")) {
				System.out.println("Acesso permitido.");
			} else {
				System.out.println("Senha incorreta.");
			}
		}
		
		sc.close();
		
	}
}