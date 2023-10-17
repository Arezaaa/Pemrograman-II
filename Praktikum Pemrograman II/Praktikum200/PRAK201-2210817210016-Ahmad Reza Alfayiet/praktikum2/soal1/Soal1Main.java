package praktikum2.soal1;
import java.util.Scanner;

public class Soal1Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		Buah Apel = new Buah("Apel", 0.4, 7000.0);
		System.out.println("Nama Buah: " + Apel.nama
							+"\nBerat: " + Apel.berat
							+"\nHarga: " + Apel.harga1);
		
		System.out.print("Masukkan Jumlah Beli: ");
		Apel.jumlah = input.nextDouble();

		System.out.printf("\nJumlah Beli: %.1f kg \nHarga Sebelum Diskon: Rp%.2f", Apel.jumlah, Apel.hargaSebelumDiskon());
		System.out.printf("\nTotal Diskon: Rp%.2f", Apel.totalDiskon());
		System.out.printf("\nHarga Setelah Diskon: Rp%.2f\n", Apel.hargaSetelahDiskon());
		
		Buah Mangga = new Buah("Mangga", 0.2, 3500.0);
		System.out.println("\nNama Buah: " + Mangga.nama
							+"\nBerat: " + Mangga.berat
							+"\nHarga: " + Mangga.harga1);
		
		System.out.print("Masukkan Jumlah Beli: ");
		Mangga.jumlah = input.nextDouble();

		System.out.printf("\nJumlah Beli: %.1f kg \nHarga Sebelum Diskon: Rp%.2f", Mangga.jumlah, Mangga.hargaSebelumDiskon());
		System.out.printf("\nTotal Diskon: Rp%.2f", Mangga.totalDiskon());
		System.out.printf("\nHarga Setelah Diskon: Rp%.2f\n", Mangga.hargaSetelahDiskon());
		
		Buah Alpukat = new Buah("Alpukat", 0.25, 10000.0);
		System.out.println("\nNama Buah: " + Alpukat.nama
							+"\nBerat: " + Alpukat.berat
							+"\nHarga: " + Alpukat.harga1);
		
		System.out.print("Masukkan Jumlah Beli: ");
		Alpukat.jumlah = input.nextDouble();

		System.out.printf("\nJumlah Beli: %.1f kg \nHarga Sebelum Diskon: Rp%.2f", Alpukat.jumlah, Alpukat.hargaSebelumDiskon());
		System.out.printf("\nTotal Diskon: Rp%.2f", Alpukat.totalDiskon());
		System.out.printf("\nHarga Setelah Diskon: Rp%.2f\n", Alpukat.hargaSetelahDiskon());
		
	}
}