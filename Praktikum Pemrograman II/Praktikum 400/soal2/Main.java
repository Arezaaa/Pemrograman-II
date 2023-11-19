package soal2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pilih jenis hewan yang ingin diinputkan: \n1 = Kucing\n2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pilih = input.nextInt();input.nextLine();
		System.out.print("Nama hewan peliharaan: ");
		String nama = input.nextLine();
		System.out.print("Ras: ");
		String ras = input.nextLine();
		System.out.print("Warna Bulu: ");
		String warnaBulu = input.nextLine();
		
		if (pilih == 1) {
			Kucing kucing1 = new Kucing(nama, ras, warnaBulu);
			kucing1.displayDetailKucing();
		} else if (pilih == 2) {
			System.out.print("Kemampuan : ");
			String[] kemampuan = input.nextLine().split(", ");
			Anjing anjing1 = new Anjing(nama, ras, warnaBulu, kemampuan);
			anjing1.displayDetailAnjing();
		}
	}
}