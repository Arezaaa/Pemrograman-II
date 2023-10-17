package Praktikum100;

import java.util.Scanner;

public class PRAK103_2210817210016_AhmadRezaAlfayiet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int N = input.nextInt();
		int bilangan = input.nextInt(), i = 0;
		
		do {
			if (bilangan % 2 != 0) {
				System.out.print(bilangan + ((i<N+N-2)?", ":""));
			}
			i++;
			bilangan++;
		} while (i<N+N);		
	}
}