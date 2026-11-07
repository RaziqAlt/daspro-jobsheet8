import java.util.Scanner;

public class Tugas1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai n = ");
        int n = sc.nextInt();

        if (n<1) {
            System.out.println("n harus minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i<=n; i++) {
                for (int j=1; j<=i; j++) {
                if(j>1) {
                    System.out.print("");
                }
                System.out.print(j);
                total++;
            }
            System.out.println();
        }
        System.out.println("Total Angka tercetak : " + total);
    }
    sc.close();
}
}
