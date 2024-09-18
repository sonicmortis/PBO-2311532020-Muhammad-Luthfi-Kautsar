package model;

public class Order {
	private int id;
    private int id_customer;
    private int id_service;
    private int id_user;
    private double total;
    private String tanggal;
    private String tanggal_selesai;
    private String status;
    private String status_pembayaran;

  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatusPembayaran() {
        return status_pembayaran;
    }
    public void setStatusPembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }
    public void tampilInfo() {
        System.out.println("ID Order: " + id);
        System.out.println("ID Customer: " + id_customer);
    }
}
