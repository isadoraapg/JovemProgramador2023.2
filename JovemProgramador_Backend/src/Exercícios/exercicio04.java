package Exercícios;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//04) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
		//inclusive X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		
		
		for (int i = 1; i <=X ; i++) {
			
			//par:
			//if(i % 2 == 0)
			
			
			//impar:
			if(i % 2 != 0) {
			System.out.println(i);
		}
		
		} 
		
		sc.close();
		
	}

}
