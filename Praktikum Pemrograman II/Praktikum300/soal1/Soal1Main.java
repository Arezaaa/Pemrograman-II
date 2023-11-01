package soal1;

import java.util.Scanner;

public class Soal1Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Dadu dadu = new Dadu();
		dadu.jumlahBaris = input.nextInt();
		
		dadu.acakNilai();
	}
}