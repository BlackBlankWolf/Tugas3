import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiwa = new ArrayList<>();

        //variabel
        boolean nextMhs = true;

        // kode perulangan untuk membuat object mahasiswa dan matakuliah setelah itu disimpan di dalam arraylist
        while (nextMhs) {
            System.out.println("\tMASUKKAN DATA MAHASISWA");
            System.out.println("---------------------------------------");
            Mahasiswa mhs = new Mahasiswa();
            ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();

            boolean nextMk = true;
            System.out.println("\n\tMASUKKAN DATA MATA KULIAH");
            System.out.println("---------------------------------------");

            while (nextMk) {
                MataKuliah mataKuliah = new MataKuliah();
                daftarMataKuliah.add(mataKuliah);
                mhs.setMataKuliah(daftarMataKuliah);

                System.out.print("tambah Mata Kuliah lagi? (y/t) ");
                String tambah = input.nextLine();
                System.out.print("\n");
                
                if (tambah.equalsIgnoreCase("t")) {
                    nextMk = false;
                }
            }

            daftarMahasiwa.add(mhs);
            System.out.print("tambah Mahasiswa lagi? (y/t) ");
            String tambah = input.nextLine();
            System.out.print("\n");

            if (tambah.equalsIgnoreCase("t")) {
                nextMhs = false;
                input.close();
            }
        }


        // kode perulangan untuk menampilkan data dengan memanggil method displayInfo()
        for(Mahasiswa mhs : daftarMahasiwa){
            mhs.displayInfo();
        }

    }
}
