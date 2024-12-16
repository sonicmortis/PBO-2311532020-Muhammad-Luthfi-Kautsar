package com.informatika.data;

public class Mobil extends Kendaraan implements BahanBakar {
	
	public Mobil(String merk, String model, int tahunProduksi) {
		super(merk, model, tahunProduksi);
		// TODO Auto-generated constructor stub
	}

	public String jenisTransmisi;
	
	void nyalakanMesin() {
		// TODO Auto-generated method stub
		System.out.println("Nyalakan mesin: Tekan tombol start");
	}
	
	public String jenisBahanBakar() {
		return "Bensin";
	}
	
	public void fiturMobil() {
		System.out.println("Fitur mobil: Memiliki AC dan audio premium");
	}
	

}
