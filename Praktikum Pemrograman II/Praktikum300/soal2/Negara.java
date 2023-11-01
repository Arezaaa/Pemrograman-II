package soal2;

import java.util.HashMap;

public class Negara {
	String nama, jenisPemimpin, namaPemimpin;
	int tanggalMerdeka, bulanMerdeka, tahunMerdeka;
	
	public Negara(String nama, String jenisPemimpin, String namaPemimpin, int tanggalMerdeka, int bulanMerdeka,
			int tahunMerdeka) {	
		this.nama = nama;
		this.jenisPemimpin = jenisPemimpin;
		this.namaPemimpin = namaPemimpin;
		this.tanggalMerdeka = tanggalMerdeka;
		this.bulanMerdeka = bulanMerdeka;
		this.tahunMerdeka = tahunMerdeka;
	}
	
	public int getBulanMerdeka() {
		return bulanMerdeka;
	}

	public void InfoNegara() {
		
	HashMap<Integer, String> mapBulan = new HashMap<Integer, String>();
    mapBulan.put(1, "Januari");
    mapBulan.put(2, "Februari");
    mapBulan.put(3, "Maret");
    mapBulan.put(4, "April");
    mapBulan.put(5, "Mei");
    mapBulan.put(6, "Juni");
    mapBulan.put(7, "Juli");
    mapBulan.put(8, "Agustus");
    mapBulan.put(9, "September");
    mapBulan.put(10, "Oktober");
    mapBulan.put(11, "November");
    mapBulan.put(12, "Desember");
	
    if(jenisPemimpin.equals("presiden")) {
    	System.out.println("Negara " + nama + " mempunyai Presiden "+ "bernama "+ namaPemimpin);
    	} else if(jenisPemimpin.equals("perdana menteri")) {
    		System.out.println("Negara " + nama + " mempunyai Perdana Menteri "+ "bernama "+ namaPemimpin);
    	} else {
    		System.out.println("Negara " + nama + " mempunyai Raja "+ "bernama "+ namaPemimpin + "\n");
    	}
    if(!jenisPemimpin.equals("monarki")) {
    	System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalMerdeka + " " + mapBulan.get(getBulanMerdeka()) + " " + tahunMerdeka + "\n");
    	}
	}
}