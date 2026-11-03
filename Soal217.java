// Nama: Nayla Majdah Fara Disa 
// NIM: 264107060080
// Kelas: 1D SIB 
//Paket Soal A

import java.util.Scanner;
public class Soal217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kantin: ");
        int jumlahKantin = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        if (jumlahKantin <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah kantin dan jumlah hari harus lebih dari 0.");
            return;
        }
        double totalPenjualan = 0;
        double rataRataPenjualan = 0;
        int kantinTertinggi = 0;
        int hariSepi = 0;
        int totalSeluruhKantin = 0;
        while (true) {
            int[][] penjualan = new int[jumlahKantin][jumlahHari];
            for (int i = 0; i < jumlahKantin; i++) {
                for (int j = 0; j < jumlahHari; j++) {
                    do {
                        System.out.print("Masukkan penjualan kantin " + (i + 1) + " pada hari " + (j + 1) + ": ");
                        penjualan[i][j] = sc.nextInt();
                        if (penjualan[i][j] < 0) {
                            System.out.println("Penjualan tidak boleh negatif. Silakan masukkan kembali.");
                        }
                    } while (penjualan[i][j] < 0);
                }
            }
            totalPenjualan = 0;
            for (int i = 0; i < jumlahKantin; i++) {
                for (int j = 0; j < jumlahHari; j++) {
                    totalPenjualan += penjualan[i][j];
                }
            rataRataPenjualan = (double) totalPenjualan / (jumlahKantin * jumlahHari);
            System.out.println("Total penjualan seluruh kantin: " + totalPenjualan);
        }

    }
    
}
}
