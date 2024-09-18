package model;

public class Service {
	private int id;
    private String jenis;
    private double harga;
    private boolean status;

    // Getter dan Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis)
 {
        this.jenis = jenis;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void tampilInfo() {
        System.out.println("ID Service: " + id);
        System.out.println("Jenis Service: " + jenis);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Status: " + (status ? "Tersedia" : "Tidak Tersedia"));
    }
}
