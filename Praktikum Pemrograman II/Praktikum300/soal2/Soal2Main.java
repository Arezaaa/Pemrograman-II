package soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal2Main {

	public static void main(String[] args) {
		
		LinkedList<Negara> listNegara = new LinkedList<Negara>();
		
		Scanner input = new Scanner(System.in);
		int jumlah = input.nextInt(); input.nextLine();
		
		for (int i=0; i<jumlah; i++) {
		
			String nama = input.nextLine();
			String jenisPemimpin = input.nextLine();
			String namaPemimpin = input.nextLine();
			int tanggalMerdeka=0, bulanMerdeka=0, tahunMerdeka=0;
			if (!jenisPemimpin.equals("monarki")) {
				tanggalMerdeka = input.nextInt(); input.nextLine();
				bulanMerdeka = input.nextInt(); input.nextLine();
				tahunMerdeka = input.nextInt(); input.nextLine();
			}
			Negara negara = new Negara(nama, jenisPemimpin, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka);
			listNegara.add(negara);
		}
		
		for (int i=0; i<listNegara.size(); i++) {
			Negara j = listNegara.get(i);
			j.InfoNegara();
		}
	}
}