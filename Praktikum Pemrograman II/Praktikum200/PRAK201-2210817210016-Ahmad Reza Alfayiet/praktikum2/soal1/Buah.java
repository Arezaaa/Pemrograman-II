package praktikum2.soal1;

public class Buah {
	String nama;
	double berat,harga1,jumlah,harga2,diskon,harga3;
	
	public Buah(String nama, double berat, double harga1) {
		this.nama = nama;
		this.berat = berat;
		this.harga1 = harga1;
	}
	
	public double hargaSebelumDiskon() {
		return harga2 = (jumlah/berat)*harga1;
	}
	public double totalDiskon() {
		double kelipatan = jumlah/4;
		return diskon = 0.02*(4*harga1)*Math.floor(kelipatan);
	}
	public double hargaSetelahDiskon() {
		return harga2 - diskon;
	}
	
}