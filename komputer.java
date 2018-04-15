// class komputer

public class komputer {
	
	// variabel class
	
	private String merek; // deklarasi variabel class merek
	private String processor; // deklarasi variabel class processor
	private int harga; // deklarasi variabel class
	private String madein; // deklarasi variabel class madein

	// constructor method
	
	public komputer (String mrk, String procie, int price, String dibuat) {
		merek = mrk;
		processor = procie;
		harga = price;
		madein = dibuat;
	}

	// accessor method untuk mengakses data variabel class yang di setting "Private"
	
	// membuat accessor method untuk variabel merek
	public String getmerek() {
		return merek;
	}

	// membuat accessor method untuk variabel processor
	public String getprocessor() {
		return processor;
	}

	// membuat accessor method untuk variabel harga
	public int getharga() {
		return harga;
	}

	// membuat accessor method untuk variabel madein
	public String getdibuat() {
		return madein;
	}

	// mutator method untuk melakukan pengubahan data variabel
	
	public void setProcieUpdate (String procieupdate) {
		processor = procieupdate; // membuat mutator method untuk variabel processor
	}
	public void setHargaUpdate (int hargaupdate) {
		harga -= hargaupdate; // membuat mutator method untuk variabel harga
	}
}