/* menukomputer, ini adalah program utama
yang akan digunakan untuk memanggil variabel class pada file komputer.java */
import java.util.*;

public class menukomputer {
	public static void main (String [] args) {
		
		// constructor  method
		komputer pc1 = new komputer("ASUS", "AMD", 15000000, "Taiwan"); // objek menukomputer yang memberi nilai objek komputer didalam class menu komputer melalui constructor method
		
		// menampilkan data yang diprivate pada class file komputer.java
		System.out.println(" Data yang diakses dengan Accessor Method ");
		System.out.println(" Nama merek      : " + pc1.getmerek()); // menampilkan private data variabel merek
		System.out.println(" Nama Processor  : " + pc1.getprocessor()); // menampilkan private data variabel processor
		System.out.println(" Harga Perangkat : Rp " + pc1.getharga()); // menampilkan private data variabel harga
		System.out.println(" Dibuat di       : " + pc1.getdibuat()); // menampilkan private data variabel made in

		// menampilkan data variabel pada mutator method
		pc1.setProcieUpdate("Intel");
		pc1.setHargaUpdate(1500000); // nilai harga awal 15.000.000 akan dikurang 1.500.000
		System.out.println("\n Data yang diupdate dengan Mutator Method ");
		System.out.println(" Harga Update     : Rp " + pc1.getharga()); // menampilkan hasil data yang telah diubah (15.000.000 - 1.500.000 = 13.500.000)
		System.out.println(" Processor Update : " + pc1.getprocessor()); // menampilkan hasil data yang telah diubah (dari AMD menjadi Intel)
	}
}