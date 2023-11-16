package Exercícios;
import java.util.Scanner;
public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//08) Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro N:");
		int n = sc.nextInt();
		
		int fatorial = 1;
		for (int i=1; i<=n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
		
		
		
		
	}

}
