import java.util.Scanner;

public class MataKuliah {
    Scanner input = new Scanner(System.in);

    // attribute
    private String kode;
    private String namaMK;
    private double nilai;

    // Construktor
    MataKuliah(){
        setKode(kode);
        setNamaMK(namaMK);
        setNilai(nilai);
    }

    // method setter untuk inputan user
    //======================================================
    private void setKode(String kode) {
        System.out.print("Masukkan Kode : ");
        kode = input.nextLine();
        this.kode = kode;
    }

    private void setNamaMK(String namaMK) {
        System.out.print("Masukkan Nama Mata Kuliah : ");
        namaMK = input.nextLine();
        this.namaMK = namaMK;
    }

    private void setNilai(double nilai) {
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextDouble();
        this.nilai = nilai;
    }
    //======================================================

    // method getter untuk mendapatkan nilai
    //==============================
    public String getKode() {
        return kode;
    }

    public double getNilai() {
        return nilai;
    }

    public String getNamaMK() {
        return namaMK;
    }
    //==============================

    // method untuk mendapatkan nilai bentuk A,B,C,D,E
    public String getNilaiString(){
        if (nilai > 80) {
            return "A";
        } else if(nilai <= 80 && nilai > 60){
            return "B";
        } else if(nilai <= 60 && nilai > 50){
            return "C";
        } else if(nilai <= 50 && nilai > 40){
            return "D";
        } else {
            return "E";
        }
    }

}
