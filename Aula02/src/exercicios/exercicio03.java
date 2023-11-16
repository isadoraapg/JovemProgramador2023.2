package exercicios;

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
		
		
		int opcao;
		Scanner leitor = new Scanner(System.in);
		
		
		do {
			System.out.println("Posto de Gasolina");
			System.out.println("1 - álcool");
			System.out.println("2 - gasolina");
			System.out.println("3 - diesel");
			System.out.println("4 - fim");	

			System.out.print("Digite uma opção: ");
			opcao=leitor.nextInt(); 
			
		if(opcao == 1) {
			System.out.println("Muito obrigado");
			
		}
		else if ( opcao ==2) {
			System.out.println("Muito obrigado");
	
		}
		else if ( opcao == 3) {
			System.out.println("Muito obrigado");
		
		}
		else if (opcao == 4) {
			
			System.out.println("Fim");
			
		}
			
		else {
			System.out.println("Opção inválida.");
		}
		
		
		System.out.println("-----");
		
		
		
	}while( opcao != 4 );
		
		
		
		
		
		
		
	}

}
