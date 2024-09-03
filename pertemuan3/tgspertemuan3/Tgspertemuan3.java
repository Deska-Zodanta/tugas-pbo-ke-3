/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pertemuan3.tgspertemuan3;

/**
 *
 * @author ASUS
 */
class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    String launching;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna, String launching) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
        this.launching = launching;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String thLaunch(){
        return launching;
    }
    public void setThLauch(String launching){
        this.launching = launching;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Model Mobil: " + model);
        System.out.println("Tahun Rangkaian: " + tahun);
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Akan Launching Tanggal: "+launching);
        System.out.println();
    }
    //method startEngine
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " No Problem");
    }
    //ubah warna
    public void pilihWarna(String warnaPilihan){
        setWarna(warnaPilihan);
        System.out.println("Warna pilihan konsumen " + warna);
    }
}

public class Tgspertemuan3 {
    public static void main(String[] args) {
        // Menciptakan dua objek dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Terios", 2020,"Hitam", "1 September");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2021, "Biru", "5 Mei");

        // Menampilkan informasi kedua mobil
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        
        
        //mengubah warna
        mobil1.pilihWarna("Hijau");
        mobil1.tampilkanInfo();
        mobil2.pilihWarna("Emas");
        mobil2.tampilkanInfo();
        //menampilkan method startEngine
        mobil1.startEngine();
        mobil2.startEngine();
    }
}