import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    Scanner input = new Scanner(System.in);
    ArrayList<MataKuliah> mataKuliah = new ArrayList<>();

    // attribute
    private String nama;
    private String nim;

    // contructor
    Mahasiswa (){
        setNama(nama);
        setNim(nim);
    }

    // method untuk menyetel arraylist matakuliah dalam mahasiswa
    public void setMataKuliah(ArrayList<MataKuliah> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    // method setter untuk inputan user
    //===========================================
    private void setNama(String nama) {
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        this.nama = nama;
    }

    private void setNim(String nim) {
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        this.nim = nim;
    }
    //===========================================

    // method untuk menampilkan data
    public void displayInfo(){
        System.out.println("\n==========================================================");
        System.out.println("\t\t\tKHS MAHASISWA");
        System.out.println("Nama Mahasiswa \t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("-----------------------------------------------------");
        System.out.println("|     Kode      |      Nama Matakuliah      | Nilai |");
        System.out.println("-----------------------------------------------------");
        for (MataKuliah mk : mataKuliah) {
            System.out.printf("| %-13s | %-25s |   %-3s |\n",mk.getKode(),mk.getNamaMK(),mk.getNilaiString());
        }
        System.out.println("-----------------------------------------------------");
    }

}

