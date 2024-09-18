package model;

public class Costumer {
		private int id;
	    private String nama;
	    private String alamat;
	    private String nomorHP;

	    // Getter dan Setter
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getNama() {
	        return nama;
	    }
	    public void setNama(String nama) {
	        this.nama = nama;
	    }
	    public String getAlamat() {
	        return alamat;
	    }
	    public void setAlamat(String alamat) {
	        this.alamat = alamat;
	    }
	    public String getNomorHP() {
	        return nomorHP;
	    }
	    public void setNomorHP(String nomorHP) {
	        this.nomorHP = nomorHP;
	    }
	    public void tampilInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Nama: " + nama);
	        System.out.println("Alamat: " + alamat);
	        System.out.println("Nomor HP: " + nomorHP);
	    }
}
