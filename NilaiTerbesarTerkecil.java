package pertemuan6;

/**
 *
 * @author Afra Syavina
 */
import java.util.Scanner;

public class NilaiTerbesarTerkecil {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        // Meminta jumlah nilai mahasiswa yang akan dimasukkan
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahNilai = input.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahNilai];

        // Memasukkan nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        // Menentukan nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        // Menampilkan hasil
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("\nNilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);

    }
}

