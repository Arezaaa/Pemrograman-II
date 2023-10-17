package praktikum2.soal2;

public class Kopi {
	String namaKopi;
	String ukuran;
	String pembeli;
	double harga;
	double pajak;
	
	public void info() {
		System.out.println("namaKopi Kopi: " + namaKopi
							+ "\nUkuran: " + ukuran
							+ "\nHarga: Rp. " + harga);
	}

	public String getPembeli() {
		return pembeli;
	}

	public void setPembeli(String pembeli) {
		this.pembeli = pembeli;
	}

	public double getPajak() {
		return harga*0.11;
	}

	public void setPajak(double pajak) {
		this.pajak = pajak;
	}
	
}