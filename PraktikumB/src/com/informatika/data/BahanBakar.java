package com.informatika.data;

public interface BahanBakar {
	String jenisBahanBakar();
	
	default void infoKonsumsi() {
		System.out.println("Info Konsumsi: Konsumsi Bahan Bakar tergantung kapasitas mesin");
	}

}
