package Praktikum100;

import java.util.Scanner;

public class PRAK102_2210817210016_AhmadRezaAlfayiet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	
		int bilangan = input.nextInt(), i = 0;
		
		while(i <= 10) {
			i++;
			if (bilangan % 5 == 0) {
				System.out.print(bilangan / 5 - 1 + ((i<=10)?", ":""));
			}
			else {
				System.out.print(bilangan + ((i<=10)?", ":""));
			}
			bilangan++;
		}
	}
}