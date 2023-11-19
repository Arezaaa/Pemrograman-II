package soal2;

public abstract class HewanPeliharaan {
	
	private String nama, ras;

	public HewanPeliharaan(String nama, String ras) {
		this.nama = nama;
		this.ras = ras;
	}

	public void display() {
		System.out.println("\nDetail Hewan Peliharaan:\nNama hewan peliharaanku adalah : " + nama 
							+ "\nDengan ras : " + ras);
	}
}