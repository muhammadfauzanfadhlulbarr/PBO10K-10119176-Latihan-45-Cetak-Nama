import java.util.Scanner;
/**
 * Latihan45
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Cetak Nama
 */
public class PBO10k10119176Latihan45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();
        System.out.print("Mau cetak nama berapa kali ? : ");
        int jmlCetak = scanner.nextInt();
        printer.cetak(nama, jmlCetak);

        
    }
}
