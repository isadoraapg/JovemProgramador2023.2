package Exercícios;
import java.util.Scanner;
public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//03) Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
				//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool
				//2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
				//solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado
				//for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO"e a quantidade de clientes que
				//abasteceram cada tipo de combustível, conforme exemplo
		
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int combustivel;
		
		System.out.println("Digite o número correspondente ao combustível abastecido sendo: \n1.Álcool \n2.Gasolina \n3.Diesel \n4.Finalizar");
		combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			}
			else if (combustivel == 2) {
				gasolina = gasolina + 1;
			}
			else if (combustivel == 3) {
				diesel = diesel + 1;
			}
			else {
				System.out.println("Número inválido");
			}
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
		
		
	}

}
