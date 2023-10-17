package praktikum2.soal3;

//Pada baris ini terjadi error karena nama classnya tidak sesuai, sehingga diganti menjadi Pegawai.
//public class Employee {
public class Pegawai {
	public String nama;
	
	//Pada baris ini terjadi error karena isi dari variabel asal tidak sesuai dengan tipe datanya yang char, sehingga perlu diubah menjadi String.
	//public char asal;
	public String asal;
	public String jabatan;
	
	//Pada baris ini diubah untuk menyesuaikan dengan output pada lembaran praktikum tanpa perlu  membuat baris kode baru.
	//public int umur;
	public int umur = 17;
	
	public String getNama() {
	return nama;
	}
	
	public String getAsal() {
	return asal;
	}
	
	//Pada baris ini terjadi error karena tipe datanya tidak cocok, sehingga perlu ditambahkan String jabatan di dalam kurung ().
	//public void setJabatan() {
	public void setJabatan(String jabatan) {
		
	//Pada baris ini terjadi error karena j tidak mengacu pada variabel yang ada, sehingga perlu diubah menjadi jabatan.
	//this.jabatan = j;
	this.jabatan = jabatan;
	}
}