import java.util.Scanner;

public class Perbandingan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));

        in.close();
    }
}
