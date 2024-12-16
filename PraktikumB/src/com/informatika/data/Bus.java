package com.informatika.data;

public class Bus extends Kendaraan implements TransportasiUmum {
	
	String kelasBus;

	public Bus(String merk, String model, int tahunProduksi) {
		super(merk, model, tahunProduksi);
		// TODO Auto-generated constructor stub
	}

	void nyalakanMesin() {
		// TODO Auto-generated method stub
		System.out.println("Nyalakan mesin: putar kunci untuk menyalakan");
	}

	public String jenisBahanBakar() {
		// TODO Auto-generated method stub
		return "Solar";
	}

	public int kapasitasPenumpang() {
		// TODO Auto-generated method stub
		return 45;
	}
	
	public void fiturBus( ) {
		System.out.println("Fitur bus: dilengkapi dengan kursi nyaman dan fasilitas hiburan");
	}
	
	public class JadwalPerjalanan{
		String rute;
		String waktuBerangkat;
		
		public JadwalPerjalanan (String rute, String waktuBerangkat) {
			this.rute = rute;
			this.waktuBerangkat = waktuBerangkat;
		}
		
		public void tampilkanJadwal() {
			System.out.println("Jadwal Perjalanan: Rute " + rute + ", Waktu berangkat " + waktuBerangkat);
		}
	}
	
	

}
