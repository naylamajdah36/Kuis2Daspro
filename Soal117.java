// Nama: Nayla Majdah Fara Disa 
// NIM: 264107060080
// Kelas: 1D SIB 
//Paket Soal A

import java.util.Scanner;

public class Soal117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        if (jumlahMahasiswa <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }   
        double totalNilai = 0;
        double nilaiTertinggi = 0;
        double nilaiTerendah = 100;
        int lulus = 0;
        for (int j = 1; j <= jumlahMahasiswa; j++) {
                    int nilai;
                    do {
                        System.out.print("Nilai mahasiswa " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100. Silakan masukkan kembali.");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                    if (nilai > nilaiTertinggi) {
                        nilaiTertinggi = nilai;
                    }
                    if (nilai < nilaiTerendah) {
                        nilaiTerendah = nilai;
                    }
                }
    double rataRata = totalNilai / jumlahMahasiswa;
    System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    if (nilaiTertinggi > 0) {
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
    }
    if (nilaiTerendah < 100) {
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
      if (rataRata >= 60) {
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
    } else {
        System.out.println("Tidak ada mahasiswa yang lulus.");

    }
    
}
}
