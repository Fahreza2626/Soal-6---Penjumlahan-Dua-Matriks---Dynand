import java.util.Scanner;
public class ukl{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nInput elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("M1[" + i + "][" + j + "] = ");
                matriks1[i][j] = input.nextInt();
            }
        }

        System.out.println("\nInput elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("M2[" + i + "][" + j + "] = ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // Penjumlahan matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("\nHasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}