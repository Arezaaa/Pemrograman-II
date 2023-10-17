package Praktikum100;

import java.util.Scanner;

public class PRAK101_2210817210016_AhmadRezaAlfayiet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Masukkan Nama Lengkap: ");
		String nama = input.nextLine();
		
		System.out.println("Masukkan Tempat Lahir: ");
		String asal = input.nextLine();
		
		System.out.println("Masukkan Tanggal Lahir: ");
		int hari = input.nextInt();
		
		System.out.println("Masukkan Bulan lahir: ");
		int bulan1 = input.nextInt();
		String [] bulan2 = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
		
		System.out.println("Masukkan Tahun Lahir: ");
		int tahun = input.nextInt();
		
		System.out.println("Masukkan Tinggi Badan: ");
		int tinggi = input.nextInt();
		
		System.out.println("Masukkan Berat Badan: ");
		double berat = input.nextDouble();
	
		System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d %nTinggi Badan %d cm dan Berat Badan %.2f kilogram", nama, asal, hari, bulan2[bulan1-1], tahun, tinggi, berat);
	}
}