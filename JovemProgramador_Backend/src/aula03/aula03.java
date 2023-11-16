package aula03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//REVISÃO VETORES, MATRIZES E POO.
		//Git, Data, Leitura e Escrita de Arquivos, Interfaces, Tratamento de Exceções, Servlet e JSP, Spring MVC, Spring Boot, Anotações, Hibernate JSP. 
		
		//VETOR
		
//		int[] numeros = {1, 2, 3, 4, 5, 6};
		
//		System.out.println(numeros);
//		Random random = new Random();
		
//		double[] valores;
//		valores = new double[5];
		
//		valores[0] = 5.0;
//		valores[1] = 6.0;
		
//		int[] = numeros2 = new int[5];
		
//		for (int i = 0; i < numeros2; i++) {
//			numeros2[i] = random.nextInt(10);
//		}
//		System.out.println(numeros);
		
//		for(int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		
		
		
		
		
		//ARRAY
		
//		int[] numeros = {1, 2, 3, 4, 5, 6};
//		int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
		
//		System.out.println(copiaNumeros);
//		System.out.println(Arrays.toString(copiaNumeros));
		
//		int[] numeros2 = new int[5];
//		Arrays.fill(numeros2, 5);
//		System.out.println(Arrays.toString(numeros2));
		
//		int[] numeros3 = {5, 6, 2, 1, 7};
//		Arrays.sort(numeros3);
//		System.out.println(Arrays.toString(numeros3));
		
		
		//fazer um programa p ler um num int N e altura de N pessoas. armazene N alturas em um so vetor. em seguida mostre a altura media das pessoas.
		
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Quantas pessoas?");
//		int N = sc.nextInt();
		
//		double[] altura = new double[N];
//		double soma = 0;
		
//		for(int i = 0; i < N; i++) {
//			System.out.println("Digite a altura(cm) da pessoa " + (i+1));
//			altura[i] = sc.nextDouble();
//			soma += altura[i];
//		}
		
//		double media = soma/altura.length;
//		System.out.println("Alturas digitadas: " + Arrays.toString(altura));
//		System.out.println("Media de alturas: " + media);
		
		//sc.close();
		
		
		
		
		
		//Matriz
		
//			int[] [] matriz = {{1, 2, 3}, {4, 5, 6}};
			
//			for(int i = 0; i < matriz.length; i++) {     //pega a posição de linha
//				for (int j = 0; j < matriz[0].length; j++) {    //percorre a coluna
//					System.out.println(matriz[i][j]);
//				}
//			}
		
		
		
//		int[][] matriz2 = new int[3][3];
//		matriz2[1][2] = 5;
//		System.out.println(matriz2[1][2]);
				
//		System.out.println(Arrays.toString(matriz2));
		
//		for(int i =0; i <matriz2.length; i++) {
//			System.out.println(Arrays.toString(matriz2[i]));
//		}
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite a ordem da matriz: ");
//		int n = sc.nextInt();
//		
//		int[][] matriz = new int[n][n];
//		
//		for(int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[0].length; j++) {
//				System.out.println("Digite o valor da linha " + (i+1) + " e coluna " + (j+1));
//				matriz[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i = 0; i < matriz.length; i++) {
//			System.out.println(Arrays.toString(matriz[i]));
//		}
//		
//		System.out.println("Diagonal principal:");
//		for(int i = 0; i < matriz.length; i++) {
//			System.out.print(matriz[i][i] + " ");
//		}
//		
//		
//		//Numeros negativos
//		int negativos = 0;
//		
//		for(int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[0].length; j++) {
//				if (matriz[i][j] < 0) {
//					negativos += 1;
//				}
//			}
//		}
//		
//		System.out.println("Qnt de num negativos: " + negativos);
		
		
		
		
		
		
		
		//LISTA ENCADEADA
		
		
//		List<String> lista = new ArrayList<>();
//		
//		lista.add("João");
//		lista.add("Fabio");
//		lista.add("Maria");
//		
//		System.out.println(lista);
//		
//		for(String list : lista) {
//			System.out.println(list);
//		}
//		
//		
//		//remover algo da lista
//		lista.remove("Maria");
//		System.out.println(lista);
//		System.out.println(lista.size());
//		
//		lista.add("Maria");
//		lista.remove(2);
//		System.out.println(lista);
//		
//		
//		//buscar uma posição específica
//		lista.get(1);
//		System.out.println(lista.get(1));
//		
//		
//		lista.add("Maria");
//		System.out.println(lista);
//		//remover da lista se a primeira letra (posição 0) for M
//		lista.removeIf(i -> i.charAt(0) == 'M');
//		System.out.println(lista);
//		
//		
//		
//		List<Integer> lista2 = new ArrayList<>();
//		
//		lista2.add(2);
//		lista2.add(3);
//		lista2.add(4);
//		lista2.add(5);
//		lista2.add(6);
//		lista2.add(7);
//		
//		System.out.println(lista2);
//		lista2.remove(4);   //remove a 4ª posição
//		System.out.println(lista2);
//		lista2.remove(Integer.valueOf(4)); //remove o numero 4
//		System.out.println(lista2);
//		
//		lista2.removeIf(i -> i>4);
//		System.out.println(lista2);
//		
//		lista2.add(1, 55);
//		System.out.println(lista2);
//		
//		//limpa a lista
//		lista2.clear();
//		System.out.println(lista2);
//		
//		boolean vazia = lista2.isEmpty();
//		System.out.println(vazia);
//
//		
//		
//		//pegar a ultima posição
//		lista2.add(20);
//		lista2.add(30);
//		lista2.add(40);
//		lista2.add(50);
//		int ultimo = lista2.get(lista.size()+1);
//		System.out.println(ultimo);
		
		
		
		
		//Set = nao permite elementos repetidos
		//MAP = chave específica
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		while(true) {
			System.out.println("\nMenu");
			System.out.println("1- Adicionar item");
			System.out.println("2- Remover item");
			System.out.println("3- Exibir lista");
			System.out.println("4- Sair do programa");
			System.out.println("Escolha uma opção: ");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
			case 1:
				System.out.println("Digte o nome do item: ");
				String item = sc.nextLine();
				lista.add(item);
				System.out.println("Item adicionado");
				break;
				
			case 2:
				System.out.println("Itens da lista: ");
				for(int i=0; i<lista.size(); i++) {
					System.out.println("Item " + i + " " + lista.get(i));
				}
				System.out.println("Digite o item a ser removido: ");
				int itemRemover = sc.nextInt();
				
				if(itemRemover < lista.size()) {
					lista.remove(itemRemover);
					System.out.println("Item removido");
				}else {
					System.out.println("Item não existe");
				}
				break;
				
			case 3:
				System.out.println("Itens da lista: ");
				for(int i=0; i<lista.size(); i++) {
					System.out.println("Item " + i + " " + lista.get(i));
				}
				break;
				
			case 4:
				System.out.println("Saindo do programa");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
