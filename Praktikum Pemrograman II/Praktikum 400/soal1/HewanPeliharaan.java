package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
	
	private String nama, ras;
	Scanner input = new Scanner(System.in);

	public HewanPeliharaan(String nama, String ras) {
		this.nama = nama;
		this.ras = ras;
	}

	public void display() {
		System.out.print("Nama hewan peliharaan: ");
		nama = input.nextLine();
		System.out.print("Ras: ");
		ras = input.nextLine();
		System.out.println("\nDetail Hewan Peliharaan:\nNama hewan peliharaanku adalah : " + nama 
							+ "\nDengan ras : " + ras);
	}
}
