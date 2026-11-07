import java.util.Scanner;

public class Tugas3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;

            for(int t=1; t<=jumlahToko; t++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + t + "- Jumlah Pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Tidak boleh negatif ulangi input!");
                    }
                } while (jumlahPelanggan <0 );
                
                int totalBarangToko= 0;
                for (int p=1; p<=jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("Pelanggan " + p + "- jumlah barang: ");
                        barang = sc.nextInt();
                        if(barang < 0) {
                            System.out.println("Tidak boleh negatif ulangi input!");
                        }
                    }while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + t + "- pelanggan : " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                totalSeluruh =+ totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = t;
                }
            }
            System.out.println("Total Barang seluruh toko : " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyal : " + tokoTerbanyak);
        }
        sc.close();
    }
}
