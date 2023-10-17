package Praktikum000;

import java.util.Scanner;

public class PRAK005_2210817210016_AhmadRezaAlfayiet {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan Makanan Favorit: ");
		String makanfav = input.nextLine();
		
		System.out.println("Masukkan Hobi: ");
		String hobiny = input.nextLine();
		
		System.out.println("Aku Suka Makan " + makanfav + ", dan Hobiku " + hobiny);
	}
}